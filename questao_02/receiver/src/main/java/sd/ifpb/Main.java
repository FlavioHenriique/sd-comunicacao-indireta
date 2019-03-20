package sd.ifpb;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Iniciando o Receiver");

        Server server = ServerBuilder
                .forPort(2223)
                .addService(new ReceiverImpl())
                .build();
        server.start();
        server.awaitTermination();
    }
}
