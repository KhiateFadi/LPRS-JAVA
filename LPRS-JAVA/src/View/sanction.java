package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;

import manager.ConnexionJM;

import javax.swing.JButton;
import java.awt.Color;

public class sanction {

	static JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sanction window = new sanction();
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
	public sanction() {
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
		
		JLabel lblNewLabel = new JLabel("Sanction");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(187, 25, 49, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(163, 50, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 92, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(163, 140, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(163, 181, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom = textField.getText();
				String prenom = textField_1.getText();
				String classe = textField_2.getText();
				String sanction = textField_3.getText();
				// TODO Auto-generated method stub
				ConnexionJM insert = new ConnexionJM();
				insert.AjouterSanction(nom,prenom,classe,sanction);
				JOptionPane.showMessageDialog(null, "Sanction bien enregistré !");
			}
		});
		btnNewButton.setBounds(163, 217, 96, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Nom");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(50, 53, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pr\u00E9nom");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(50, 95, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Classe");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(50, 143, 49, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sanction");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(50, 184, 49, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				classe classe = null;
				try {
					classe = new classe();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				classe.frame.setVisible(true);
				sanction.frame.setVisible(false);
				
			}
		});
		btnNewButton_1.setBounds(10, 229, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
