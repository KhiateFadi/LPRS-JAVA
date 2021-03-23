package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;

import manager.ConnexionJM;

import javax.mail.MessagingException;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AjoutEtudiant {

	static JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjoutEtudiant window = new AjoutEtudiant();
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
	public AjoutEtudiant() {
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
		
		JLabel lblNewLabel = new JLabel("Ajouter des \u00E9tudiants");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(159, 27, 107, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(159, 52, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(159, 83, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(159, 114, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(44, 55, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pr\u00E9nom");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(44, 86, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mail");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(44, 117, 49, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mot de passe");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(44, 148, 71, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(159, 145, 96, 20);
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
				String classe = textField_4.getText();
				// TODO Auto-generated method stub
				ConnexionJM insert = new ConnexionJM();
				boolean test = false;
				try {
					test = insert.AjouterETUD(nom,prenom,mail,mdp,classe);
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(test == true)
					frame.setVisible(false);
				JOptionPane.showMessageDialog(null, "Etudiant enregistré avec succès !");
			}

			});
		/*JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profils_admin profils_admin = new profils_admin();
				profils_admin.frame.setVisible(true);
				JOptionPane.showMessageDialog(null, "Etudiant enregistré avec succès !");
			}
		});*/
		btnNewButton.setBounds(159, 224, 96, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profils_admin profils_admin= new profils_admin();
				profils_admin.frame.setVisible(true);
				AjoutEtudiant.frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(4, 240, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(159, 176, 96, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("classe");
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setBounds(44, 179, 49, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
	}
}
