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

public class accueil_prof {

private JFrame frame;

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
frame.setBounds(100, 100, 450, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
JComboBox<String> comboBox = new JComboBox<String>();
comboBox.setBounds(154, 67, 107, 22);
frame.getContentPane().add(comboBox);
ConnexionJM insert = new ConnexionJM();
List<String> tabClasse = insert.rechercheclasse();

for(String s : tabClasse) {
comboBox.addItem(s);
}
;
JLabel lblNewLabel = new JLabel("classe ");
lblNewLabel.setBounds(26, 71, 49, 14);
frame.getContentPane().add(lblNewLabel);
JButton btnNewButton = new JButton("Valider");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
planning planning= new planning();
planning.frame.setVisible(true);
}
});
btnNewButton.setBounds(154, 120, 107, 23);
frame.getContentPane().add(btnNewButton);
JLabel lblNewLabel_1 = new JLabel("planning");
lblNewLabel_1.setBounds(26, 124, 49, 14);
frame.getContentPane().add(lblNewLabel_1);
JButton btnNewButton_1 = new JButton("valider");
btnNewButton_1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
rdv rdv= new rdv();
rdv.frame.setVisible(true);
}
});
btnNewButton_1.setBounds(154, 172, 107, 23);
frame.getContentPane().add(btnNewButton_1);
JLabel lblNewLabel_2 = new JLabel("prise de rendez-vous");
lblNewLabel_2.setBounds(26, 176, 118, 14);
frame.getContentPane().add(lblNewLabel_2);
JLabel lblNewLabel_3 = new JLabel("Bienvenue dans votre espace");
lblNewLabel_3.setBounds(137, 24, 165, 14);
frame.getContentPane().add(lblNewLabel_3);
JButton btnNewButton_2 = new JButton("Modifier son profil");
btnNewButton_2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
modification modification= new modification();
modification.frame.setVisible(true);
}
});
btnNewButton_2.setBounds(293, 229, 118, 23);
frame.getContentPane().add(btnNewButton_2);
}
}
