import java.rmi.*;
import java.rmi.server.*;

public class MonServeurRMI extends UnicastRemoteObject implements MonInterfaceRMI {
    public MonServeurRMI() throws RemoteException {
        super();
    }

    public String traiterChaine(String chaine) throws RemoteException {
        // Code de traitement de la cha�ne
        return "Traitement effectu� : " + chaine.toUpperCase();
    }

    public static void main(String args[]) {
        try {
            MonServeurRMI serveur = new MonServeurRMI();
            Naming.rebind("MonServeur", serveur);
            System.out.println("Serveur pr�t.");
        } catch (Exception e) {
            System.out.println("Erreur : " + e);
        }
    }
}
