package sd.ifpb;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.helloworld.SenderGrpc;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ClientImpl client = new ClientImpl();
        int max = 100;

        for (int k = 0; k < max; k++) {
            final int id = k;

            Thread t = new Thread() {
                @Override
                public void run() {
                    ManagedChannel channel = ManagedChannelBuilder
                            .forAddress("client", 2222)
                            .usePlaintext()
                            .build();
                    SenderGrpc.SenderStub stub = SenderGrpc.newStub(channel);

                    System.out.println("Enviando mensagem " + id + " para o Sender");
                    client.enviar(id + "", "Opa", stub);
                }
            };
            t.start();
        }
        while (client.getCount() < max) {
            continue;
        }
        System.exit(0);
    }
}
