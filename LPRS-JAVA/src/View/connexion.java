package View;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class connexion {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	
			public void run() {
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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
