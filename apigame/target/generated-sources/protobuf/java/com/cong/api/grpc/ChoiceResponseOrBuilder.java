// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gRPC.proto

package com.cong.api.grpc;

public interface ChoiceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.cong.api.grpc.ChoiceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string status = 1;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 1;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>.com.cong.api.grpc.RoundRPC data = 3;</code>
   */
  boolean hasData();
  /**
   * <code>.com.cong.api.grpc.RoundRPC data = 3;</code>
   */
  com.cong.api.grpc.RoundRPC getData();
  /**
   * <code>.com.cong.api.grpc.RoundRPC data = 3;</code>
   */
  com.cong.api.grpc.RoundRPCOrBuilder getDataOrBuilder();
}