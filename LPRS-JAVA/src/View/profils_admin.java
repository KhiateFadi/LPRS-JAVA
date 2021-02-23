package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Profils admin");
		lblNewLabel.setBounds(172, 32, 76, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ajouter une classe");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accueil Accueil = new Accueil();
				Accueil.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(143, 89, 139, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ajouter des \u00E9tudiants");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(143, 147, 139, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("D\u00E9connection");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accueil Accueil = new Accueil();
				Accueil.frame.setVisible(true);
			}
		});
		
		btnNewButton_2.setBounds(143, 203, 139, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}
