import java.rmi.*;

public interface MonInterfaceRMI extends Remote {
    public String traiterChaine(String chaine) throws RemoteException;
}
