package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Entities.Etudiant;

public class EtudiantDao {
// Créer une cnx (lien) vers une base de données

	Connection cnx;
	Statement st; 
	ResultSet rsq;
	public EtudiantDao() {
		String chaine= "jdbc:mysql://localhost:3306/gestionetudiant";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Chargement avec succès");
		} catch (ClassNotFoundException e1) {
			System.out.println("Problème driver");
			e1.printStackTrace();
		}
		try {
			this.cnx = DriverManager.getConnection(chaine,"root","rootpass");
		System.out.println("Cnx avec succès");
		} catch (SQLException e1) {
			System.out.println("pb de cnx");
			e1.printStackTrace();
		}
	}
public 	void ajoutEtudiant(Etudiant e) {

		try {
			st = cnx.createStatement();
			int i = st.executeUpdate("insert into etudiant(nom, prenom, note, moyenne) values ( '"+e.nom+"', '"+e.prenom+"', "+e.note+", "+e.notemoyenne+")");
System.out.println("Enregistrement avec succes: '"+ i + "'dans la base");
			
		} catch (SQLException e1) {
System.out.println("pb d'enregistrement ");
			e1.printStackTrace();
		}
		
	}
public void modifiernote()
{  int code;
double notej;
Scanner sc = new Scanner(System.in);
System.out.println("Veuillez saisir le code d'étudiant");
	code = sc.nextInt();
	System.out.println("Veuillez saisir la nouvelle note");
	notej = sc.nextDouble();
	
	try {
		st = cnx.createStatement();
		int i = st.executeUpdate("update etudiant set note =" + notej + " where cne =" + code);
	System.out.println("modification sucess");
	} catch (Exception e) {
	System.out.println("Problème de modifi");
	}

}
	
	
}
