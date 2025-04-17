package smart_home;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: smart_lock.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SmartLockServiceGrpc {

  private SmartLockServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "smart_home.SmartLockService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smart_home.SmartLockProto.SmartLockRequest,
      smart_home.SmartLockProto.SmartLockResponse> getControlLockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ControlLock",
      requestType = smart_home.SmartLockProto.SmartLockRequest.class,
      responseType = smart_home.SmartLockProto.SmartLockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smart_home.SmartLockProto.SmartLockRequest,
      smart_home.SmartLockProto.SmartLockResponse> getControlLockMethod() {
    io.grpc.MethodDescriptor<smart_home.SmartLockProto.SmartLockRequest, smart_home.SmartLockProto.SmartLockResponse> getControlLockMethod;
    if ((getControlLockMethod = SmartLockServiceGrpc.getControlLockMethod) == null) {
      synchronized (SmartLockServiceGrpc.class) {
        if ((getControlLockMethod = SmartLockServiceGrpc.getControlLockMethod) == null) {
          SmartLockServiceGrpc.getControlLockMethod = getControlLockMethod =
              io.grpc.MethodDescriptor.<smart_home.SmartLockProto.SmartLockRequest, smart_home.SmartLockProto.SmartLockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ControlLock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smart_home.SmartLockProto.SmartLockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smart_home.SmartLockProto.SmartLockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLockServiceMethodDescriptorSupplier("ControlLock"))
              .build();
        }
      }
    }
    return getControlLockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smart_home.SmartLockProto.SmartLockStatusRequest,
      smart_home.SmartLockProto.SmartLockStatus> getStreamLockStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamLockStatus",
      requestType = smart_home.SmartLockProto.SmartLockStatusRequest.class,
      responseType = smart_home.SmartLockProto.SmartLockStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<smart_home.SmartLockProto.SmartLockStatusRequest,
      smart_home.SmartLockProto.SmartLockStatus> getStreamLockStatusMethod() {
    io.grpc.MethodDescriptor<smart_home.SmartLockProto.SmartLockStatusRequest, smart_home.SmartLockProto.SmartLockStatus> getStreamLockStatusMethod;
    if ((getStreamLockStatusMethod = SmartLockServiceGrpc.getStreamLockStatusMethod) == null) {
      synchronized (SmartLockServiceGrpc.class) {
        if ((getStreamLockStatusMethod = SmartLockServiceGrpc.getStreamLockStatusMethod) == null) {
          SmartLockServiceGrpc.getStreamLockStatusMethod = getStreamLockStatusMethod =
              io.grpc.MethodDescriptor.<smart_home.SmartLockProto.SmartLockStatusRequest, smart_home.SmartLockProto.SmartLockStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamLockStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smart_home.SmartLockProto.SmartLockStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smart_home.SmartLockProto.SmartLockStatus.getDefaultInstance()))
              .setSchemaDescriptor(new SmartLockServiceMethodDescriptorSupplier("StreamLockStatus"))
              .build();
        }
      }
    }
    return getStreamLockStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartLockServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLockServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLockServiceStub>() {
        @java.lang.Override
        public SmartLockServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLockServiceStub(channel, callOptions);
        }
      };
    return SmartLockServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartLockServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLockServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLockServiceBlockingStub>() {
        @java.lang.Override
        public SmartLockServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLockServiceBlockingStub(channel, callOptions);
        }
      };
    return SmartLockServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartLockServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SmartLockServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SmartLockServiceFutureStub>() {
        @java.lang.Override
        public SmartLockServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SmartLockServiceFutureStub(channel, callOptions);
        }
      };
    return SmartLockServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service definition
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void controlLock(smart_home.SmartLockProto.SmartLockRequest request,
        io.grpc.stub.StreamObserver<smart_home.SmartLockProto.SmartLockResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getControlLockMethod(), responseObserver);
    }

    /**
     */
    default void streamLockStatus(smart_home.SmartLockProto.SmartLockStatusRequest request,
        io.grpc.stub.StreamObserver<smart_home.SmartLockProto.SmartLockStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamLockStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SmartLockService.
   * <pre>
   * Service definition
   * </pre>
   */
  public static abstract class SmartLockServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SmartLockServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SmartLockService.
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class SmartLockServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SmartLockServiceStub> {
    private SmartLockServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLockServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLockServiceStub(channel, callOptions);
    }

    /**
     */
    public void controlLock(smart_home.SmartLockProto.SmartLockRequest request,
        io.grpc.stub.StreamObserver<smart_home.SmartLockProto.SmartLockResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getControlLockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamLockStatus(smart_home.SmartLockProto.SmartLockStatusRequest request,
        io.grpc.stub.StreamObserver<smart_home.SmartLockProto.SmartLockStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamLockStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SmartLockService.
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class SmartLockServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SmartLockServiceBlockingStub> {
    private SmartLockServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLockServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLockServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smart_home.SmartLockProto.SmartLockResponse controlLock(smart_home.SmartLockProto.SmartLockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getControlLockMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<smart_home.SmartLockProto.SmartLockStatus> streamLockStatus(
        smart_home.SmartLockProto.SmartLockStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamLockStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SmartLockService.
   * <pre>
   * Service definition
   * </pre>
   */
  public static final class SmartLockServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SmartLockServiceFutureStub> {
    private SmartLockServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartLockServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SmartLockServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smart_home.SmartLockProto.SmartLockResponse> controlLock(
        smart_home.SmartLockProto.SmartLockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getControlLockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONTROL_LOCK = 0;
  private static final int METHODID_STREAM_LOCK_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONTROL_LOCK:
          serviceImpl.controlLock((smart_home.SmartLockProto.SmartLockRequest) request,
              (io.grpc.stub.StreamObserver<smart_home.SmartLockProto.SmartLockResponse>) responseObserver);
          break;
        case METHODID_STREAM_LOCK_STATUS:
          serviceImpl.streamLockStatus((smart_home.SmartLockProto.SmartLockStatusRequest) request,
              (io.grpc.stub.StreamObserver<smart_home.SmartLockProto.SmartLockStatus>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getControlLockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smart_home.SmartLockProto.SmartLockRequest,
              smart_home.SmartLockProto.SmartLockResponse>(
                service, METHODID_CONTROL_LOCK)))
        .addMethod(
          getStreamLockStatusMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              smart_home.SmartLockProto.SmartLockStatusRequest,
              smart_home.SmartLockProto.SmartLockStatus>(
                service, METHODID_STREAM_LOCK_STATUS)))
        .build();
  }

  private static abstract class SmartLockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartLockServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smart_home.SmartLockProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartLockService");
    }
  }

  private static final class SmartLockServiceFileDescriptorSupplier
      extends SmartLockServiceBaseDescriptorSupplier {
    SmartLockServiceFileDescriptorSupplier() {}
  }

  private static final class SmartLockServiceMethodDescriptorSupplier
      extends SmartLockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SmartLockServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SmartLockServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartLockServiceFileDescriptorSupplier())
              .addMethod(getControlLockMethod())
              .addMethod(getStreamLockStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
