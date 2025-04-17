package smarthome;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: SmartHouse.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DeviceServiceGrpc {

  private DeviceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "smarthome.DeviceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<smarthome.SmartHouse.DeviceRequest,
      smarthome.SmartHouse.DeviceResponse> getTurnOnDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOnDevice",
      requestType = smarthome.SmartHouse.DeviceRequest.class,
      responseType = smarthome.SmartHouse.DeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smarthome.SmartHouse.DeviceRequest,
      smarthome.SmartHouse.DeviceResponse> getTurnOnDeviceMethod() {
    io.grpc.MethodDescriptor<smarthome.SmartHouse.DeviceRequest, smarthome.SmartHouse.DeviceResponse> getTurnOnDeviceMethod;
    if ((getTurnOnDeviceMethod = DeviceServiceGrpc.getTurnOnDeviceMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getTurnOnDeviceMethod = DeviceServiceGrpc.getTurnOnDeviceMethod) == null) {
          DeviceServiceGrpc.getTurnOnDeviceMethod = getTurnOnDeviceMethod =
              io.grpc.MethodDescriptor.<smarthome.SmartHouse.DeviceRequest, smarthome.SmartHouse.DeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOnDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarthome.SmartHouse.DeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarthome.SmartHouse.DeviceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("TurnOnDevice"))
              .build();
        }
      }
    }
    return getTurnOnDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<smarthome.SmartHouse.DeviceRequest,
      smarthome.SmartHouse.DeviceResponse> getTurnOffDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TurnOffDevice",
      requestType = smarthome.SmartHouse.DeviceRequest.class,
      responseType = smarthome.SmartHouse.DeviceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<smarthome.SmartHouse.DeviceRequest,
      smarthome.SmartHouse.DeviceResponse> getTurnOffDeviceMethod() {
    io.grpc.MethodDescriptor<smarthome.SmartHouse.DeviceRequest, smarthome.SmartHouse.DeviceResponse> getTurnOffDeviceMethod;
    if ((getTurnOffDeviceMethod = DeviceServiceGrpc.getTurnOffDeviceMethod) == null) {
      synchronized (DeviceServiceGrpc.class) {
        if ((getTurnOffDeviceMethod = DeviceServiceGrpc.getTurnOffDeviceMethod) == null) {
          DeviceServiceGrpc.getTurnOffDeviceMethod = getTurnOffDeviceMethod =
              io.grpc.MethodDescriptor.<smarthome.SmartHouse.DeviceRequest, smarthome.SmartHouse.DeviceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TurnOffDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarthome.SmartHouse.DeviceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  smarthome.SmartHouse.DeviceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeviceServiceMethodDescriptorSupplier("TurnOffDevice"))
              .build();
        }
      }
    }
    return getTurnOffDeviceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceStub>() {
        @java.lang.Override
        public DeviceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceStub(channel, callOptions);
        }
      };
    return DeviceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceBlockingStub>() {
        @java.lang.Override
        public DeviceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceBlockingStub(channel, callOptions);
        }
      };
    return DeviceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeviceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeviceServiceFutureStub>() {
        @java.lang.Override
        public DeviceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeviceServiceFutureStub(channel, callOptions);
        }
      };
    return DeviceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void turnOnDevice(smarthome.SmartHouse.DeviceRequest request,
        io.grpc.stub.StreamObserver<smarthome.SmartHouse.DeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOnDeviceMethod(), responseObserver);
    }

    /**
     */
    default void turnOffDevice(smarthome.SmartHouse.DeviceRequest request,
        io.grpc.stub.StreamObserver<smarthome.SmartHouse.DeviceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTurnOffDeviceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DeviceService.
   */
  public static abstract class DeviceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DeviceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DeviceService.
   */
  public static final class DeviceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DeviceServiceStub> {
    private DeviceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceStub(channel, callOptions);
    }

    /**
     */
    public void turnOnDevice(smarthome.SmartHouse.DeviceRequest request,
        io.grpc.stub.StreamObserver<smarthome.SmartHouse.DeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOnDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOffDevice(smarthome.SmartHouse.DeviceRequest request,
        io.grpc.stub.StreamObserver<smarthome.SmartHouse.DeviceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTurnOffDeviceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DeviceService.
   */
  public static final class DeviceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DeviceServiceBlockingStub> {
    private DeviceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public smarthome.SmartHouse.DeviceResponse turnOnDevice(smarthome.SmartHouse.DeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOnDeviceMethod(), getCallOptions(), request);
    }

    /**
     */
    public smarthome.SmartHouse.DeviceResponse turnOffDevice(smarthome.SmartHouse.DeviceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTurnOffDeviceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DeviceService.
   */
  public static final class DeviceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DeviceServiceFutureStub> {
    private DeviceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeviceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smarthome.SmartHouse.DeviceResponse> turnOnDevice(
        smarthome.SmartHouse.DeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOnDeviceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<smarthome.SmartHouse.DeviceResponse> turnOffDevice(
        smarthome.SmartHouse.DeviceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTurnOffDeviceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON_DEVICE = 0;
  private static final int METHODID_TURN_OFF_DEVICE = 1;

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
        case METHODID_TURN_ON_DEVICE:
          serviceImpl.turnOnDevice((smarthome.SmartHouse.DeviceRequest) request,
              (io.grpc.stub.StreamObserver<smarthome.SmartHouse.DeviceResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF_DEVICE:
          serviceImpl.turnOffDevice((smarthome.SmartHouse.DeviceRequest) request,
              (io.grpc.stub.StreamObserver<smarthome.SmartHouse.DeviceResponse>) responseObserver);
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
          getTurnOnDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smarthome.SmartHouse.DeviceRequest,
              smarthome.SmartHouse.DeviceResponse>(
                service, METHODID_TURN_ON_DEVICE)))
        .addMethod(
          getTurnOffDeviceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              smarthome.SmartHouse.DeviceRequest,
              smarthome.SmartHouse.DeviceResponse>(
                service, METHODID_TURN_OFF_DEVICE)))
        .build();
  }

  private static abstract class DeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeviceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return smarthome.SmartHouse.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeviceService");
    }
  }

  private static final class DeviceServiceFileDescriptorSupplier
      extends DeviceServiceBaseDescriptorSupplier {
    DeviceServiceFileDescriptorSupplier() {}
  }

  private static final class DeviceServiceMethodDescriptorSupplier
      extends DeviceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DeviceServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DeviceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceServiceFileDescriptorSupplier())
              .addMethod(getTurnOnDeviceMethod())
              .addMethod(getTurnOffDeviceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
