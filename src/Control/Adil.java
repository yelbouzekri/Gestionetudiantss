package Control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Presentation.AjoutIHM;
import Presentation.Fenetre;
import dao.AuthentificationDao;

public class Adil implements ActionListener {
Fenetre s;
	public void actionPerformed(ActionEvent e) {
	//System.out.println("Merci beaucoup Adil");
	System.out.println(	s.login.getText() + "==" +s.pw.getText());
	AuthentificationDao dao = new AuthentificationDao();
	if(dao.login(s.login.getText() , s.pw.getText()))
			{
			s.msg.setText("Succes");
			s.msg.setForeground(Color.GREEN);
AjoutIHM ajout = new AjoutIHM();
s.hide();
			}
		else
		{s.msg.setForeground(Color.RED);
		s.msg.setText("Failed");
		//System.out.println("Succes");
		}
	}
public Adil(Fenetre e) {
	s= e;
	
}
	
	
}
