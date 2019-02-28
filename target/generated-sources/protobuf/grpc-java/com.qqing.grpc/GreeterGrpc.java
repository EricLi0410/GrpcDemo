package com.qqing.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The greeting service definition.  
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: helloworld.proto")
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "com.qqing.grpc.Greeter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.qqing.grpc.HealthCheckRequest,
      com.qqing.grpc.HealthCheckResponse> METHOD_HEALTH_CHECK =
      io.grpc.MethodDescriptor.<com.qqing.grpc.HealthCheckRequest, com.qqing.grpc.HealthCheckResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.qqing.grpc.Greeter", "HealthCheck"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.qqing.grpc.HealthCheckRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.qqing.grpc.HealthCheckResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.qqing.grpc.PingRequest,
      com.qqing.grpc.PongResponse> METHOD_PING =
      io.grpc.MethodDescriptor.<com.qqing.grpc.PingRequest, com.qqing.grpc.PongResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.qqing.grpc.Greeter", "Ping"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.qqing.grpc.PingRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.qqing.grpc.PongResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.qqing.grpc.StartJobRequest,
      com.qqing.grpc.StartJobResponse> METHOD_START_JOB =
      io.grpc.MethodDescriptor.<com.qqing.grpc.StartJobRequest, com.qqing.grpc.StartJobResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.qqing.grpc.Greeter", "StartJob"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.qqing.grpc.StartJobRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.qqing.grpc.StartJobResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.qqing.grpc.HelloRequest,
      com.qqing.grpc.HelloReply> METHOD_SAY_HELLO =
      io.grpc.MethodDescriptor.<com.qqing.grpc.HelloRequest, com.qqing.grpc.HelloReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.qqing.grpc.Greeter", "SayHello"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.qqing.grpc.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.qqing.grpc.HelloReply.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.  
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     */
    public void healthCheck(com.qqing.grpc.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.qqing.grpc.HealthCheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HEALTH_CHECK, responseObserver);
    }

    /**
     */
    public void ping(com.qqing.grpc.PingRequest request,
        io.grpc.stub.StreamObserver<com.qqing.grpc.PongResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void startJob(com.qqing.grpc.StartJobRequest request,
        io.grpc.stub.StreamObserver<com.qqing.grpc.StartJobResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_START_JOB, responseObserver);
    }

    /**
     * <pre>
     * Sends a greeting  
     * </pre>
     */
    public void sayHello(com.qqing.grpc.HelloRequest request,
        io.grpc.stub.StreamObserver<com.qqing.grpc.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_HEALTH_CHECK,
            asyncUnaryCall(
              new MethodHandlers<
                com.qqing.grpc.HealthCheckRequest,
                com.qqing.grpc.HealthCheckResponse>(
                  this, METHODID_HEALTH_CHECK)))
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                com.qqing.grpc.PingRequest,
                com.qqing.grpc.PongResponse>(
                  this, METHODID_PING)))
          .addMethod(
            METHOD_START_JOB,
            asyncUnaryCall(
              new MethodHandlers<
                com.qqing.grpc.StartJobRequest,
                com.qqing.grpc.StartJobResponse>(
                  this, METHODID_START_JOB)))
          .addMethod(
            METHOD_SAY_HELLO,
            asyncUnaryCall(
              new MethodHandlers<
                com.qqing.grpc.HelloRequest,
                com.qqing.grpc.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.  
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     */
    public void healthCheck(com.qqing.grpc.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.qqing.grpc.HealthCheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HEALTH_CHECK, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ping(com.qqing.grpc.PingRequest request,
        io.grpc.stub.StreamObserver<com.qqing.grpc.PongResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void startJob(com.qqing.grpc.StartJobRequest request,
        io.grpc.stub.StreamObserver<com.qqing.grpc.StartJobResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_START_JOB, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends a greeting  
     * </pre>
     */
    public void sayHello(com.qqing.grpc.HelloRequest request,
        io.grpc.stub.StreamObserver<com.qqing.grpc.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.  
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.qqing.grpc.HealthCheckResponse healthCheck(com.qqing.grpc.HealthCheckRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HEALTH_CHECK, getCallOptions(), request);
    }

    /**
     */
    public com.qqing.grpc.PongResponse ping(com.qqing.grpc.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.qqing.grpc.StartJobResponse startJob(com.qqing.grpc.StartJobRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_START_JOB, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends a greeting  
     * </pre>
     */
    public com.qqing.grpc.HelloReply sayHello(com.qqing.grpc.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.  
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.qqing.grpc.HealthCheckResponse> healthCheck(
        com.qqing.grpc.HealthCheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HEALTH_CHECK, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.qqing.grpc.PongResponse> ping(
        com.qqing.grpc.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.qqing.grpc.StartJobResponse> startJob(
        com.qqing.grpc.StartJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_START_JOB, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends a greeting  
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.qqing.grpc.HelloReply> sayHello(
        com.qqing.grpc.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request);
    }
  }

  private static final int METHODID_HEALTH_CHECK = 0;
  private static final int METHODID_PING = 1;
  private static final int METHODID_START_JOB = 2;
  private static final int METHODID_SAY_HELLO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HEALTH_CHECK:
          serviceImpl.healthCheck((com.qqing.grpc.HealthCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.qqing.grpc.HealthCheckResponse>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((com.qqing.grpc.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.qqing.grpc.PongResponse>) responseObserver);
          break;
        case METHODID_START_JOB:
          serviceImpl.startJob((com.qqing.grpc.StartJobRequest) request,
              (io.grpc.stub.StreamObserver<com.qqing.grpc.StartJobResponse>) responseObserver);
          break;
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.qqing.grpc.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.qqing.grpc.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class GreeterDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.qqing.grpc.HelloWorldProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterDescriptorSupplier())
              .addMethod(METHOD_HEALTH_CHECK)
              .addMethod(METHOD_PING)
              .addMethod(METHOD_START_JOB)
              .addMethod(METHOD_SAY_HELLO)
              .build();
        }
      }
    }
    return result;
  }
}
