package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Presentation.AjoutIHM;
import Presentation.SaidIHM;
import dao.VerifierMotdepasse;

public class Said  implements ActionListener{
	SaidIHM ihm;

	public void actionPerformed(ActionEvent e) {
		VerifierMotdepasse vv = new VerifierMotdepasse();
		if("correct".equals(vv.login(ihm.login.getText(), ihm.pw.getText()))) {
			AjoutIHM aiohm = new AjoutIHM();
		}
}

	public Said(SaidIHM ss) {
		ihm = ss;
	}
}
