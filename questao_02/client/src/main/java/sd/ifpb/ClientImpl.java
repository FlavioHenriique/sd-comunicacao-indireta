package sd.ifpb;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.examples.helloworld.MessageGrpc;
import io.grpc.examples.helloworld.MessageResultGrpc;
import io.grpc.examples.helloworld.SenderGrpc;
import io.grpc.stub.StreamObserver;

import java.util.logging.Logger;

public class ClientImpl {

    public int count = 0;
    private Logger logger = Logger.getLogger(ClientImpl.class.getName());

    public ClientImpl(){

    }

    public  int getCount() {
        return count;
    }

    public  void setCount(int count) {
        this.count = count;
    }

    public void enviar(String id, String texto, SenderGrpc.SenderStub stub){
        MessageGrpc messageGrpc = MessageGrpc.newBuilder()
                .setId(id)
                .setText(texto)
                .build();

        stub.sendMessage(messageGrpc, new StreamObserver<MessageResultGrpc>() {
            private MessageResultGrpc result;
            @Override
            public void onNext(MessageResultGrpc messageResultGrpc) {
                this.result = messageResultGrpc;
            }

            @Override
            public void onError(Throwable throwable) {
                logger.warning("Erro: "+ throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                logger.info("Resultado: "+ result.getHash());
                count ++;
            }
        });
    }
}
