package simple.rmi.client;

import simple.rmi.shared.UpperCaseServer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientMain {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost",1099);
        UpperCaseServer upperCaseServer = (UpperCaseServer) registry.lookup("upperCase");

        String input = "any string";
        String output = upperCaseServer.toUppercase(input);

        System.out.println(input);
        System.out.println(output);
    }

}
