package smart_home;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service definition for Motion Detection
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: motion_detection.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MotionDetectionServiceGrpc {

  private MotionDetectionServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "MotionDetectionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smart_home.MotionDetectionProto.MotionDetectionRequest,
      smart_home.MotionDetectionProto.MotionAlert> getStreamMotionAlertsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamMotionAlerts",
      requestType = smart_home.MotionDetectionProto.MotionDetectionRequest.class,
      responseType = smart_home.MotionDetectionProto.MotionAlert.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<smart_home.MotionDetectionProto.MotionDetectionRequest,
      smart_home.MotionDetectionProto.MotionAlert> getStreamMotionAlertsMethod() {
    io.grpc.MethodDescriptor<smart_home.MotionDetectionProto.MotionDetectionRequest, smart_home.MotionDetectionProto.MotionAlert> getStreamMotionAlertsMethod;
    if ((getStreamMotionAlertsMethod = MotionDetectionServiceGrpc.getStreamMotionAlertsMethod) == null) {
      synchronized (MotionDetectionServiceGrpc.class) {
        if ((getStreamMotionAlertsMethod = MotionDetectionServiceGrpc.getStreamMotionAlertsMethod) == null) {
          MotionDetectionServiceGrpc.getStreamMotionAlertsMethod = getStreamMotionAlertsMethod =
              io.grpc.MethodDescriptor.<smart_home.MotionDetectionProto.MotionDetectionRequest, smart_home.MotionDetectionProto.MotionAlert>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamMotionAlerts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smart_home.MotionDetectionProto.MotionDetectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smart_home.MotionDetectionProto.MotionAlert.getDefaultInstance()))
              .setSchemaDescriptor(new MotionDetectionServiceMethodDescriptorSupplier("StreamMotionAlerts"))
              .build();
        }
      }
    }
    return getStreamMotionAlertsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MotionDetectionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MotionDetectionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MotionDetectionServiceStub>() {
        @java.lang.Override
        public MotionDetectionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MotionDetectionServiceStub(channel, callOptions);
        }
      };
    return MotionDetectionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MotionDetectionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MotionDetectionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MotionDetectionServiceBlockingStub>() {
        @java.lang.Override
        public MotionDetectionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MotionDetectionServiceBlockingStub(channel, callOptions);
        }
      };
    return MotionDetectionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MotionDetectionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MotionDetectionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MotionDetectionServiceFutureStub>() {
        @java.lang.Override
        public MotionDetectionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MotionDetectionServiceFutureStub(channel, callOptions);
        }
      };
    return MotionDetectionServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service definition for Motion Detection
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * RPC for streaming motion alerts
     * </pre>
     */
    default void streamMotionAlerts(smart_home.MotionDetectionProto.MotionDetectionRequest request,
        io.grpc.stub.StreamObserver<smart_home.MotionDetectionProto.MotionAlert> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamMotionAlertsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MotionDetectionService.
   * <pre>
   * Service definition for Motion Detection
   * </pre>
   */
  public static abstract class MotionDetectionServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MotionDetectionServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MotionDetectionService.
   * <pre>
   * Service definition for Motion Detection
   * </pre>
   */
  public static final class MotionDetectionServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MotionDetectionServiceStub> {
    private MotionDetectionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionDetectionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MotionDetectionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC for streaming motion alerts
     * </pre>
     */
    public void streamMotionAlerts(smart_home.MotionDetectionProto.MotionDetectionRequest request,
        io.grpc.stub.StreamObserver<smart_home.MotionDetectionProto.MotionAlert> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamMotionAlertsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MotionDetectionService.
   * <pre>
   * Service definition for Motion Detection
   * </pre>
   */
  public static final class MotionDetectionServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MotionDetectionServiceBlockingStub> {
    private MotionDetectionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionDetectionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MotionDetectionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * RPC for streaming motion alerts
     * </pre>
     */
    public java.util.Iterator<smart_home.MotionDetectionProto.MotionAlert> streamMotionAlerts(
        smart_home.MotionDetectionProto.MotionDetectionRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamMotionAlertsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MotionDetectionService.
   * <pre>
   * Service definition for Motion Detection
   * </pre>
   */
  public static final class MotionDetectionServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MotionDetectionServiceFutureStub> {
    private MotionDetectionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MotionDetectionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MotionDetectionServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_MOTION_ALERTS = 0;

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
        case METHODID_STREAM_MOTION_ALERTS:
          serviceImpl.streamMotionAlerts((smart_home.MotionDetectionProto.MotionDetectionRequest) request,
              (io.grpc.stub.StreamObserver<smart_home.MotionDetectionProto.MotionAlert>) responseObserver);
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
          getStreamMotionAlertsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              smart_home.MotionDetectionProto.MotionDetectionRequest,
              smart_home.MotionDetectionProto.MotionAlert>(
                service, METHODID_STREAM_MOTION_ALERTS)))
        .build();
  }

  private static abstract class MotionDetectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MotionDetectionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smart_home.MotionDetectionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MotionDetectionService");
    }
  }

  private static final class MotionDetectionServiceFileDescriptorSupplier
      extends MotionDetectionServiceBaseDescriptorSupplier {
    MotionDetectionServiceFileDescriptorSupplier() {}
  }

  private static final class MotionDetectionServiceMethodDescriptorSupplier
      extends MotionDetectionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MotionDetectionServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MotionDetectionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MotionDetectionServiceFileDescriptorSupplier())
              .addMethod(getStreamMotionAlertsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
