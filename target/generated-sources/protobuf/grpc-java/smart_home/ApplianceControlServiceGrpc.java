package smart_home;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: appliance_control.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ApplianceControlServiceGrpc {

  private ApplianceControlServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ApplianceControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smart_home.ApplianceControlProto.ApplianceControlRequest,
      smart_home.ApplianceControlProto.ApplianceControlResponse> getToggleApplianceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "toggleAppliance",
      requestType = smart_home.ApplianceControlProto.ApplianceControlRequest.class,
      responseType = smart_home.ApplianceControlProto.ApplianceControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smart_home.ApplianceControlProto.ApplianceControlRequest,
      smart_home.ApplianceControlProto.ApplianceControlResponse> getToggleApplianceMethod() {
    io.grpc.MethodDescriptor<smart_home.ApplianceControlProto.ApplianceControlRequest, smart_home.ApplianceControlProto.ApplianceControlResponse> getToggleApplianceMethod;
    if ((getToggleApplianceMethod = ApplianceControlServiceGrpc.getToggleApplianceMethod) == null) {
      synchronized (ApplianceControlServiceGrpc.class) {
        if ((getToggleApplianceMethod = ApplianceControlServiceGrpc.getToggleApplianceMethod) == null) {
          ApplianceControlServiceGrpc.getToggleApplianceMethod = getToggleApplianceMethod =
              io.grpc.MethodDescriptor.<smart_home.ApplianceControlProto.ApplianceControlRequest, smart_home.ApplianceControlProto.ApplianceControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "toggleAppliance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smart_home.ApplianceControlProto.ApplianceControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smart_home.ApplianceControlProto.ApplianceControlResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ApplianceControlServiceMethodDescriptorSupplier("toggleAppliance"))
              .build();
        }
      }
    }
    return getToggleApplianceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApplianceControlServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplianceControlServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplianceControlServiceStub>() {
        @java.lang.Override
        public ApplianceControlServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplianceControlServiceStub(channel, callOptions);
        }
      };
    return ApplianceControlServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApplianceControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplianceControlServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplianceControlServiceBlockingStub>() {
        @java.lang.Override
        public ApplianceControlServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplianceControlServiceBlockingStub(channel, callOptions);
        }
      };
    return ApplianceControlServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApplianceControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApplianceControlServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApplianceControlServiceFutureStub>() {
        @java.lang.Override
        public ApplianceControlServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApplianceControlServiceFutureStub(channel, callOptions);
        }
      };
    return ApplianceControlServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void toggleAppliance(smart_home.ApplianceControlProto.ApplianceControlRequest request,
        io.grpc.stub.StreamObserver<smart_home.ApplianceControlProto.ApplianceControlResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getToggleApplianceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ApplianceControlService.
   */
  public static abstract class ApplianceControlServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ApplianceControlServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ApplianceControlService.
   */
  public static final class ApplianceControlServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ApplianceControlServiceStub> {
    private ApplianceControlServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplianceControlServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplianceControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void toggleAppliance(smart_home.ApplianceControlProto.ApplianceControlRequest request,
        io.grpc.stub.StreamObserver<smart_home.ApplianceControlProto.ApplianceControlResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getToggleApplianceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ApplianceControlService.
   */
  public static final class ApplianceControlServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ApplianceControlServiceBlockingStub> {
    private ApplianceControlServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplianceControlServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplianceControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smart_home.ApplianceControlProto.ApplianceControlResponse toggleAppliance(smart_home.ApplianceControlProto.ApplianceControlRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getToggleApplianceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ApplianceControlService.
   */
  public static final class ApplianceControlServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ApplianceControlServiceFutureStub> {
    private ApplianceControlServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplianceControlServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApplianceControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smart_home.ApplianceControlProto.ApplianceControlResponse> toggleAppliance(
        smart_home.ApplianceControlProto.ApplianceControlRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getToggleApplianceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOGGLE_APPLIANCE = 0;

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
        case METHODID_TOGGLE_APPLIANCE:
          serviceImpl.toggleAppliance((smart_home.ApplianceControlProto.ApplianceControlRequest) request,
              (io.grpc.stub.StreamObserver<smart_home.ApplianceControlProto.ApplianceControlResponse>) responseObserver);
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
          getToggleApplianceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smart_home.ApplianceControlProto.ApplianceControlRequest,
              smart_home.ApplianceControlProto.ApplianceControlResponse>(
                service, METHODID_TOGGLE_APPLIANCE)))
        .build();
  }

  private static abstract class ApplianceControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApplianceControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smart_home.ApplianceControlProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApplianceControlService");
    }
  }

  private static final class ApplianceControlServiceFileDescriptorSupplier
      extends ApplianceControlServiceBaseDescriptorSupplier {
    ApplianceControlServiceFileDescriptorSupplier() {}
  }

  private static final class ApplianceControlServiceMethodDescriptorSupplier
      extends ApplianceControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ApplianceControlServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ApplianceControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApplianceControlServiceFileDescriptorSupplier())
              .addMethod(getToggleApplianceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
