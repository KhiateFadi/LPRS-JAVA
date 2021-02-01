package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import java.awt.Checkbox;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class accueil_prof {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accueil_prof window = new accueil_prof();
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
	public accueil_prof() {
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(154, 67, 107, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("classe ");
		lblNewLabel.setBounds(26, 71, 49, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.setBounds(154, 120, 107, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("planning");
		lblNewLabel_1.setBounds(26, 124, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("valider");
		btnNewButton_1.setBounds(154, 172, 107, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("prise de rendez-vous");
		lblNewLabel_2.setBounds(26, 176, 118, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Bienvenue dans votre espace");
		lblNewLabel_3.setBounds(137, 24, 165, 14);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
