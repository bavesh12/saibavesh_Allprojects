package JDBC_conn;

import java.sql.*;

public class CallStudentProcedure {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb"; // Fixed port to standard 3306
        String user = "root";
        String password = "Ammanana@0310";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            // Call the stored procedure
        	CallableStatement cst = con.prepareCall("{CALL GetStudentsByMarksAsc(?)}");
            cst.setInt(1, 88); // Set the marks parameter
           
            // Execute and process results
            ResultSet rs = cst.executeQuery();
            
            // Print header
            System.out.println("ID\tName\t\t\tMarks");
            System.out.println("----------------------------------");
            
            // Process results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                System.out.printf("%d\t%-20s\t%d\n", id, name, marks);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}