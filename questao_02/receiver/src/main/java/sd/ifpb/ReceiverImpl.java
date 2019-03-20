package sd.ifpb;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.helloworld.MessageGrpc;
import io.grpc.examples.helloworld.MessageResultGrpc;
import io.grpc.examples.helloworld.ReceiverGrpc;
import io.grpc.examples.helloworld.ServerGrpc;
import io.grpc.stub.StreamObserver;

public class ReceiverImpl extends ReceiverGrpc.ReceiverImplBase {

    @Override
    public void delivery(MessageGrpc request, StreamObserver<MessageResultGrpc> responseObserver) {
        System.out.println("Recebido do Sender: " + request.getText());

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 2224)
                .usePlaintext()
                .build();

        ServerGrpc.ServerStub serverGrpc = ServerGrpc.newStub(channel);

        System.out.println("Print no Server");
        serverGrpc.print(request, new StreamObserver<MessageResultGrpc>() {
            private MessageResultGrpc resultGrpc;

            @Override
            public void onNext(MessageResultGrpc messageResultGrpc) {
                this.resultGrpc = messageResultGrpc;
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(this.resultGrpc);
                responseObserver.onCompleted();

            }
        });
    }
}
