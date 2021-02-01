package manager;
import java.sql.*;
/**
 *
 * @author Said
 */
public class ConnexionJM {
 static Connection cnx;
 static Statement st;
 static ResultSet rst;
  
    /**
     * @param args the command line arguments
     */
   // public static void main(String[] args) {
        // TODO code application logic here
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
    
  
    
    public static Connection  connecterDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver oki");
            String url="jdbc:mysql://localhost/gest?serverTimezone=UTC"; 
            String user="root";
            String password="";
           Connection cnx=DriverManager.getConnection(url,user,password);
            System.out.println("Connexion bien établie");
            return cnx;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
   
    public static void AjouterP(String nom,String prenom,String mail,String mdp){
        try{
            String query="INSERT INTO utilisateur(nom,prenom,mail,mdp) VALUES('"+nom+"','"+prenom+"','"+mail+"','"+mdp+"')";
            System.out.println(query);
            cnx=connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(query);
            System.out.println("Bien ajouté");
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        
        
    }
   
    public static void SupprimerParID(int id){
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
   
    public static void recherche(String nom){
        try{
           String query="SELECT * FROM utilisateur WHERE nom='"+nom+"'"; 
           cnx=connecterDB();
           st=cnx.createStatement();
           rst= st.executeQuery(query);
           rst.last();
           int nbrRow = rst.getRow();
           if(nbrRow!=0){
               System.out.println("Trouve");
           }else{
                System.out.println("on trouve");
               
           }
           
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
    }
    
   public static void ModifierP(int id,String nom,String prenom,String mail,String mdp){
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
    
    
    
    
   
    
}
