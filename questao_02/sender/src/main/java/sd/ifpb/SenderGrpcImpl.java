package sd.ifpb;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.helloworld.MessageGrpc;
import io.grpc.examples.helloworld.MessageResultGrpc;
import io.grpc.examples.helloworld.ReceiverGrpc;
import io.grpc.examples.helloworld.SenderGrpc;
import io.grpc.stub.StreamObserver;

import java.util.logging.Logger;

public class SenderGrpcImpl extends SenderGrpc.SenderImplBase {

    private Logger logger = Logger.getLogger(SenderGrpcImpl.class.getName());

    public SenderGrpcImpl() {
        System.out.println("iniciou sender");
    }

    @Override
    public void sendMessage(MessageGrpc request, StreamObserver<MessageResultGrpc> responseObserver) {
        logger.info("Recebendo do client: " + request.getText());
        ManagedChannel channelReceiver = ManagedChannelBuilder
                .forAddress("localhost", 2223)
                .usePlaintext()
                .build();

        ReceiverGrpc.ReceiverStub stub = ReceiverGrpc.newStub(channelReceiver);
        stub.delivery(request, new StreamObserver<MessageResultGrpc>() {
            private MessageResultGrpc resultGrpc;
            @Override
            public void onNext(MessageResultGrpc value) {
                this.resultGrpc = value;
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(this.resultGrpc);
                responseObserver.onCompleted();
            }
        });
    }

}
