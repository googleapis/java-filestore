// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/common/operation_metadata.proto

package com.google.cloud.common;

public final class OperationMetadataOuterClass {
  private OperationMetadataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_common_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_common_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/common/operation_metadata" +
      ".proto\022\023google.cloud.common\032\037google/api/" +
      "field_behavior.proto\032\037google/protobuf/ti" +
      "mestamp.proto\"\371\001\n\021OperationMetadata\0224\n\013c" +
      "reate_time\030\001 \001(\0132\032.google.protobuf.Times" +
      "tampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.google.pro" +
      "tobuf.TimestampB\003\340A\003\022\023\n\006target\030\003 \001(\tB\003\340A" +
      "\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\032\n\rstatus_detail\030\005 " +
      "\001(\tB\003\340A\003\022\035\n\020cancel_requested\030\006 \001(\010B\003\340A\003\022" +
      "\030\n\013api_version\030\007 \001(\tB\003\340A\003BV\n\027com.google." +
      "cloud.commonP\001Z9google.golang.org/genpro" +
      "to/googleapis/cloud/common;commonb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_common_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_common_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_common_OperationMetadata_descriptor,
        new java.lang.String[] { "CreateTime", "EndTime", "Target", "Verb", "StatusDetail", "CancelRequested", "ApiVersion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
