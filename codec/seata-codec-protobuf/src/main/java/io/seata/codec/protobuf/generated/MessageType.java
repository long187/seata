// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messageType.proto

package io.seata.codec.protobuf.generated;

public final class MessageType {
  private MessageType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021messageType.proto\022\032io.seata.protocol.p" +
      "rotobuf*\372\005\n\020MessageTypeProto\022\031\n\025TYPE_GLO" +
      "BAL_PRESERVED\020\000\022\025\n\021TYPE_GLOBAL_BEGIN\020\001\022\034" +
      "\n\030TYPE_GLOBAL_BEGIN_RESULT\020\002\022\026\n\022TYPE_GLO" +
      "BAL_COMMIT\020\007\022\035\n\031TYPE_GLOBAL_COMMIT_RESUL" +
      "T\020\010\022\030\n\024TYPE_GLOBAL_ROLLBACK\020\t\022\037\n\033TYPE_GL" +
      "OBAL_ROLLBACK_RESULT\020\n\022\026\n\022TYPE_GLOBAL_ST" +
      "ATUS\020\017\022\035\n\031TYPE_GLOBAL_STATUS_RESULT\020\020\022\026\n" +
      "\022TYPE_GLOBAL_REPORT\020\021\022\035\n\031TYPE_GLOBAL_REP" +
      "ORT_RESULT\020\022\022\032\n\026TYPE_GLOBAL_LOCK_QUERY\020\025" +
      "\022!\n\035TYPE_GLOBAL_LOCK_QUERY_RESULT\020\026\022\026\n\022T" +
      "YPE_BRANCH_COMMIT\020\003\022\035\n\031TYPE_BRANCH_COMMI" +
      "T_RESULT\020\004\022\030\n\024TYPE_BRANCH_ROLLBACK\020\005\022\037\n\033" +
      "TYPE_BRANCH_ROLLBACK_RESULT\020\006\022\030\n\024TYPE_BR" +
      "ANCH_REGISTER\020\013\022\037\n\033TYPE_BRANCH_REGISTER_" +
      "RESULT\020\014\022\035\n\031TYPE_BRANCH_STATUS_REPORT\020\r\022" +
      "$\n TYPE_BRANCH_STATUS_REPORT_RESULT\020\016\022\024\n" +
      "\020TYPE_SEATA_MERGE\020;\022\033\n\027TYPE_SEATA_MERGE_" +
      "RESULT\020<\022\020\n\014TYPE_REG_CLT\020e\022\027\n\023TYPE_REG_C" +
      "LT_RESULT\020f\022\017\n\013TYPE_REG_RM\020g\022\026\n\022TYPE_REG" +
      "_RM_RESULT\020hB2\n!io.seata.codec.protobuf." +
      "generatedB\013MessageTypeP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
