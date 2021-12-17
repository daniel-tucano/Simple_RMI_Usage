package simple.rmi.server;

import simple.rmi.shared.UpperCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UpperCaseServerImp implements UpperCaseServer {

    public UpperCaseServerImp() throws RemoteException {
        UnicastRemoteObject.exportObject(this,0);
    }

    @Override
    public String toUppercase(String inputString) throws RemoteException {
        return inputString.toUpperCase();
    }

}

