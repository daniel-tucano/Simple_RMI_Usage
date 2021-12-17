package simple.rmi.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperCaseServer extends Remote {

    String toUppercase(String inputString) throws RemoteException;

}
