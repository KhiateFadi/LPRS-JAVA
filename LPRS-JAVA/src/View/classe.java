package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import manager.ConnexionJM;

public class classe {

	static JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					classe window = new classe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws SQLException 
	 */
	public classe() throws SQLException {
		initialize();
	
	}
	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException 
	 */
	private void initialize() throws SQLException {
		
		JLabel lblNewLabel = new JLabel("classe");
		lblNewLabel.setBounds(169, 26, 79, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("abscence");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abscence abscence=new abscence();
				abscence.frame.setVisible(true);
			}
		});
	
		
		JButton btnNewButton_3 = new JButton("Retour");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				accueil_prof accueil_prof = null;
				try {
					accueil_prof = new accueil_prof();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				accueil_prof.frame.setVisible(true);
				classe.frame.setVisible(false);
			}
		});
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton.setBounds(10, 229, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 54, 362, 152);
		frame.getContentPane().add(scrollPane);
		
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		ListSelectionModel listMod =  table.getSelectionModel();
		listMod.addListSelectionListener(table);
		
		try{
			ConnexionJM connexion = new ConnexionJM();
			connexion.connecterDB();			

		java.sql.Connection cnx = connexion.connecterDB();
		java.sql.Statement stmt1 = cnx.createStatement();
		      ResultSet rs1;
		rs1 = stmt1.executeQuery("Select * from classe");

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
		               i++;
		               System.out.print(i);
		            }
		           
		            rs1.close();
		            // affiche le tableau dans le jtable
		     final String columnNames[] = {"nom","nb_eleve"};
		     listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		     table.setModel(new DefaultTableModel(t,columnNames));
		     
		     JButton btnNewButton_5 = new JButton("retard");
				btnNewButton_5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						retard retard=new retard();
						retard.frame.setVisible(true);
					}
					
				});
		     btnNewButton_5.setBounds(221, 229, 89, 23);
		     frame.getContentPane().add(btnNewButton_5);
		     
		     JButton btnNewButton_6 = new JButton("sanction");
				btnNewButton_6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						sanction sanction=new sanction();
						sanction.frame.setVisible(true);
					}
				});
		     
		     btnNewButton_6.setBounds(122, 229, 89, 23);
		     frame.getContentPane().add(btnNewButton_6);
		     
		     
		}
		catch(Exception ex){
		    ex.printStackTrace();
		}
	}
}