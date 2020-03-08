package info.xpanda.labs.spring.boot.grpc.server;

import io.grpc.ServerBuilder;

/**
 * @author Paul Jiang
 * @since 20200308
 */
public class GrpcServerApplication {
    private static int port = 8883;
    private static io.grpc.Server server;

    public static void main(String[] args) throws Exception {
        server = ServerBuilder
                .forPort(port)
                .addService(new ApiStreamServer()).build();
        server.start();
        System.out.println("Server start success on port:" + port);
        server.awaitTermination();
    }
}
