package Presentation;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Control.Adil;

public class AjoutIHM extends JFrame{
	JButton annuler ;
	JButton ok ;
	JLabel lab1;
	JLabel lab2 ;JLabel lab3 ;
	public JLabel msg = new JLabel();
public 	JTextField login ;
public	JTextField pw ; public	JTextField note = new JTextField();
	JPanel p ;
	
	public AjoutIHM()
	{	
		// Création des composants graphique//creation	
		 ok = new JButton("Ajouter");
			annuler = new JButton("Annuler");
				 lab1 = new JLabel("Nom");
			lab2 = new JLabel("Prenom");
			lab3 = new JLabel("Note");
			login = new JTextField();
			pw = new JTextField();
			p= new JPanel();
			// Attention! la notion du Panel est importante, car la fenetre est objet qui contient bcp de choses,
			// en ce qui concerne les composants graphiques doivent être ajoutés au panel de la fenêtre 
			// le panel de la fenetre est récupéré par la méthode getCOntentPane()
			p=(JPanel) this.getContentPane();
		
		// configuration
		setTitle("Ajouter Un nouveau Etudizant");
		
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
		lab3.setBounds(30, 120, 100, 30);
		login.setBounds(130, 30, 100, 30);
		pw.setBounds(130, 90, 100, 30);
		note.setBounds(130, 120, 100, 30);
		setBounds(100, 100, 500, 400);  // pr la fenetre
	//On ajoute les composants graphiques à la fenetre via le panel principal
		getContentPane().add(msg);
		getContentPane().add(lab1);
	getContentPane().add(login);
	getContentPane().add(lab2);	getContentPane().add(lab3);
	getContentPane().add(pw);	getContentPane().add(note);
	getContentPane().add(ok);getContentPane().add(annuler);
	getContentPane().add(h);	getContentPane().add(f);
	// Très importante pour afficher la fenetre
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);  // optionnel si on veut fermer la fenetre en cliquant sur la croix 
	ok.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			AfficherEtudiant affiche = new AfficherEtudiant();
			
		}
	});
	}

}
