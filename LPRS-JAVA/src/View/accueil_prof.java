package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import manager.ConnexionJM;

import java.awt.Checkbox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class accueil_prof {

	static JFrame frame;

	/**
	 * Launch the application.
	 */
	public void run() {
		try {
			accueil_prof window = new accueil_prof();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 * @throws SQLException
	 */
	public accueil_prof() throws SQLException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws SQLException
	 */
	private void initialize() throws SQLException {
		JOptionPane.showMessageDialog(null, "Vous êtes bien connecté !");
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 139, 139));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		;
		JLabel lblNewLabel = new JLabel("classe ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(26, 71, 49, 14);
		frame.getContentPane().add(lblNewLabel);
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				planning planning= new planning();
				planning.frame.setVisible(true);
				accueil_prof.frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(154, 120, 107, 23);
		frame.getContentPane().add(btnNewButton);
		JLabel lblNewLabel_1 = new JLabel("planning");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(26, 124, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		JButton btnNewButton_1 = new JButton("valider");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdv rdv= new rdv();
				rdv.frame.setVisible(true);
				accueil_prof.frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(154, 172, 107, 23);
		frame.getContentPane().add(btnNewButton_1);
		JLabel lblNewLabel_2 = new JLabel("prise de rendez-vous");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(26, 176, 118, 14);
		frame.getContentPane().add(lblNewLabel_2);
		JLabel lblNewLabel_3 = new JLabel("Bienvenue dans votre espace");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(137, 24, 165, 14);
		frame.getContentPane().add(lblNewLabel_3);
		JButton btnNewButton_2 = new JButton("Modifier son profil");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modification modification= new modification();
				modification.frame.setVisible(true);
				accueil_prof.frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(293, 229, 118, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("valider");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				classe classe = null;
				try {
					classe = new classe();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				classe.frame.setVisible(true);
				accueil_prof.frame.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(154, 67, 107, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
