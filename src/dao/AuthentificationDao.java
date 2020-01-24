package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AuthentificationDao {
	Connection cnx;
		Statement st; 
		ResultSet rs;
	
		public AuthentificationDao() {
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
		public boolean login (String a, String b)
		{
			try {
				st = cnx.createStatement();
				rs = st.executeQuery("select pass from user where login ='"+a+"'");
			if(rs.next()){
		if(	rs.getString("pass").equals(b))
			return true;
		else return false;
			}
			else return false;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
				return false;
			}
			
			
		
	}
		
		
		
}
