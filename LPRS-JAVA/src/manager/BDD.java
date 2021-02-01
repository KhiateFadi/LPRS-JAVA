package manager;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.sun.jdi.connect.spi.Connection;

public class BDD {
	public void connexion_bdd() {
	// On stock dans des variables l'URL de connexion � la base de donn�es avec les identi?ants 
	 String url="jdbc:mysql://localhost/gest?serverTimezone=UTC"; 
    String user="root"; 
    String password=""; 
    // Test pour v�ri?er si nous arrivons � nous connecter
    try { 
   	 // On cr�� une variable cnx de type Connection
   	 // cnx contiendra la connextion � la base de donn�es
            java.sql.Connection cnx = DriverManager.getConnection(url, user, password); 
            System.out.println("Etat de la connexion :"); 
	// Forme ternaire du if. Si la condition � �chou� alors on a?che ��ferm頻 sinon on a?che ��ouverte��
            System.out.println(cnx.isClosed()?"ferm�e":"ouverte"); 
            
    }
    // Si on arrive pas � se connetcer on attrape l'erreur pour l'a?cher ensuite
    catch (SQLException e) { 
            System.out.println("Une erreur est survenue lors de la connexion � la base de donn�es"); 
            e.printStackTrace(); 
    } 
}


}
