/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.saga.statelang.parser.impl;

import io.seata.common.util.StringUtils;
import io.seata.saga.statelang.domain.State;
import io.seata.saga.statelang.domain.StateMachine;
import io.seata.saga.statelang.domain.impl.AbstractTaskState;
import io.seata.saga.statelang.domain.impl.BaseState;
import io.seata.saga.statelang.domain.impl.StateMachineImpl;
import io.seata.saga.statelang.parser.StateMachineParser;
import io.seata.saga.statelang.parser.StateParser;
import io.seata.saga.statelang.parser.StateParserFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import java.util.Map;

/**
 * State machine language parser
 * @author lorne.cl
 */
public class StateMachineParserImpl implements StateMachineParser {

    private Gson gson = new GsonBuilder().create();

    @Override
    public StateMachine parse(String json) {

        Map<String, Object> node = parseMap(json);
        StateMachineImpl stateMachine = new StateMachineImpl();
        stateMachine.setName((String)node.get("Name"));
        stateMachine.setComment((String)node.get("Comment"));
        stateMachine.setVersion((String)node.get("Version"));
        stateMachine.setStartAt((String)node.get("StartAt"));
        if("false".equals(node.get("IsPersist"))){
            stateMachine.setPersist(false);
        }

        Map<String, Object> statesNode = (Map<String, Object>)node.get("States");
        for(String stateName : statesNode.keySet()){
            Map<String, Object> stateNode = (Map<String, Object>)statesNode.get(stateName);
            String stateType = (String)stateNode.get("Type");
            StateParser stateParser = StateParserFactory.getStateParser(stateType);
            if(stateParser == null){
                throw new IllegalArgumentException("State Type ["+stateType+"] is not support");
            }
            State state = stateParser.parse(stateNode);
            if(state instanceof BaseState){
                ((BaseState)state).setName(stateName);
            }

            if(stateMachine.getState(stateName) != null){
                throw new IllegalArgumentException("State[name:"+stateName+"] is already exists");
            }
            stateMachine.putState(stateName, state);
        }

        //处理state的isForCompensation|isForUpdate类型
        Map<String, State> stateMap = stateMachine.getStates();
        for(String name : stateMap.keySet()){
            State state = stateMap.get(name);
            if(state instanceof AbstractTaskState){
                AbstractTaskState taskState = (AbstractTaskState) state;
                if(StringUtils.isNotBlank(taskState.getCompensateState())){
                    taskState.setForUpdate(true);

                    State compState = stateMap.get(taskState.getCompensateState());
                    if(compState != null && compState instanceof AbstractTaskState){
                        ((AbstractTaskState)compState).setForCompensation(true);
                    }
                }
            }
        }
        return stateMachine;
    }

    public Map<String, Object> parseMap(String json) {
        if (json != null) {
            json = json.trim();
            if (json.startsWith("{")) {
                return this.gson.fromJson(json, Map.class);
            }
        }
        throw new IllegalArgumentException("Cannot parse JSON");
    }

    @SuppressWarnings("unchecked")
    public List<Object> parseList(String json) {
        if (json != null) {
            json = json.trim();
            if (json.startsWith("[")) {
                return this.gson.fromJson(json, List.class);
            }
        }
        throw new IllegalArgumentException("Cannot parse JSON");
    }
}