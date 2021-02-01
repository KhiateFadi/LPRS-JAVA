package manager;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.sun.jdi.connect.spi.Connection;

public class BDD {
	public void connexion_bdd() {
	// On stock dans des variables l'URL de connexion à la base de données avec les identi?ants 
	 String url="jdbc:mysql://localhost/gest?serverTimezone=UTC"; 
    String user="root"; 
    String password=""; 
    // Test pour véri?er si nous arrivons à nous connecter
    try { 
   	 // On créé une variable cnx de type Connection
   	 // cnx contiendra la connextion à la base de données
            java.sql.Connection cnx = DriverManager.getConnection(url, user, password); 
            System.out.println("Etat de la connexion :"); 
	// Forme ternaire du if. Si la condition à échoué alors on a?che « fermé » sinon on a?che « ouverte »
            System.out.println(cnx.isClosed()?"fermée":"ouverte"); 
            
    }
    // Si on arrive pas à se connetcer on attrape l'erreur pour l'a?cher ensuite
    catch (SQLException e) { 
            System.out.println("Une erreur est survenue lors de la connexion à la base de données"); 
            e.printStackTrace(); 
    } 
}


}
