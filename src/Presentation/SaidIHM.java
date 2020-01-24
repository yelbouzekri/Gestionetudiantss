package Presentation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Control.Said;
import dao.VerifierMotdepasse;

public class SaidIHM extends JFrame{
	JButton annuler ;
	JButton ok ;
	JLabel lab1;
	JLabel lab2 ;
	public 	JTextField login ;
	public	JTextField pw ;
	public SaidIHM()
	{ ok = new JButton("ok");
	annuler = new JButton("Annuler");
	 lab1 = new JLabel("Login");
lab2 = new JLabel("motpass");
login = new JTextField();
pw = new JTextField();
ok.setBounds(50, 320, 110, 30); 
annuler.setBounds(150, 320, 110, 30);//pr le buttou ok
lab1.setBounds(30, 30, 100, 30);
lab2.setBounds(30, 90, 100, 30);
login.setBounds(130, 30, 100, 30);
pw.setBounds(130, 90, 100, 30);
getContentPane().add(lab1);
getContentPane().add(login);
getContentPane().add(lab2);	
getContentPane().add(pw);	
getContentPane().add(ok);getContentPane().add(annuler);
setBounds(100, 100, 500, 400);
setVisible(true);
		
ok.addActionListener(new Said(this));


	}
	
}
