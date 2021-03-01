package View;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class modification {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	
			public void run() {
				try {
					modification window = new modification();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		

	/**
	 * Create the application.
	 */
	public modification() {
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
