import com.gauri.grpc.HelloRequest;
import com.gauri.grpc.HelloResponse;
import com.gauri.grpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub
                = HelloServiceGrpc.newBlockingStub(channel);
        System.out.println("Hello From client");
        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
                .setFirstName("Gauri")
                .setLastName("Shankar")
                .build());
        System.out.println(helloResponse);
        channel.shutdown();
    }
}
