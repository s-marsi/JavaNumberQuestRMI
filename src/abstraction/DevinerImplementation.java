package abstraction;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DevinerImplementation extends UnicastRemoteObject implements Deviner{
    private int nombreCible;
    private boolean flag;

    public DevinerImplementation() throws RemoteException {
        super();
        this.nombreCible = new Random().nextInt(1000) + 1; // Nombre aléatoire entre 1 et 1000
        flag = false;
    }

    @Override
    public String devinerNombre(int proposition) throws RemoteException {
        if (flag){
            return "Un autre joueur a déjà gagné !";
        }
        if (proposition == nombreCible) {
            flag = true;
            return "Correct ! vous avez a gagné !";
        } else if (proposition < nombreCible) {
            return "C'est trop bas ! Essayez un nombre plus grand !";
        } else {
            return "C'est trop haut ! Essayez un nombre plus petit !";
        }
    }

    @Override
    public void enregistrerJoueur() throws RemoteException {
        System.out.println("Joueur enregistré.");
    }

    @Override
    public void quitterJeu() throws RemoteException {
        System.out.println("Un joueur a quitté le jeu.");
    }

    public boolean getFlag() throws RemoteException {
        return (flag);
    }
}
