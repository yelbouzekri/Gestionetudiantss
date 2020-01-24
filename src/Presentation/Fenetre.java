package Presentation;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Control.Adil;
// Extends JFrame  donne toutes les caractéristique d'une Fenetre à la classe
public class Fenetre extends JFrame {
	// Declaration
	JButton annuler ;
	JButton ok ;
	JLabel lab1;
	JLabel lab2 ;
	public JLabel msg = new JLabel();
public 	JTextField login ;
public	JTextField pw ;
	JPanel p ;
	
	public Fenetre()
	{	
		// Création des composants graphique//creation	
		 ok = new JButton("Ok");
			annuler = new JButton("Annuler");
				 lab1 = new JLabel("Login");
			lab2 = new JLabel("Mot de passe");
			login = new JTextField();
			pw = new JTextField();
			p= new JPanel();
			// Attention! la notion du Panel est importante, car la fenetre est objet qui contient bcp de choses,
			// en ce qui concerne les composants graphiques doivent être ajoutés au panel de la fenêtre 
			// le panel de la fenetre est récupéré par la méthode getCOntentPane()
			p=(JPanel) this.getContentPane();
		
		// configuration
		setTitle("Fenetre de test");
		creation();
		p.setLayout(new BorderLayout());
		JRadioButton f = new JRadioButton("Femme");
		JRadioButton h = new JRadioButton("Homme");
		String image = "C:";
		// setBOund permet de personnaliser la position et la taille, (x, y, largeur, longueur)
		//Il faut l'appliquer à la fenetre et ts les composants graphique pour avoir un emlacement et taille adaptée
		ok.setBounds(50, 320, 110, 30); 
		annuler.setBounds(150, 320, 110, 30);//pr le buttou ok
		msg.setBounds(230, 15, 100, 30);
		lab1.setBounds(30, 30, 100, 30);
		lab2.setBounds(30, 90, 100, 30);
		login.setBounds(130, 30, 100, 30);
		pw.setBounds(130, 90, 100, 30);
		setBounds(100, 100, 500, 400);  // pr la fenetre
	//On ajoute les composants graphiques à la fenetre via le panel principal
		getContentPane().add(msg);
		getContentPane().add(lab1);
	getContentPane().add(login);
	getContentPane().add(lab2);
	getContentPane().add(pw);
	getContentPane().add(ok);getContentPane().add(annuler);
	getContentPane().add(h);	getContentPane().add(f);
	// Très importante pour afficher la fenetre
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);  // optionnel si on veut fermer la fenetre en cliquant sur la croix 
	ok.addActionListener(new Adil(this));
	}

	
	
	
	void creation()
	{ }
}
