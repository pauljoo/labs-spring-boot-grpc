package info.xpanda.labs.spring.boot.grpc.server;

/**
 * @author Paul Jiang
 * @since 20200308
 */
public class GrpcServerApplication {
    private static int port = 8883;
    private static io.grpc.Server server;

    public void run() {
        StreamService serviceImpl = new ServiceImpl();
        server = io.grpc.ServerBuilder.forPort(port).addService(StreamServiceGrpc.bindService(serviceImpl)).build();
        try {
            server.start();
            System.out.println("Server start success on port:" + port);
            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.run();
    }
}
