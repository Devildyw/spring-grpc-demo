package com.dyw.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: HelloGrpc.proto")
public final class HelloGrpcGrpc {

  private HelloGrpcGrpc() {}

  public static final String SERVICE_NAME = "proto.HelloGrpc";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSayHelloMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.dyw.grpc.proto.HelloRequest,
      com.dyw.grpc.proto.HelloResponse> METHOD_SAY_HELLO = getSayHelloMethod();

  private static volatile io.grpc.MethodDescriptor<com.dyw.grpc.proto.HelloRequest,
      com.dyw.grpc.proto.HelloResponse> getSayHelloMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.dyw.grpc.proto.HelloRequest,
      com.dyw.grpc.proto.HelloResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.dyw.grpc.proto.HelloRequest, com.dyw.grpc.proto.HelloResponse> getSayHelloMethod;
    if ((getSayHelloMethod = HelloGrpcGrpc.getSayHelloMethod) == null) {
      synchronized (HelloGrpcGrpc.class) {
        if ((getSayHelloMethod = HelloGrpcGrpc.getSayHelloMethod) == null) {
          HelloGrpcGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.dyw.grpc.proto.HelloRequest, com.dyw.grpc.proto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.HelloGrpc", "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dyw.grpc.proto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dyw.grpc.proto.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloGrpcMethodDescriptorSupplier("SayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloGrpcStub newStub(io.grpc.Channel channel) {
    return new HelloGrpcStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloGrpcBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloGrpcFutureStub(channel);
  }

  /**
   */
  public static abstract class HelloGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.dyw.grpc.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.dyw.grpc.proto.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.dyw.grpc.proto.HelloRequest,
                com.dyw.grpc.proto.HelloResponse>(
                  this, METHODID_SAY_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class HelloGrpcStub extends io.grpc.stub.AbstractStub<HelloGrpcStub> {
    private HelloGrpcStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloGrpcStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloGrpcStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloGrpcStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.dyw.grpc.proto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.dyw.grpc.proto.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloGrpcBlockingStub extends io.grpc.stub.AbstractStub<HelloGrpcBlockingStub> {
    private HelloGrpcBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloGrpcBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloGrpcBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dyw.grpc.proto.HelloResponse sayHello(com.dyw.grpc.proto.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloGrpcFutureStub extends io.grpc.stub.AbstractStub<HelloGrpcFutureStub> {
    private HelloGrpcFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloGrpcFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloGrpcFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dyw.grpc.proto.HelloResponse> sayHello(
        com.dyw.grpc.proto.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.dyw.grpc.proto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.dyw.grpc.proto.HelloResponse>) responseObserver);
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

  private static abstract class HelloGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dyw.grpc.proto.HelloGrpcOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloGrpc");
    }
  }

  private static final class HelloGrpcFileDescriptorSupplier
      extends HelloGrpcBaseDescriptorSupplier {
    HelloGrpcFileDescriptorSupplier() {}
  }

  private static final class HelloGrpcMethodDescriptorSupplier
      extends HelloGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloGrpcMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloGrpcFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
