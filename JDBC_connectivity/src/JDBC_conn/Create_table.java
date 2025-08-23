package JDBC_conn;

import java.sql.*;

public class Create_table {
    public static void main(String[] args) {
        // Database connection parameters (you need to set these)
    	String url = "jdbc:mysql://localhost:3306/mydb";
		String user ="root";
		String password = "Ammanana@0310";
        
        // SQL to create table (matches what was in the image)
       String sql = "CREATE TABLE IF NOT EXISTS students  (" +
                    "rollno INT, " +
                    "name VARCHAR(50), " +
                    "Percentage DECIMAL(5,2), " +
                    "Email VARCHAR(100))";
        
        String insertSQl = "insert into students values(101,'neeva sharma',98,'abc@gmail.com'),"+
                "(102,'sai sharma',90,'sai@gmail.com')";
        
        String updateSQL = "UPDATE students SET Percentage = 95.0 WHERE rollno = 101";


        try {
            // 1. Load the JDBC driver (exactly as in the image)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Establish connection (as in the image)
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection created");

            // 3. Create statement and execute table creation (as in the image)
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Students table created");
            int rowInserted = stmt.executeUpdate(insertSQl);
            if(rowInserted > 0)
            {
            	System.out.println("new Student record inserted");
            }
            
            int rowsUpdated = stmt.executeUpdate(updateSQL);
            if(rowsUpdated > 0) {
                System.out.println(rowsUpdated + " record(s) updated");
            }
            // 4. Query the table (as in the image)
            ResultSet rs = stmt.executeQuery("Select * from students");
            
            // 5. Print results (completed the partial print from the image)
            System.out.println("rollno\tname\tPercentage\tEmail");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("rollno") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getDouble("Percentage") + "\t" +
                    rs.getString("Email")
                );
            }
            // 6. Close resources (as in the image)
            stmt.close();
            con.close();
            
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}