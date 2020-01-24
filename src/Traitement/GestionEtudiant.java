package Traitement;

import java.util.Scanner;
import java.util.Vector;
import Entities.*;
import dao.EtudiantDao;
public class GestionEtudiant {
Scanner sc = new Scanner(System.in);
	public Vector v = new Vector();
	Object m;
	
public 	Vector ajouterEtudiant()
	{
	EtudiantDao dao = new EtudiantDao();
	while(true)
	{
		Etudiant e = new Etudiant();
		System.out.println("veuillez saisir le nom de l'étudiant");
		 e.nom =sc.next();
		 System.out.println("veuillez saisir le prenom de l'étudiant");
		 e.prenom =sc.next();
			System.out.println("veuillez saisir la  note");
				e.note= sc.nextDouble();
				// Ajout de 'étudaiant dans le tableau	
				dao.ajoutEtudiant(e);
				v.add(e);
				System.out.println("Etudaint ajoutée avec succès");
				System.out.println("Quitter O/N");
				if(sc.next().equalsIgnoreCase("o"))
					break;
	}  System.out.println(v);

	Etudiant ee = new Etudiant();
	ee.notemoyenne= 14;
	System.out.println("-------------------------------------");
	System.out.println("! Nom   !    Prenom   !     Moyenne  !");
	System.out.println("-------------------------------------");
	for (int i = 0; i < v.size(); i++) {
		Etudiant e = new Etudiant();
		e = (Etudiant)v.get(i);
		System.out.print("!");
		System.out.println(e.nom + "   !      " + e.note+ "    !=====>"+ e.notemoyenne + "   !");
	}
	System.out.println("-------------------------------------");
	
		
		return v;
	}
public 	Vector ajouterEtudiant(Eleve eleve)
{
while(true)
{
	Eleve e = new Eleve();
	System.out.println("veuillez saisir le nom de l'éléve");
	 e.nom =sc.next();
		System.out.println("veuillez saisir la  note");
			e.note= sc.nextDouble();
			System.out.println("veuillez saisir le pere");
			e.pere = sc.next();
			// Ajout de 'étudaiant dans le tableau	
			v.add(e);
			System.out.println("Eleve ajoutée avec succès");
			System.out.println("Quitter O/N");
			if(sc.next().equalsIgnoreCase("o"))
				break;
}  System.out.println(v);

Etudiant ee = new Etudiant();
ee.notemoyenne= 14;
System.out.println("-------------------------------------");
System.out.println("! Nom     !    Prenom  !    Moyenne  !");
System.out.println("-------------------------------------");
for (int i = 0; i < v.size(); i++) {
	Etudiant e = new Etudiant();
	e = (Etudiant)v.get(i);
	System.out.print("!");
	System.out.println(e.nom + "   !      " + e.note+ "    =====>"+ e.notemoyenne + "!");
}


	
	return v;
}
public	int calculerMoyenne(Vector<Etudiant> v)
	{
		// Calculer la moyenne v.get(i).note
	return 11;}
public void ajoutdb()
{
	EtudiantDao dao = new EtudiantDao();
	while(true)
	{
		Etudiant e = new Etudiant();
		System.out.println("veuillez saisir le nom de l'étudiant");
		 e.nom =sc.next();
		 System.out.println("veuillez saisir le prenom de l'étudiant");
		 e.prenom =sc.next();
			System.out.println("veuillez saisir la  note");
				e.note= sc.nextDouble();
				// Ajout de 'étudaiant dans le tableau	
				dao.ajoutEtudiant(e);
				if(sc.next().equalsIgnoreCase("o"))
					break;
	} 
	}

}
