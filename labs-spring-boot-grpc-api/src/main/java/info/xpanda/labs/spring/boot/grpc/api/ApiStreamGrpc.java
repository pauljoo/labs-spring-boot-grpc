package info.xpanda.labs.spring.boot.grpc.api;

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
    value = "by gRPC proto compiler (version 1.27.2)",
    comments = "Source: api_stream.proto")
public final class ApiStreamGrpc {

  private ApiStreamGrpc() {}

  public static final String SERVICE_NAME = "info.xpanda.labs.spring.boot.grpc.api.ApiStream";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ApiStreamOuterClass.RequestData,
      ApiStreamOuterClass.ResponseData> getSimpleFunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimpleFun",
      requestType = ApiStreamOuterClass.RequestData.class,
      responseType = ApiStreamOuterClass.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ApiStreamOuterClass.RequestData,
      ApiStreamOuterClass.ResponseData> getSimpleFunMethod() {
    io.grpc.MethodDescriptor<ApiStreamOuterClass.RequestData, ApiStreamOuterClass.ResponseData> getSimpleFunMethod;
    if ((getSimpleFunMethod = ApiStreamGrpc.getSimpleFunMethod) == null) {
      synchronized (ApiStreamGrpc.class) {
        if ((getSimpleFunMethod = ApiStreamGrpc.getSimpleFunMethod) == null) {
          ApiStreamGrpc.getSimpleFunMethod = getSimpleFunMethod =
              io.grpc.MethodDescriptor.<ApiStreamOuterClass.RequestData, ApiStreamOuterClass.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SimpleFun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ApiStreamOuterClass.RequestData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ApiStreamOuterClass.ResponseData.getDefaultInstance()))
              .setSchemaDescriptor(new ApiStreamMethodDescriptorSupplier("SimpleFun"))
              .build();
        }
      }
    }
    return getSimpleFunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ApiStreamOuterClass.RequestData,
      ApiStreamOuterClass.ResponseData> getServerSideStreamFunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerSideStreamFun",
      requestType = ApiStreamOuterClass.RequestData.class,
      responseType = ApiStreamOuterClass.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ApiStreamOuterClass.RequestData,
      ApiStreamOuterClass.ResponseData> getServerSideStreamFunMethod() {
    io.grpc.MethodDescriptor<ApiStreamOuterClass.RequestData, ApiStreamOuterClass.ResponseData> getServerSideStreamFunMethod;
    if ((getServerSideStreamFunMethod = ApiStreamGrpc.getServerSideStreamFunMethod) == null) {
      synchronized (ApiStreamGrpc.class) {
        if ((getServerSideStreamFunMethod = ApiStreamGrpc.getServerSideStreamFunMethod) == null) {
          ApiStreamGrpc.getServerSideStreamFunMethod = getServerSideStreamFunMethod =
              io.grpc.MethodDescriptor.<ApiStreamOuterClass.RequestData, ApiStreamOuterClass.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerSideStreamFun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ApiStreamOuterClass.RequestData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ApiStreamOuterClass.ResponseData.getDefaultInstance()))
              .setSchemaDescriptor(new ApiStreamMethodDescriptorSupplier("ServerSideStreamFun"))
              .build();
        }
      }
    }
    return getServerSideStreamFunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ApiStreamOuterClass.RequestData,
      ApiStreamOuterClass.ResponseData> getClientSideStreamFunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientSideStreamFun",
      requestType = ApiStreamOuterClass.RequestData.class,
      responseType = ApiStreamOuterClass.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ApiStreamOuterClass.RequestData,
      ApiStreamOuterClass.ResponseData> getClientSideStreamFunMethod() {
    io.grpc.MethodDescriptor<ApiStreamOuterClass.RequestData, ApiStreamOuterClass.ResponseData> getClientSideStreamFunMethod;
    if ((getClientSideStreamFunMethod = ApiStreamGrpc.getClientSideStreamFunMethod) == null) {
      synchronized (ApiStreamGrpc.class) {
        if ((getClientSideStreamFunMethod = ApiStreamGrpc.getClientSideStreamFunMethod) == null) {
          ApiStreamGrpc.getClientSideStreamFunMethod = getClientSideStreamFunMethod =
              io.grpc.MethodDescriptor.<ApiStreamOuterClass.RequestData, ApiStreamOuterClass.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClientSideStreamFun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ApiStreamOuterClass.RequestData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ApiStreamOuterClass.ResponseData.getDefaultInstance()))
              .setSchemaDescriptor(new ApiStreamMethodDescriptorSupplier("ClientSideStreamFun"))
              .build();
        }
      }
    }
    return getClientSideStreamFunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ApiStreamOuterClass.RequestData,
      ApiStreamOuterClass.ResponseData> getTwoWayStreamFunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TwoWayStreamFun",
      requestType = ApiStreamOuterClass.RequestData.class,
      responseType = ApiStreamOuterClass.ResponseData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ApiStreamOuterClass.RequestData,
      ApiStreamOuterClass.ResponseData> getTwoWayStreamFunMethod() {
    io.grpc.MethodDescriptor<ApiStreamOuterClass.RequestData, ApiStreamOuterClass.ResponseData> getTwoWayStreamFunMethod;
    if ((getTwoWayStreamFunMethod = ApiStreamGrpc.getTwoWayStreamFunMethod) == null) {
      synchronized (ApiStreamGrpc.class) {
        if ((getTwoWayStreamFunMethod = ApiStreamGrpc.getTwoWayStreamFunMethod) == null) {
          ApiStreamGrpc.getTwoWayStreamFunMethod = getTwoWayStreamFunMethod =
              io.grpc.MethodDescriptor.<ApiStreamOuterClass.RequestData, ApiStreamOuterClass.ResponseData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TwoWayStreamFun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ApiStreamOuterClass.RequestData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ApiStreamOuterClass.ResponseData.getDefaultInstance()))
              .setSchemaDescriptor(new ApiStreamMethodDescriptorSupplier("TwoWayStreamFun"))
              .build();
        }
      }
    }
    return getTwoWayStreamFunMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiStreamStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiStreamStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiStreamStub>() {
        @Override
        public ApiStreamStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiStreamStub(channel, callOptions);
        }
      };
    return ApiStreamStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApiStreamBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiStreamBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiStreamBlockingStub>() {
        @Override
        public ApiStreamBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiStreamBlockingStub(channel, callOptions);
        }
      };
    return ApiStreamBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApiStreamFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiStreamFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiStreamFutureStub>() {
        @Override
        public ApiStreamFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiStreamFutureStub(channel, callOptions);
        }
      };
    return ApiStreamFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ApiStreamImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *简单rpc
     * </pre>
     */
    public void simpleFun(ApiStreamOuterClass.RequestData request,
        io.grpc.stub.StreamObserver<ApiStreamOuterClass.ResponseData> responseObserver) {
      asyncUnimplementedUnaryCall(getSimpleFunMethod(), responseObserver);
    }

    /**
     * <pre>
     *服务器端流式rpc
     * </pre>
     */
    public void serverSideStreamFun(ApiStreamOuterClass.RequestData request,
        io.grpc.stub.StreamObserver<ApiStreamOuterClass.ResponseData> responseObserver) {
      asyncUnimplementedUnaryCall(getServerSideStreamFunMethod(), responseObserver);
    }

    /**
     * <pre>
     *客户端流式rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ApiStreamOuterClass.RequestData> clientSideStreamFun(
        io.grpc.stub.StreamObserver<ApiStreamOuterClass.ResponseData> responseObserver) {
      return asyncUnimplementedStreamingCall(getClientSideStreamFunMethod(), responseObserver);
    }

    /**
     * <pre>
     *双向流式rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ApiStreamOuterClass.RequestData> twoWayStreamFun(
        io.grpc.stub.StreamObserver<ApiStreamOuterClass.ResponseData> responseObserver) {
      return asyncUnimplementedStreamingCall(getTwoWayStreamFunMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSimpleFunMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ApiStreamOuterClass.RequestData,
                ApiStreamOuterClass.ResponseData>(
                  this, METHODID_SIMPLE_FUN)))
          .addMethod(
            getServerSideStreamFunMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ApiStreamOuterClass.RequestData,
                ApiStreamOuterClass.ResponseData>(
                  this, METHODID_SERVER_SIDE_STREAM_FUN)))
          .addMethod(
            getClientSideStreamFunMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ApiStreamOuterClass.RequestData,
                ApiStreamOuterClass.ResponseData>(
                  this, METHODID_CLIENT_SIDE_STREAM_FUN)))
          .addMethod(
            getTwoWayStreamFunMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ApiStreamOuterClass.RequestData,
                ApiStreamOuterClass.ResponseData>(
                  this, METHODID_TWO_WAY_STREAM_FUN)))
          .build();
    }
  }

  /**
   */
  public static final class ApiStreamStub extends io.grpc.stub.AbstractAsyncStub<ApiStreamStub> {
    private ApiStreamStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ApiStreamStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiStreamStub(channel, callOptions);
    }

    /**
     * <pre>
     *简单rpc
     * </pre>
     */
    public void simpleFun(ApiStreamOuterClass.RequestData request,
        io.grpc.stub.StreamObserver<ApiStreamOuterClass.ResponseData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSimpleFunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *服务器端流式rpc
     * </pre>
     */
    public void serverSideStreamFun(ApiStreamOuterClass.RequestData request,
        io.grpc.stub.StreamObserver<ApiStreamOuterClass.ResponseData> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getServerSideStreamFunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *客户端流式rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ApiStreamOuterClass.RequestData> clientSideStreamFun(
        io.grpc.stub.StreamObserver<ApiStreamOuterClass.ResponseData> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClientSideStreamFunMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *双向流式rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ApiStreamOuterClass.RequestData> twoWayStreamFun(
        io.grpc.stub.StreamObserver<ApiStreamOuterClass.ResponseData> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getTwoWayStreamFunMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ApiStreamBlockingStub extends io.grpc.stub.AbstractBlockingStub<ApiStreamBlockingStub> {
    private ApiStreamBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ApiStreamBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiStreamBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *简单rpc
     * </pre>
     */
    public ApiStreamOuterClass.ResponseData simpleFun(ApiStreamOuterClass.RequestData request) {
      return blockingUnaryCall(
          getChannel(), getSimpleFunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *服务器端流式rpc
     * </pre>
     */
    public java.util.Iterator<ApiStreamOuterClass.ResponseData> serverSideStreamFun(
        ApiStreamOuterClass.RequestData request) {
      return blockingServerStreamingCall(
          getChannel(), getServerSideStreamFunMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ApiStreamFutureStub extends io.grpc.stub.AbstractFutureStub<ApiStreamFutureStub> {
    private ApiStreamFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ApiStreamFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiStreamFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *简单rpc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ApiStreamOuterClass.ResponseData> simpleFun(
        ApiStreamOuterClass.RequestData request) {
      return futureUnaryCall(
          getChannel().newCall(getSimpleFunMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIMPLE_FUN = 0;
  private static final int METHODID_SERVER_SIDE_STREAM_FUN = 1;
  private static final int METHODID_CLIENT_SIDE_STREAM_FUN = 2;
  private static final int METHODID_TWO_WAY_STREAM_FUN = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApiStreamImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApiStreamImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIMPLE_FUN:
          serviceImpl.simpleFun((ApiStreamOuterClass.RequestData) request,
              (io.grpc.stub.StreamObserver<ApiStreamOuterClass.ResponseData>) responseObserver);
          break;
        case METHODID_SERVER_SIDE_STREAM_FUN:
          serviceImpl.serverSideStreamFun((ApiStreamOuterClass.RequestData) request,
              (io.grpc.stub.StreamObserver<ApiStreamOuterClass.ResponseData>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLIENT_SIDE_STREAM_FUN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientSideStreamFun(
              (io.grpc.stub.StreamObserver<ApiStreamOuterClass.ResponseData>) responseObserver);
        case METHODID_TWO_WAY_STREAM_FUN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.twoWayStreamFun(
              (io.grpc.stub.StreamObserver<ApiStreamOuterClass.ResponseData>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ApiStreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApiStreamBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ApiStreamOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApiStream");
    }
  }

  private static final class ApiStreamFileDescriptorSupplier
      extends ApiStreamBaseDescriptorSupplier {
    ApiStreamFileDescriptorSupplier() {}
  }

  private static final class ApiStreamMethodDescriptorSupplier
      extends ApiStreamBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApiStreamMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ApiStreamGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApiStreamFileDescriptorSupplier())
              .addMethod(getSimpleFunMethod())
              .addMethod(getServerSideStreamFunMethod())
              .addMethod(getClientSideStreamFunMethod())
              .addMethod(getTwoWayStreamFunMethod())
              .build();
        }
      }
    }
    return result;
  }
}
