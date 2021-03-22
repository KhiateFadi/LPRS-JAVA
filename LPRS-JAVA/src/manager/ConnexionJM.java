 package manager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;

import View.Accueil;
import View.accueil_prof;
import View.connexion;
import View.profils_admin;
import mail.EnvoyerEmail;
/**
 *
 * @author Said
 */
public class ConnexionJM {
 private Connection cnx;
 private Statement st;
 private ResultSet rst;
  
    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
         //AjouterP(100,"AAAA",50.50,15,"Informatique",1);
        //SupprimerParID(3);
        //recherchePparLibelle("SOURIS11");
       // ModifierP(1,"XXXXXX",100.50,2,"Mécanique",2 );
        //  try{
        //      cnx=connecterDB(); 
         //     st=cnx.createStatement();
           //   rst=st.executeQuery("SELECT * FROM utilisateur");
              
          //    while(rst.next()){
           //       System.out.print(rst.getString("nom")+"\t");
            //      System.out.print(rst.getString("prenom")+"\t");
            //      System.out.print(rst.getString("mail")+"\t");
             //     System.out.print(rst.getString("mdp")+"\t");
             //     System.out.println();
           //   }
         // }catch(Exception ex){
          //    ex.printStackTrace();
        //  } 
     
   // }
    
  
    
    public Connection  connecterDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver oki");
            String url="jdbc:mysql://localhost/gest?serverTimezone=UTC"; 
            String user="root";
            String password="" ;
           Connection cnx=DriverManager.getConnection(url,user,password);
            System.out.println("Connexion bien établie");
            return cnx;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public void AjouterAbs(String nom,String prenom,String classe,String date){
        try{
            String query="INSERT INTO absence(nom,prenom,classe,date) VALUES('"+nom+"','"+prenom+"','"+classe+"','"+date+"')";
            System.out.println(query);
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Bien ajouté");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void AjouterRetard(String nom,String prenom,String classe,String date){
        try{
            String query="INSERT INTO retard(nom,prenom,classe,date) VALUES('"+nom+"','"+prenom+"','"+classe+"','"+date+"')";
            System.out.println(query);
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Bien ajouté");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
    public boolean AjouterP(String nom,String prenom,String mail,String mdp) throws MessagingException{
    	boolean test = false;
        try{
            String query="INSERT INTO utilisateur(nom,prenom,mail,mdp) VALUES('"+nom+"','"+prenom+"','"+mail+"','"+mdp+"')";
            System.out.println(query);
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Bien ajouté");
            test = true;
            String text = "Bienvenue ! ";
			EnvoyerEmail.envoyer(mail, text);
         }catch(SQLException e){
             System.out.println(e.getMessage());
         }
         return test;
     }
        
    public boolean AjouterETUD(String nom,String prenom,String mail,String mdp,String classe) throws MessagingException{
    	boolean test = false;
        try{
            String query="INSERT INTO etudiant(nom,prenom,mail,mdp,classe) VALUES('"+nom+"','"+prenom+"','"+mail+"','"+mdp+"','"+classe+"')";
            System.out.println(query);
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Bien ajouté");
         }catch(SQLException e){
             System.out.println(e.getMessage());
         }
		return test;
         
     }
        
    
   
    public void SupprimerParID(int id){
        try{
           String query="DELETE FROM utilisateur WHERE id="+id; 
           cnx=connecterDB();
           st=cnx.createStatement();
           st.executeUpdate(query);
           System.out.println("Bien supprimé");
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
   
    public void recherche(String mail, String pass){
        try{
           String query="SELECT * FROM utilisateur WHERE mail='"+mail+"' AND mdp='"+pass+"'"; 
           cnx=connecterDB();
           st=cnx.createStatement();
           rst= st.executeQuery(query);
          
           if(rst.next()){
               System.out.println("Trouve");
               accueil_prof accueil=new accueil_prof();
               accueil.run();
           }else{
                System.out.println("pas trouve");
               
           }
           
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public void rechercheadm(String mail, String mdp){
        try{
           String query="SELECT * FROM utilisateur WHERE mail='"+mail+"' AND mdp='"+mdp+"'"; 
           cnx=connecterDB();
           st=cnx.createStatement();
           rst= st.executeQuery(query);
          
           if(rst.next()){
               System.out.println("Trouve");
               profils_admin profils_admin=new profils_admin();
               profils_admin.run();
           }else{
                System.out.println("pas trouve");
               
           }
           
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }
    
   public void ModifierP(int id,String nom,String prenom,String mail,String mdp){
       try{
           String query="UPDATE utilisateur SET nom='"+nom
                   +"', prenom="+prenom
                   +", mail="+mail
                   +", mdp='"+mdp
                   +" WHERE id="+id;
           cnx=connecterDB();
           st=cnx.createStatement();
           st.executeUpdate(query);
           System.out.println("Bien modifié");
           
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
       
       
   }

   public void AjouterSanction(String nom,String prenom,String classe,String sanction){
       try{
           String query="INSERT INTO sanction(nom,prenom,classe,sanction) VALUES('"+nom+"','"+prenom+"','"+classe+"','"+sanction+"')";
           System.out.println(query);
           cnx=connecterDB();
           st=cnx.createStatement();
           st.executeUpdate(query);
           System.out.println("Bien ajouté");
           
       }catch(SQLException e){
           System.err.println(e.getMessage());
       }
   }
   public List<String> rechercheclasse() throws SQLException{
       
       String query="SELECT nom FROM classe "; 
       cnx=connecterDB();
       st=cnx.createStatement();
       rst= st.executeQuery(query);
      List<String> Classe = new ArrayList<String>();
       while(rst.next()){
           Classe.add(rst.getString("nom"));
       }
       return Classe;
 
}
   public void AjouterClass(String nom,String nb_eleve){
       try{
           String query="INSERT INTO classe (nom,nb_eleve) VALUES('"+nom+"','"+nb_eleve+"')";
           System.out.println(query);
           cnx=connecterDB();
           st=cnx.createStatement();
           st.executeUpdate(query);
           System.out.println("Bien ajouté");
           
       }catch(SQLException e){
           System.err.println(e.getMessage());
       }
   }
   
   public void ModifierUser(String nom,String prenom,String mail,String mdp){
       try{
           String query="UPDATE utilisateur SET nom='"+nom
                   +"', prenom="+prenom
                   +", mail="+mail
                   +", mdp='"+mdp;
                  
           cnx=connecterDB();
           st=cnx.createStatement();
           st.executeUpdate(query);
           System.out.println("Bien modifié");
           
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
       
       
   }

public List<String> rechercheEtudiant() throws SQLException{
       
       String query="SELECT nom FROM utilisateur "; 
       cnx=connecterDB();
       st=cnx.createStatement();
       rst= st.executeQuery(query);
      List<String> Classe = new ArrayList<String>();
       while(rst.next()){
           Classe.add(rst.getString("nom"));
       }
       return Classe;
 
}



	// TODO Auto-generated method stub
	
}
    
   //public static void rdv(String email, String date, String message) {
	// TODO Auto-generated method stub


	// Connexion a la BDD //

	// Gestion d'erreur //
	//try {//Vï¿½rification de l'identifiant et du mot de passe de la bdd, execution de la requette //
	//bdd connexion = new bdd();

	//Connection cnx = connexion.connexion();
	//Statement stmt = cnx.createStatement();
	//ResultSet rs;
	//stmt.execute("INSERT INTO rdv (email, date, message)" + "VALUES ('" + email + "', '" + date + "', '"+ message + "')");

	//System.out.println("insertion reussie !");//Si la requette s'excute alors on affiche un message //
	//jOptionPane1.showMessageDialog(null, "Rendez-vous pris avec succÃ©es.", "Rendez-vous", JOptionPane.INFORMATION_MESSAGE) ;

	//try {
	//rdv window = new rdv();
	//window.frame.setVisible(true);
	//} catch (Exception e1) {
	//e1.printStackTrace();
	//}
	//cnx.close();
	//}catch (SQLException e) {
	//jOptionPane1.showMessageDialog(null, "erreur veuillez rÃ©essayer", "Alerte", JOptionPane.ERROR_MESSAGE);
	//rdv window;
	//try {
	//window = new rdv();
	//window.frame.setVisible(true);
	//} catch (SQLException e1) {
	// TODO Auto-generated catch block
	//e1.printStackTrace();
	//}
	//e.printStackTrace();

	//}
	//} 
    
   
    

