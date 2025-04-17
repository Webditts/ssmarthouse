package smart_home;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: camera_streaming.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CameraStreamingServiceGrpc {

  private CameraStreamingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "CameraStreamingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smart_home.CameraStreamingProto.CameraStreamingRequest,
      smart_home.CameraStreamingProto.CameraStreamingResponse> getStreamCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamCamera",
      requestType = smart_home.CameraStreamingProto.CameraStreamingRequest.class,
      responseType = smart_home.CameraStreamingProto.CameraStreamingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<smart_home.CameraStreamingProto.CameraStreamingRequest,
      smart_home.CameraStreamingProto.CameraStreamingResponse> getStreamCameraMethod() {
    io.grpc.MethodDescriptor<smart_home.CameraStreamingProto.CameraStreamingRequest, smart_home.CameraStreamingProto.CameraStreamingResponse> getStreamCameraMethod;
    if ((getStreamCameraMethod = CameraStreamingServiceGrpc.getStreamCameraMethod) == null) {
      synchronized (CameraStreamingServiceGrpc.class) {
        if ((getStreamCameraMethod = CameraStreamingServiceGrpc.getStreamCameraMethod) == null) {
          CameraStreamingServiceGrpc.getStreamCameraMethod = getStreamCameraMethod =
              io.grpc.MethodDescriptor.<smart_home.CameraStreamingProto.CameraStreamingRequest, smart_home.CameraStreamingProto.CameraStreamingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smart_home.CameraStreamingProto.CameraStreamingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smart_home.CameraStreamingProto.CameraStreamingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CameraStreamingServiceMethodDescriptorSupplier("StreamCamera"))
              .build();
        }
      }
    }
    return getStreamCameraMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CameraStreamingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraStreamingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraStreamingServiceStub>() {
        @java.lang.Override
        public CameraStreamingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraStreamingServiceStub(channel, callOptions);
        }
      };
    return CameraStreamingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CameraStreamingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraStreamingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraStreamingServiceBlockingStub>() {
        @java.lang.Override
        public CameraStreamingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraStreamingServiceBlockingStub(channel, callOptions);
        }
      };
    return CameraStreamingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CameraStreamingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CameraStreamingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CameraStreamingServiceFutureStub>() {
        @java.lang.Override
        public CameraStreamingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CameraStreamingServiceFutureStub(channel, callOptions);
        }
      };
    return CameraStreamingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    default void streamCamera(smart_home.CameraStreamingProto.CameraStreamingRequest request,
        io.grpc.stub.StreamObserver<smart_home.CameraStreamingProto.CameraStreamingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamCameraMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CameraStreamingService.
   */
  public static abstract class CameraStreamingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CameraStreamingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CameraStreamingService.
   */
  public static final class CameraStreamingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CameraStreamingServiceStub> {
    private CameraStreamingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraStreamingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraStreamingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    public void streamCamera(smart_home.CameraStreamingProto.CameraStreamingRequest request,
        io.grpc.stub.StreamObserver<smart_home.CameraStreamingProto.CameraStreamingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamCameraMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CameraStreamingService.
   */
  public static final class CameraStreamingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CameraStreamingServiceBlockingStub> {
    private CameraStreamingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraStreamingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraStreamingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server-side streaming RPC
     * </pre>
     */
    public java.util.Iterator<smart_home.CameraStreamingProto.CameraStreamingResponse> streamCamera(
        smart_home.CameraStreamingProto.CameraStreamingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamCameraMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CameraStreamingService.
   */
  public static final class CameraStreamingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CameraStreamingServiceFutureStub> {
    private CameraStreamingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraStreamingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CameraStreamingServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_CAMERA = 0;

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
        case METHODID_STREAM_CAMERA:
          serviceImpl.streamCamera((smart_home.CameraStreamingProto.CameraStreamingRequest) request,
              (io.grpc.stub.StreamObserver<smart_home.CameraStreamingProto.CameraStreamingResponse>) responseObserver);
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
          getStreamCameraMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              smart_home.CameraStreamingProto.CameraStreamingRequest,
              smart_home.CameraStreamingProto.CameraStreamingResponse>(
                service, METHODID_STREAM_CAMERA)))
        .build();
  }

  private static abstract class CameraStreamingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CameraStreamingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smart_home.CameraStreamingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CameraStreamingService");
    }
  }

  private static final class CameraStreamingServiceFileDescriptorSupplier
      extends CameraStreamingServiceBaseDescriptorSupplier {
    CameraStreamingServiceFileDescriptorSupplier() {}
  }

  private static final class CameraStreamingServiceMethodDescriptorSupplier
      extends CameraStreamingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CameraStreamingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CameraStreamingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CameraStreamingServiceFileDescriptorSupplier())
              .addMethod(getStreamCameraMethod())
              .build();
        }
      }
    }
    return result;
  }
}
