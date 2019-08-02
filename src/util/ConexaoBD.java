package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
	
	public static void main(String[] args) {
		getInstance();
	}
	
	public static Connection getInstance() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/agenda_alunos";
		String user = "root";
		String password = "";
		try{
			
			Connection con = null;
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println("Conectado!");
			return con;
			
		}catch(Exception e){
			System.out.println("Driver não encontrado " + e);
		}
		
		return null;
	}
}