package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accueil {

	JFrame frame;

	/**
	 * Launch the application.
	 */
			public void run() {
				try {
					Accueil window = new Accueil();
					window.frame.setVisible(true);
					//BDD bdd = new BDD();
					//bdd.connexion_bdd();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
	

	/**
	 * Create the application.
	 */
	public Accueil() {
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
		
		JLabel lblNewLabel = new JLabel("Bienvenue");
		lblNewLabel.setBounds(187, 49, 125, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				connexion connexion = new connexion();
				connexion.frame.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(150, 100, 125, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Inscription");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inscription inscription = new inscription();
				inscription.frame.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(150, 171, 125, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Profils admin");
		btnNewButton_2.setBounds(337, 229, 99, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
