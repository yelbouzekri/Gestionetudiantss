package Presentation;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.EtudiantDao;

public class AfficherEtudiant extends JFrame {
	JTable table = new JTable();
public AfficherEtudiant() {
	String[][] ss= {{},{},};
	DefaultTableModel model = new DefaultTableModel();
	EtudiantDao dao = new EtudiantDao();
	
	setBounds(100, 100, 500, 400); 
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE); 	
}
	
}
