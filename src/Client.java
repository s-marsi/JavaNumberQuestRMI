import abstraction.Deviner;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            // Obtenir le registre RMI
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Rechercher l'objet distant
            Deviner game = (Deviner) registry.lookup("DevinerJeu");
            // Enregistrer le joueur
            game.enregistrerJoueur();

            Scanner scanner = new Scanner(System.in);
            // Boucle de jeu
            while (true) {
                System.out.print("Entrez un nombre (ou 'exit' pour quitter) : ");
                String input = scanner.nextLine();

                // Si le joueur tape 'exit', quitter le jeu
                if (input.equalsIgnoreCase("exit")) {
                    game.quitterJeu();
                    System.out.println("Vous avez quitté le jeu. Au revoir !");
                    break;
                }

                // Convertir l'entrée en nombre
                try {
                    int proposition = Integer.parseInt(input);

                    // Envoyer la proposition au serveur
                    String resultat = game.devinerNombre(proposition);
                    System.out.println(resultat);

                    // Si le joueur a gagné, quitter la boucle
                    if (game.getFlag()) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrée invalide. Veuillez entrer un nombre ou 'exit'.");
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("Erreur client : " + e.getMessage());
            e.printStackTrace();
        }
    }
}