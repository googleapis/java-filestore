// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/filestore/v1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1;

public interface ListSnapshotsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1.ListSnapshotsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The instance for which to retrieve snapshot information,
   * in the format
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The instance for which to retrieve snapshot information,
   * in the format
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The maximum number of items to return.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The next_page_token value to use if there are additional
   * results to retrieve for this list request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The next_page_token value to use if there are additional
   * results to retrieve for this list request.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Sort results. Supported values are "name", "name desc" or "" (unsorted).
   * </pre>
   *
   * <code>string order_by = 4;</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Sort results. Supported values are "name", "name desc" or "" (unsorted).
   * </pre>
   *
   * <code>string order_by = 4;</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * List filter.
   * </pre>
   *
   * <code>string filter = 5;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * List filter.
   * </pre>
   *
   * <code>string filter = 5;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();
}
