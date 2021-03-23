package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;

import manager.BDD;
import manager.ConnexionJM;
import java.awt.Color;

public class planning {

	JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					planning window = new planning();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public planning() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 139, 139));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Retour");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accueil_prof accueil_prof = null;
				try {
					accueil_prof = new accueil_prof();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				accueil_prof.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 229, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Planning");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(179, 24, 62, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 54, 362, 152);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		ListSelectionModel listMod =  table.getSelectionModel();
		listMod.addListSelectionListener(table);
		
		try{
			ConnexionJM connexion = new ConnexionJM();
			connexion.connecterDB();			

		java.sql.Connection cnx = connexion.connecterDB();
		java.sql.Statement stmt1 = cnx.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
		      ResultSet rs1;
		rs1 = stmt1.executeQuery("Select * from planning");

		            int i=0;
		            int k=0;
		            if(rs1.next()){
		                rs1.last();
		                k=rs1.getRow();
		                rs1.beforeFirst();
		            }
		           Object[][] t=new Object[k][6];
		           // met le resultat de la requete dans un tableau
		            while (rs1.next()){
		               
		               t[i][0]=rs1.getString(2);
		               t[i][1]=rs1.getString(3);
		               t[i][2]=rs1.getString(4);
		               t[i][3]=rs1.getString(5);
		               t[i][4]=rs1.getString(6);
		               t[i][5]=rs1.getString(7);
		               i++;
		               
		            }
		           
		            rs1.close();
		            // affiche le tableau dans le jtable
		     final String columnNames[] = {"nom_prof","lundi","mardi","mercredi","jeudi","vendredi"};
		     listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		     table.setModel(new DefaultTableModel(t,columnNames));
		     
		     
		}
		catch(Exception ex){
		    ex.printStackTrace();
		}
	}
}