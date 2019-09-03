// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messageType.proto

package io.seata.codec.protobuf.generated;

/**
 * <pre>
 * PublishRequest is a publish request.
 * </pre>
 *
 * Protobuf enum {@code io.seata.protocol.protobuf.MessageTypeProto}
 */
public enum MessageTypeProto
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>TYPE_GLOBAL_PRESERVED = 0;</code>
   */
  TYPE_GLOBAL_PRESERVED(0),
  /**
   * <code>TYPE_GLOBAL_BEGIN = 1;</code>
   */
  TYPE_GLOBAL_BEGIN(1),
  /**
   * <code>TYPE_GLOBAL_BEGIN_RESULT = 2;</code>
   */
  TYPE_GLOBAL_BEGIN_RESULT(2),
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_COMMIT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_COMMIT = 7;</code>
   */
  TYPE_GLOBAL_COMMIT(7),
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_COMMIT_RESULT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_COMMIT_RESULT = 8;</code>
   */
  TYPE_GLOBAL_COMMIT_RESULT(8),
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_ROLLBACK.
   * </pre>
   *
   * <code>TYPE_GLOBAL_ROLLBACK = 9;</code>
   */
  TYPE_GLOBAL_ROLLBACK(9),
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_ROLLBACK_RESULT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_ROLLBACK_RESULT = 10;</code>
   */
  TYPE_GLOBAL_ROLLBACK_RESULT(10),
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_STATUS.
   * </pre>
   *
   * <code>TYPE_GLOBAL_STATUS = 15;</code>
   */
  TYPE_GLOBAL_STATUS(15),
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_STATUS_RESULT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_STATUS_RESULT = 16;</code>
   */
  TYPE_GLOBAL_STATUS_RESULT(16),
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_REPORT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_REPORT = 17;</code>
   */
  TYPE_GLOBAL_REPORT(17),
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_REPORT_RESULT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_REPORT_RESULT = 18;</code>
   */
  TYPE_GLOBAL_REPORT_RESULT(18),
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_LOCK_QUERY.
   * </pre>
   *
   * <code>TYPE_GLOBAL_LOCK_QUERY = 21;</code>
   */
  TYPE_GLOBAL_LOCK_QUERY(21),
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_LOCK_QUERY_RESULT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_LOCK_QUERY_RESULT = 22;</code>
   */
  TYPE_GLOBAL_LOCK_QUERY_RESULT(22),
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_COMMIT.
   * </pre>
   *
   * <code>TYPE_BRANCH_COMMIT = 3;</code>
   */
  TYPE_BRANCH_COMMIT(3),
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_COMMIT_RESULT.
   * </pre>
   *
   * <code>TYPE_BRANCH_COMMIT_RESULT = 4;</code>
   */
  TYPE_BRANCH_COMMIT_RESULT(4),
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_ROLLBACK.
   * </pre>
   *
   * <code>TYPE_BRANCH_ROLLBACK = 5;</code>
   */
  TYPE_BRANCH_ROLLBACK(5),
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_ROLLBACK_RESULT.
   * </pre>
   *
   * <code>TYPE_BRANCH_ROLLBACK_RESULT = 6;</code>
   */
  TYPE_BRANCH_ROLLBACK_RESULT(6),
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_REGISTER.
   * </pre>
   *
   * <code>TYPE_BRANCH_REGISTER = 11;</code>
   */
  TYPE_BRANCH_REGISTER(11),
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_REGISTER_RESULT.
   * </pre>
   *
   * <code>TYPE_BRANCH_REGISTER_RESULT = 12;</code>
   */
  TYPE_BRANCH_REGISTER_RESULT(12),
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_STATUS_REPORT.
   * </pre>
   *
   * <code>TYPE_BRANCH_STATUS_REPORT = 13;</code>
   */
  TYPE_BRANCH_STATUS_REPORT(13),
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_STATUS_REPORT_RESULT.
   * </pre>
   *
   * <code>TYPE_BRANCH_STATUS_REPORT_RESULT = 14;</code>
   */
  TYPE_BRANCH_STATUS_REPORT_RESULT(14),
  /**
   * <pre>
   **
   * The constant TYPE_SEATA_MERGE.
   * </pre>
   *
   * <code>TYPE_SEATA_MERGE = 59;</code>
   */
  TYPE_SEATA_MERGE(59),
  /**
   * <pre>
   **
   * The constant TYPE_SEATA_MERGE_RESULT.
   * </pre>
   *
   * <code>TYPE_SEATA_MERGE_RESULT = 60;</code>
   */
  TYPE_SEATA_MERGE_RESULT(60),
  /**
   * <pre>
   **
   * The constant TYPE_REG_CLT.
   * </pre>
   *
   * <code>TYPE_REG_CLT = 101;</code>
   */
  TYPE_REG_CLT(101),
  /**
   * <pre>
   **
   * The constant TYPE_REG_CLT_RESULT.
   * </pre>
   *
   * <code>TYPE_REG_CLT_RESULT = 102;</code>
   */
  TYPE_REG_CLT_RESULT(102),
  /**
   * <pre>
   **
   * The constant TYPE_REG_RM.
   * </pre>
   *
   * <code>TYPE_REG_RM = 103;</code>
   */
  TYPE_REG_RM(103),
  /**
   * <pre>
   **
   * The constant TYPE_REG_RM_RESULT.
   * </pre>
   *
   * <code>TYPE_REG_RM_RESULT = 104;</code>
   */
  TYPE_REG_RM_RESULT(104),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>TYPE_GLOBAL_PRESERVED = 0;</code>
   */
  public static final int TYPE_GLOBAL_PRESERVED_VALUE = 0;
  /**
   * <code>TYPE_GLOBAL_BEGIN = 1;</code>
   */
  public static final int TYPE_GLOBAL_BEGIN_VALUE = 1;
  /**
   * <code>TYPE_GLOBAL_BEGIN_RESULT = 2;</code>
   */
  public static final int TYPE_GLOBAL_BEGIN_RESULT_VALUE = 2;
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_COMMIT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_COMMIT = 7;</code>
   */
  public static final int TYPE_GLOBAL_COMMIT_VALUE = 7;
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_COMMIT_RESULT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_COMMIT_RESULT = 8;</code>
   */
  public static final int TYPE_GLOBAL_COMMIT_RESULT_VALUE = 8;
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_ROLLBACK.
   * </pre>
   *
   * <code>TYPE_GLOBAL_ROLLBACK = 9;</code>
   */
  public static final int TYPE_GLOBAL_ROLLBACK_VALUE = 9;
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_ROLLBACK_RESULT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_ROLLBACK_RESULT = 10;</code>
   */
  public static final int TYPE_GLOBAL_ROLLBACK_RESULT_VALUE = 10;
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_STATUS.
   * </pre>
   *
   * <code>TYPE_GLOBAL_STATUS = 15;</code>
   */
  public static final int TYPE_GLOBAL_STATUS_VALUE = 15;
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_STATUS_RESULT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_STATUS_RESULT = 16;</code>
   */
  public static final int TYPE_GLOBAL_STATUS_RESULT_VALUE = 16;
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_REPORT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_REPORT = 17;</code>
   */
  public static final int TYPE_GLOBAL_REPORT_VALUE = 17;
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_REPORT_RESULT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_REPORT_RESULT = 18;</code>
   */
  public static final int TYPE_GLOBAL_REPORT_RESULT_VALUE = 18;
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_LOCK_QUERY.
   * </pre>
   *
   * <code>TYPE_GLOBAL_LOCK_QUERY = 21;</code>
   */
  public static final int TYPE_GLOBAL_LOCK_QUERY_VALUE = 21;
  /**
   * <pre>
   **
   * The constant TYPE_GLOBAL_LOCK_QUERY_RESULT.
   * </pre>
   *
   * <code>TYPE_GLOBAL_LOCK_QUERY_RESULT = 22;</code>
   */
  public static final int TYPE_GLOBAL_LOCK_QUERY_RESULT_VALUE = 22;
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_COMMIT.
   * </pre>
   *
   * <code>TYPE_BRANCH_COMMIT = 3;</code>
   */
  public static final int TYPE_BRANCH_COMMIT_VALUE = 3;
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_COMMIT_RESULT.
   * </pre>
   *
   * <code>TYPE_BRANCH_COMMIT_RESULT = 4;</code>
   */
  public static final int TYPE_BRANCH_COMMIT_RESULT_VALUE = 4;
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_ROLLBACK.
   * </pre>
   *
   * <code>TYPE_BRANCH_ROLLBACK = 5;</code>
   */
  public static final int TYPE_BRANCH_ROLLBACK_VALUE = 5;
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_ROLLBACK_RESULT.
   * </pre>
   *
   * <code>TYPE_BRANCH_ROLLBACK_RESULT = 6;</code>
   */
  public static final int TYPE_BRANCH_ROLLBACK_RESULT_VALUE = 6;
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_REGISTER.
   * </pre>
   *
   * <code>TYPE_BRANCH_REGISTER = 11;</code>
   */
  public static final int TYPE_BRANCH_REGISTER_VALUE = 11;
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_REGISTER_RESULT.
   * </pre>
   *
   * <code>TYPE_BRANCH_REGISTER_RESULT = 12;</code>
   */
  public static final int TYPE_BRANCH_REGISTER_RESULT_VALUE = 12;
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_STATUS_REPORT.
   * </pre>
   *
   * <code>TYPE_BRANCH_STATUS_REPORT = 13;</code>
   */
  public static final int TYPE_BRANCH_STATUS_REPORT_VALUE = 13;
  /**
   * <pre>
   **
   * The constant TYPE_BRANCH_STATUS_REPORT_RESULT.
   * </pre>
   *
   * <code>TYPE_BRANCH_STATUS_REPORT_RESULT = 14;</code>
   */
  public static final int TYPE_BRANCH_STATUS_REPORT_RESULT_VALUE = 14;
  /**
   * <pre>
   **
   * The constant TYPE_SEATA_MERGE.
   * </pre>
   *
   * <code>TYPE_SEATA_MERGE = 59;</code>
   */
  public static final int TYPE_SEATA_MERGE_VALUE = 59;
  /**
   * <pre>
   **
   * The constant TYPE_SEATA_MERGE_RESULT.
   * </pre>
   *
   * <code>TYPE_SEATA_MERGE_RESULT = 60;</code>
   */
  public static final int TYPE_SEATA_MERGE_RESULT_VALUE = 60;
  /**
   * <pre>
   **
   * The constant TYPE_REG_CLT.
   * </pre>
   *
   * <code>TYPE_REG_CLT = 101;</code>
   */
  public static final int TYPE_REG_CLT_VALUE = 101;
  /**
   * <pre>
   **
   * The constant TYPE_REG_CLT_RESULT.
   * </pre>
   *
   * <code>TYPE_REG_CLT_RESULT = 102;</code>
   */
  public static final int TYPE_REG_CLT_RESULT_VALUE = 102;
  /**
   * <pre>
   **
   * The constant TYPE_REG_RM.
   * </pre>
   *
   * <code>TYPE_REG_RM = 103;</code>
   */
  public static final int TYPE_REG_RM_VALUE = 103;
  /**
   * <pre>
   **
   * The constant TYPE_REG_RM_RESULT.
   * </pre>
   *
   * <code>TYPE_REG_RM_RESULT = 104;</code>
   */
  public static final int TYPE_REG_RM_RESULT_VALUE = 104;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static MessageTypeProto valueOf(int value) {
    return forNumber(value);
  }

  public static MessageTypeProto forNumber(int value) {
    switch (value) {
      case 0: return TYPE_GLOBAL_PRESERVED;
      case 1: return TYPE_GLOBAL_BEGIN;
      case 2: return TYPE_GLOBAL_BEGIN_RESULT;
      case 7: return TYPE_GLOBAL_COMMIT;
      case 8: return TYPE_GLOBAL_COMMIT_RESULT;
      case 9: return TYPE_GLOBAL_ROLLBACK;
      case 10: return TYPE_GLOBAL_ROLLBACK_RESULT;
      case 15: return TYPE_GLOBAL_STATUS;
      case 16: return TYPE_GLOBAL_STATUS_RESULT;
      case 17: return TYPE_GLOBAL_REPORT;
      case 18: return TYPE_GLOBAL_REPORT_RESULT;
      case 21: return TYPE_GLOBAL_LOCK_QUERY;
      case 22: return TYPE_GLOBAL_LOCK_QUERY_RESULT;
      case 3: return TYPE_BRANCH_COMMIT;
      case 4: return TYPE_BRANCH_COMMIT_RESULT;
      case 5: return TYPE_BRANCH_ROLLBACK;
      case 6: return TYPE_BRANCH_ROLLBACK_RESULT;
      case 11: return TYPE_BRANCH_REGISTER;
      case 12: return TYPE_BRANCH_REGISTER_RESULT;
      case 13: return TYPE_BRANCH_STATUS_REPORT;
      case 14: return TYPE_BRANCH_STATUS_REPORT_RESULT;
      case 59: return TYPE_SEATA_MERGE;
      case 60: return TYPE_SEATA_MERGE_RESULT;
      case 101: return TYPE_REG_CLT;
      case 102: return TYPE_REG_CLT_RESULT;
      case 103: return TYPE_REG_RM;
      case 104: return TYPE_REG_RM_RESULT;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MessageTypeProto>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MessageTypeProto> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MessageTypeProto>() {
          public MessageTypeProto findValueByNumber(int number) {
            return MessageTypeProto.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.seata.codec.protobuf.generated.MessageType.getDescriptor().getEnumTypes().get(0);
  }

  private static final MessageTypeProto[] VALUES = values();

  public static MessageTypeProto valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private MessageTypeProto(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:io.seata.protocol.protobuf.MessageTypeProto)
}

