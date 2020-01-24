
public class Surcharge {
	String nom;
void chercher(){System.out.println("ououiu");}
	public void trier() {System.out.println("Bonjour");}
//2
	public int trier(String s) {
		System.out.println("bonjour "+ s);
		return 1;
	}
//3	
	public int trier(String s, int p) {
		for (int i= 1; i<=p; i++)
			System.out.println("bonjour " +s);
		return 12;
	}
//4
	public int trier (int p)
	{
		System.out.println("bonjour " +p);
		return 11;}
	public Surcharge()
	{}
}
