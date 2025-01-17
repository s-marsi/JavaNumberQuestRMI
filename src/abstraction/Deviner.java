package abstraction;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Deviner extends Remote {

    String devinerNombre(int proposition) throws RemoteException;

    void enregistrerJoueur() throws RemoteException;

    void quitterJeu() throws RemoteException;

    public boolean getFlag() throws RemoteException;
}
