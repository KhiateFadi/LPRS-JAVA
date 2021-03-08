package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(154, 67, 107, 22);
		frame.getContentPane().add(comboBox);
		ConnexionJM insert = new ConnexionJM();
		List<String> tabClasse = insert.rechercheEtudiant();

		for(String s : tabClasse) {
			comboBox.addItem(s);
		}
		;
		
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
		btnNewButton.setBounds(113, 229, 102, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("retard");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				retard retard=new retard();
				retard.frame.setVisible(true);
			}
			
		});
		btnNewButton_1.setBounds(238, 229, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("sanction");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sanction sanction=new sanction();
				sanction.frame.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(337, 229, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(20, 63, 384, 155);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
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
		btnNewButton_3.setBounds(10, 229, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
