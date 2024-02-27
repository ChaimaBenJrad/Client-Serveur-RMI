import java.rmi.*;

public class MonClientRMI {
    public static void main(String args[]) {
        try {
            MonInterfaceRMI serveur = (MonInterfaceRMI) Naming.lookup("rmi://localhost/MonServeur");
            String resultat = serveur.traiterChaine("Hello, world!");
            System.out.println("Résultat du serveur : " + resultat);
        } catch (Exception e) {
            System.out.println("Erreur : " + e);
        }
    }
}
