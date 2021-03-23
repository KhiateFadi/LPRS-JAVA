package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import manager.ConnexionJM;

import javax.swing.JButton;
import java.awt.Color;

public class connexion {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	
			public static void run() {
				try {
					connexion window = new connexion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
	
			

	/**
	 * Create the application.
	 */
	public connexion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 139, 139));
		frame.setBounds(100, 100, 435, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Connectez vous");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(154, 36, 159, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(154, 86, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPasswordField textField_1 = new JPasswordField();
		textField_1.setBounds(154, 140, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(154, 199, 96, 23);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String mail = textField.getText();
				char[] mdp = textField_1.getPassword();
				String pass = String.copyValueOf(mdp);
				// TODO Auto-generated method stub
				ConnexionJM insert = new ConnexionJM();
				insert.recherche(mail,pass);
			}

			});
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(54, 89, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mots de passe");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(54, 143, 71, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accueil Accueil= new Accueil();
				Accueil.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(10, 240, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
