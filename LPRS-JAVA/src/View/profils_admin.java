package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class profils_admin {

	JFrame frame;

	/**
	 * Launch the application.
	 */
			public void run() {
				try {
					profils_admin window = new profils_admin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	/**
	 * Create the application.
	 */
	public profils_admin() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JOptionPane.showMessageDialog(null, "Vous �tes bien connect� !");
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 139, 139));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Profils admin");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(192, 29, 98, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ajouter une classe");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ajoutclasse Ajoutclasse = new Ajoutclasse();
				Ajoutclasse.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(143, 57, 165, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ajouter des \u00E9tudiants");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjoutEtudiant AjoutEtudiant = new AjoutEtudiant();
				AjoutEtudiant.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(143, 125, 165, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("D\u00E9connexion");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accueil Accueil = new Accueil();
				Accueil.frame.setVisible(true);
			}
		});
		
		btnNewButton_2.setBounds(143, 197, 165, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Modifier profils");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modification modification = new modification();
				modification.frame.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(276, 229, 150, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Ajouter un prof");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjoutProf AjoutProf = new AjoutProf();
				AjoutProf.frame.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(143, 91, 165, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Ajouter admin");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AjoutAdmin AjoutAdmin = new AjoutAdmin();
				AjoutAdmin.frame.setVisible(true);
				
			}
		});
		btnNewButton_5.setBounds(143, 161, 165, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Afficher les utilisateurs");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Afficher_User Afficher_User = new Afficher_User();
				Afficher_User.frame.setVisible(true);
			}
		});
		btnNewButton_6.setBounds(10, 229, 160, 23);
		frame.getContentPane().add(btnNewButton_6);
	}
}
