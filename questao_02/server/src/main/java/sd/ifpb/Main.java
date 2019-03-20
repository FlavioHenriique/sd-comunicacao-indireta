package sd.ifpb;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

	public static void main(String[] args) throws IOException, AlreadyBoundException, InterruptedException {

        Server server = ServerBuilder
                .forPort(2224)
                .addService(new ServerImpl())
                .build();
        System.out.println("Servidor inicializado");
        server.start();
        server.awaitTermination();



	}
	
}
