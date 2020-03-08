package info.xpanda.labs.spring.boot.grpc.server;

import info.xpanda.labs.spring.boot.grpc.api.ApiStreamGrpc;
import info.xpanda.labs.spring.boot.grpc.api.ApiStreamOuterClass;
import io.grpc.stub.StreamObserver;

/**
 * @author Paul Jiang
 * @since 20200308
 */
public class ApiStreamServer extends ApiStreamGrpc.ApiStreamImplBase {
    /**
     * 单次RPC
     * @param request
     * @param responseObserver
     */
    @Override
    public void simpleFun(ApiStreamOuterClass.RequestData request, StreamObserver<ApiStreamOuterClass.ResponseData> responseObserver) {
        System.out.println("简单RPC 请求参数：" + request.getText());
        responseObserver.onNext(ApiStreamOuterClass.ResponseData.newBuilder().setText("hello gRPC").build());
        responseObserver.onCompleted();
    }

    /**
     * 服务端流式RPC
     * @param request
     * @param responseObserver
     */
    @Override
    public void serverSideStreamFun(ApiStreamOuterClass.RequestData request, StreamObserver<ApiStreamOuterClass.ResponseData> responseObserver) {
        System.out.println("服务端流式RPC 请求参数：" + request.getText());
        for(int i = 0; i < 10; i++){
            responseObserver.onNext(ApiStreamOuterClass.ResponseData.newBuilder().setText("hello gRPC").build());
        }
        responseObserver.onCompleted();
    }

    /**
     * 客户端流式RPC
     * @param responseObserver
     * @return
     */
    @Override
    public StreamObserver<ApiStreamOuterClass.RequestData> clientSideStreamFun(StreamObserver<ApiStreamOuterClass.ResponseData> responseObserver) {
        return new StreamObserver<ApiStreamOuterClass.RequestData>() {
            @Override
            public void onNext(ApiStreamOuterClass.RequestData requestData) {
                System.out.println("客户端流式RPC 请求参数：" + requestData.getText());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    /**
     * 双向流式RPC
     * @param responseObserver
     * @return
     */
    @Override
    public StreamObserver<ApiStreamOuterClass.RequestData> twoWayStreamFun(StreamObserver<ApiStreamOuterClass.ResponseData> responseObserver) {
        return new StreamObserver<ApiStreamOuterClass.RequestData>() {
            @Override
            public void onNext(ApiStreamOuterClass.RequestData requestData) {
                System.out.println("客户端流式RPC 请求参数：" + requestData.getText());
                responseObserver.onNext(ApiStreamOuterClass.ResponseData.newBuilder().setText("hello gRPC").build());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
