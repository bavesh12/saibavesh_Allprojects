package JDBC_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_conn {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		// import packages
		// create object for connection
		//retrive data
		//clsoe connection
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user ="root";
		String password = "Ammanana@0310";
		Class.forName("com.mysql.cj.jdbc.Driver"); // used to establish connection
		
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection created");
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from emp");
		System.out.println("ID\t name\t Salary");
		while(rs.next()) {
			int id  = rs.getInt("Id");
			String name = rs.getString("name");
			int salary = rs.getInt("Salary");
			System.out.println(id+" "+name+" "+salary);
			//System.out.println("ID\\t"+id+" name\\t"+name+" Salary\\t"+salary);
		}
		rs.close();
		stmt.close();
		con.close();
		
	}
}
