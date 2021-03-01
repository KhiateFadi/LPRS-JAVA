package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;

import manager.ConnexionJM;

import javax.swing.JButton;

public class inscription {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */

			public void run() {
				try {
					inscription window = new inscription();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
	/**
	 * Create the application.
	 */
	public inscription() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inscription");
		lblNewLabel.setBounds(163, 25, 75, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setBounds(46, 53, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(156, 50, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Prenom");
		lblNewLabel_2.setBounds(46, 96, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("mail");
		lblNewLabel_3.setBounds(46, 138, 49, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mots de passe");
		lblNewLabel_4.setBounds(46, 183, 89, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 93, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 135, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 180, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(152, 215, 100, 23);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String nom = textField.getText();
				String prenom = textField_1.getText();
				String mail = textField_2.getText();
				String mdp = textField_3.getText();
				// TODO Auto-generated method stub
				ConnexionJM insert = new ConnexionJM();
				insert.AjouterP(nom,prenom,mail,mdp);
			}

			});
		frame.getContentPane().add(btnNewButton);
	}

}
