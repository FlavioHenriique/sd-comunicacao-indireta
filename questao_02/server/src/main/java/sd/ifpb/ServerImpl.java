package sd.ifpb;

import io.grpc.examples.helloworld.MessageGrpc;
import io.grpc.examples.helloworld.MessageResultGrpc;
import io.grpc.examples.helloworld.ServerGrpc;
import io.grpc.stub.StreamObserver;

public class ServerImpl extends ServerGrpc.ServerImplBase {
    @Override
    public void print(MessageGrpc request, StreamObserver<MessageResultGrpc> responseObserver) {

        System.out.println("Recebendo do Receiver:" + request.getText());
        MessageResultGrpc resultGrpc = MessageResultGrpc
                .newBuilder()
                .setHash("Hash: "+ request.getText().hashCode())
                .build();

        responseObserver.onNext(resultGrpc);
        responseObserver.onCompleted();
    }
}
