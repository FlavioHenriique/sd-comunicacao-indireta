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
public final class SenderGrpc {

  private SenderGrpc() {}

  public static final String SERVICE_NAME = "Sender";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.grpc.examples.helloworld.MessageGrpc,
      io.grpc.examples.helloworld.MessageResultGrpc> METHOD_SEND_MESSAGE =
      io.grpc.MethodDescriptor.<io.grpc.examples.helloworld.MessageGrpc, io.grpc.examples.helloworld.MessageResultGrpc>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "Sender", "sendMessage"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.grpc.examples.helloworld.MessageGrpc.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.grpc.examples.helloworld.MessageResultGrpc.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SenderStub newStub(io.grpc.Channel channel) {
    return new SenderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SenderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SenderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SenderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SenderFutureStub(channel);
  }

  /**
   */
  public static abstract class SenderImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendMessage(io.grpc.examples.helloworld.MessageGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.MessageResultGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_MESSAGE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEND_MESSAGE,
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.helloworld.MessageGrpc,
                io.grpc.examples.helloworld.MessageResultGrpc>(
                  this, METHODID_SEND_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class SenderStub extends io.grpc.stub.AbstractStub<SenderStub> {
    private SenderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SenderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SenderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SenderStub(channel, callOptions);
    }

    /**
     */
    public void sendMessage(io.grpc.examples.helloworld.MessageGrpc request,
        io.grpc.stub.StreamObserver<io.grpc.examples.helloworld.MessageResultGrpc> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_MESSAGE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SenderBlockingStub extends io.grpc.stub.AbstractStub<SenderBlockingStub> {
    private SenderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SenderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SenderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SenderBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.examples.helloworld.MessageResultGrpc sendMessage(io.grpc.examples.helloworld.MessageGrpc request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_MESSAGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SenderFutureStub extends io.grpc.stub.AbstractStub<SenderFutureStub> {
    private SenderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SenderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SenderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SenderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.helloworld.MessageResultGrpc> sendMessage(
        io.grpc.examples.helloworld.MessageGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_MESSAGE, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SenderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SenderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((io.grpc.examples.helloworld.MessageGrpc) request,
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

  private static final class SenderDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.helloworld.Messages.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SenderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SenderDescriptorSupplier())
              .addMethod(METHOD_SEND_MESSAGE)
              .build();
        }
      }
    }
    return result;
  }
}
