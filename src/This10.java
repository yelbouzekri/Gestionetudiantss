import java.util.Scanner;

public class This10 extends Surcharge{
int cne;
String nom;
Scanner sc = new Scanner(System.in);
void ajouter(){
	String nom;
	System.out.println("Saisir le nom");
nom = sc.next();
this.nom = nom;
this.chercher();
super.chercher();
}
void chercher() { nom = "eee";}

}
