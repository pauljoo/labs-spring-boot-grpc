package info.xpanda.labs.spring.boot.grpc.client;

import info.xpanda.labs.spring.boot.grpc.api.ApiStreamGrpc;
import info.xpanda.labs.spring.boot.grpc.api.ApiStreamOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;

/**
 * @author Paul Jiang
 * @since 20200308
 */
public class GrpcClientApplication {
    public static void main(String[] args) {
        ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 8883)
                .negotiationType(NegotiationType.PLAINTEXT)
                .build();
        ApiStreamGrpc.ApiStreamBlockingStub stub = ApiStreamGrpc
                .newBlockingStub(channel);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            ApiStreamOuterClass.RequestData requestData = ApiStreamOuterClass.RequestData.newBuilder().setText("hello world").build();
            ApiStreamOuterClass.ResponseData responseData = stub.simpleFun(requestData);
            System.out.println(responseData.getText());
        }
        System.out.println(System.currentTimeMillis() - start + " MS");
        channel.shutdown();
    }
}
