package simple.rmi.server;

import simple.rmi.shared.UpperCaseServer;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerMain {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        UpperCaseServer upperCaseServer = new UpperCaseServerImp();
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.bind("upperCase", upperCaseServer);
        System.out.println("Server started");
    }

}
