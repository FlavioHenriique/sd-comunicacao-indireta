package io.grpc.examples.helloworld;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: messages.proto")
public final class ServerGrpc {

  private ServerGrpc() {}

  public static final String SERVICE_NAME = "Server";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld.MessageGrpc,
      io.grpc.examples.helloworld.MessageResultGrpc> METHOD_PRINT =
      io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.MessageGrpc, io.grpc.examples.helloworld.MessageResultGrpc>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "Server", "print"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.grpc.examples.helloworld.MessageGrpc.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.grpc.examples.helloworld.MessageResultGrpc.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerStub newStub(io.grpc.Channel channel) {
    return new ServerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServerFutureStub(channel);
  }

  /**
   */
  public static abstract class ServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void print(io.grpc.examples.helloworld.MessageGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.MessageResultGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PRINT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PRINT,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.MessageGrpc,
                io.grpc.examples.helloworld.MessageResultGrpc>(
                  this, METHODID_PRINT)))
          .build();
    }
  }

  /**
   */
  public static final class ServerStub extends io.grpc.stub.AbstractStub<ServerStub> {
    private ServerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerStub(channel, callOptions);
    }

    /**
     */
    public void print(io.grpc.examples.helloworld.MessageGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.MessageResultGrpc> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PRINT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServerBlockingStub extends io.grpc.stub.AbstractStub<ServerBlockingStub> {
    private ServerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.helloworld.MessageResultGrpc print(io.grpc.examples.helloworld.MessageGrpc request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PRINT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServerFutureStub extends io.grpc.stub.AbstractStub<ServerFutureStub> {
    private ServerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.MessageResultGrpc> print(
        io.grpc.examples.helloworld.MessageGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PRINT, getCallOptions()), request);
    }
  }

  private static final int METHODID_PRINT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PRINT:
          serviceImpl.print((io.grpc.examples.helloworld.MessageGrpc) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.MessageResultGrpc>) responseObserver);
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

  private static final class ServerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.helloworld.Messages.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerDescriptorSupplier())
              .addMethod(METHOD_PRINT)
              .build();
        }
      }
    }
    return result;
  }
}
