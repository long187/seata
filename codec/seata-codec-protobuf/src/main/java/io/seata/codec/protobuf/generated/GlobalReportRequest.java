// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalReportRequest.proto

package io.seata.codec.protobuf.generated;

public final class GlobalReportRequest {
  private GlobalReportRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_seata_protocol_protobuf_GlobalReportRequestProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_seata_protocol_protobuf_GlobalReportRequestProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031globalReportRequest.proto\022\032io.seata.pr" +
      "otocol.protobuf\032\036abstractGlobalEndReques" +
      "t.proto\032\022globalStatus.proto\"\274\001\n\030GlobalRe" +
      "portRequestProto\022[\n\030abstractGlobalEndReq" +
      "uest\030\001 \001(\01329.io.seata.protocol.protobuf." +
      "AbstractGlobalEndRequestProto\022C\n\014globalS" +
      "tatus\030\002 \001(\0162-.io.seata.protocol.protobuf" +
      ".GlobalStatusProtoB:\n!io.seata.codec.pro" +
      "tobuf.generatedB\023GlobalReportRequestP\001b\006" +
      "proto3"
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
          io.seata.codec.protobuf.generated.AbstractGlobalEndRequest.getDescriptor(),
          io.seata.codec.protobuf.generated.GlobalStatus.getDescriptor(),
        }, assigner);
    internal_static_io_seata_protocol_protobuf_GlobalReportRequestProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_seata_protocol_protobuf_GlobalReportRequestProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_seata_protocol_protobuf_GlobalReportRequestProto_descriptor,
        new java.lang.String[] { "AbstractGlobalEndRequest", "GlobalStatus", });
    io.seata.codec.protobuf.generated.AbstractGlobalEndRequest.getDescriptor();
    io.seata.codec.protobuf.generated.GlobalStatus.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}