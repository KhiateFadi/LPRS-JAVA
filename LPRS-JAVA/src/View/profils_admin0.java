package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import manager.ConnexionJM;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class profils_admin0 {

	private JFrame frame;
	
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					profils_admin0 window = new profils_admin0();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	


	/**
	 * Create the application.
	 */
	public profils_admin0() {
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
		
		JLabel lblNewLabel = new JLabel("Connectez-vous");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(167, 25, 84, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(167, 86, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 147, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mail = textField.getText();
				String mdp = textField_1.getText();
				ConnexionJM insert = new ConnexionJM();
				insert.rechercheadm(mail,mdp);
			}
		});
		btnNewButton.setBounds(167, 209, 96, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(56, 89, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mot de passe");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(56, 150, 73, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Retour");
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
