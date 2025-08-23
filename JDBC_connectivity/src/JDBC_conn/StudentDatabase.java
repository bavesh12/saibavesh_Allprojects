package JDBC_conn;


import java.sql.*;

public class StudentDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Ammanana@0310";
        
        try {
            // 1. Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection created");
            
            Statement stmt = con.createStatement();
            stmt.executeUpdate("DROP TABLE IF EXISTS students");// drops if any table exists           
            // 1. Create the student table
            stmt.executeUpdate("DROP TABLE IF EXISTS students");
            String createSQL = "CREATE TABLE students (" +
                             "rollno INT PRIMARY KEY, " +
                             "name VARCHAR(50) NOT NULL, " +
                             "Percentage INT, " +
                             "Email VARCHAR(100), " +
                             "city VARCHAR(50))";
            stmt.executeUpdate(createSQL);
            System.out.println("\n1. Students table created");
            
            // 2. Insert records
            String insertSQL = "INSERT INTO students VALUES " +
                             "(101,'Neeva Sharma',98,'neeva@gmail.com','Mumbai'), " +
                             "(102,'Sai Sharma',90,'sai@gmail.com','Delhi'), " +
                             "(103,'charan reddy',85,'charan@gmail.com','Mumbai'), " +
                             "(104,'sowmya chowdhury',92,'sowmya@gmail.com','Bangalore')";
            stmt.executeUpdate(insertSQL);
            System.out.println("\n2. Records inserted");
            
            //3. Print table
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            System.out.println("\n3. Printing table:");
            System.out.println("rollno\tname\t\tPercentage\tEmail\t\tcity");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("rollno") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getInt("Percentage") + "\t" +
                    rs.getString("Email") + "\t" +
                    rs.getString("city")
                );
            }
            // 4. Update records
            stmt.executeUpdate("UPDATE students SET Percentage = 95 WHERE rollno = 101");
            System.out.println("\n4. After updating Neeva's percentage:");
            
            rs = stmt.executeQuery("SELECT * FROM students");
            System.out.println("rollno\tname\t\tPercentage\tEmail\t\tcity");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("rollno") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getInt("Percentage") + "\t" +
                    rs.getString("Email") + "\t" +
                    rs.getString("city")
                );
            }
            
            // 5. Find highest percentage students
           System.out.println("\n5. Highest percentage students:");
            rs = stmt.executeQuery("SELECT * FROM students WHERE Percentage = " +
                                 "(SELECT MAX(Percentage) FROM students)");
            System.out.println("rollno\tname\t\tPercentage\tEmail\t\tcity");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("rollno") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getInt("Percentage") + "\t" +
                    rs.getString("Email") + "\t" +
                    rs.getString("city")
                );
            }
            
            // 6. Sort records
            System.out.println("\n6. Students sorted by name (ascending):");
            rs = stmt.executeQuery("SELECT * FROM students ORDER BY name ASC");
            System.out.println("rollno\tname\t\tPercentage\tEmail\t\tcity");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("rollno") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getInt("Percentage") + "\t" +
                    rs.getString("Email") + "\t" +
                    rs.getString("city")
                );
            }
            
            // 7. Filter by city
            System.out.println("\n7. Students from Mumbai:");
            rs = stmt.executeQuery("SELECT * FROM students WHERE city = 'Mumbai'");
            System.out.println("rollno\tname\t\tPercentage\tEmail\t\tcity");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("rollno") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getInt("Percentage") + "\t" +
                    rs.getString("Email") + "\t" +
                    rs.getString("city")
                );
            }
            
            // 8. Add new column
            stmt.executeUpdate("ALTER TABLE students ADD COLUMN phone INT");
            System.out.println("\n8. Added phone column");
            
            // 9. Modify column datatype
            stmt.executeUpdate("ALTER TABLE students MODIFY COLUMN Percentage FLOAT");
            System.out.println("\n9. Modified Percentage column datatype to FLOAT");
            
            // 10. Rename the table
            stmt.executeUpdate("RENAME TABLE students TO student_data");
            System.out.println("\n10. Changed table name to student_data");
            
            // 11. Delete column
            stmt.executeUpdate("ALTER TABLE student_data DROP COLUMN phone");
            System.out.println("\n11. Deleted phone column");
            
            // 12. Delete single row
            stmt.executeUpdate("DELETE FROM student_data WHERE rollno = 104");
            System.out.println("\n12. After deleting rollno 104:");
            rs = stmt.executeQuery("SELECT * FROM student_data");
            System.out.println("rollno\tname\t\tPercentage\tEmail\t\tcity");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("rollno") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getFloat("Percentage") + "\t" +
                    rs.getString("Email") + "\t" +
                    rs.getString("city")
                );
            }
            
            // 13. Delete all records
            stmt.executeUpdate("DELETE FROM student_data");
            System.out.println("\n13. Deleted all records from table");
            rs = stmt.executeQuery("SELECT * FROM student_data");
            System.out.println("rollno\tname\t\tPercentage\tEmail\t\tcity");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("rollno") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getFloat("Percentage") + "\t" +
                    rs.getString("Email") + "\t" +
                    rs.getString("city")
                );
            }
            
            // Re-insert some data for join operations
            stmt.executeUpdate("INSERT INTO student_data VALUES " +
                             "(101,'Neeva Sharma',95,'neeva@gmail.com','Mumbai'), " +
                             "(102,'Sai Sharma',90,'sai@gmail.com','Delhi')");
            
            // 14. Create institute table
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS institute (" +
                             "student_id INT, " +
                             "institute_name VARCHAR(50), " +
                             "course VARCHAR(50))");
            System.out.println("\n14. Created institute table");
            
            // 15. Insert records into institute table
            stmt.executeUpdate("INSERT INTO institute VALUES " +
                             "(101,'ABC Institute','Computer Science'), " +
                             "(102,'XYZ College','Electrical Engineering'), " +
                             "(105,'PQR University','Mechanical Engineering')");
            System.out.println("15. Inserted records into institute table");
            
            // 16. Perform inner join
            System.out.println("\n16. Inner Join (common records):");
            rs = stmt.executeQuery("SELECT s.*, i.institute_name, i.course " +
                                 "FROM student_data s INNER JOIN institute i " +
                                 "ON s.rollno = i.student_id");
            System.out.println("rollno\tname\t\tPercentage\tEmail\t\tcity\tinstitute_name\tcourse");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("rollno") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getFloat("Percentage") + "\t" +
                    rs.getString("Email") + "\t" +
                    rs.getString("city") + "\t" +
                    rs.getString("institute_name") + "\t" +
                    rs.getString("course")
                );
            }
            
            // 17. Perform left join
            System.out.println("\n17. Left Join (all student records):");
            rs = stmt.executeQuery("SELECT s.*, i.institute_name, i.course " +
                                 "FROM student_data s LEFT JOIN institute i " +
                                 "ON s.rollno = i.student_id");
            System.out.println("rollno\tname\t\tPercentage\tEmail\t\tcity\tinstitute_name\tcourse");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("rollno") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getFloat("Percentage") + "\t" +
                    rs.getString("Email") + "\t" +
                    rs.getString("city") + "\t" +
                    (rs.getString("institute_name") != null ? rs.getString("institute_name") : "NULL") + "\t" +
                    (rs.getString("course") != null ? rs.getString("course") : "NULL")
                );
            }
            
            // 18. Perform right join
            System.out.println("\n18. Right Join (all institute records):");
            rs = stmt.executeQuery("SELECT s.*, i.institute_name, i.course " +
                                 "FROM student_data s RIGHT JOIN institute i " +
                                 "ON s.rollno = i.student_id");
            System.out.println("rollno\tname\t\tPercentage\tEmail\t\tcity\tinstitute_name\tcourse");
            while (rs.next()) {
                System.out.println(
                    (rs.getObject("rollno") != null ? rs.getInt("rollno") : "NULL") + "\t" +
                    (rs.getString("name") != null ? rs.getString("name") : "NULL") + "\t" +
                    (rs.getObject("Percentage") != null ? rs.getDouble("Percentage") : "NULL") + "\t" +
                    (rs.getString("Email") != null ? rs.getString("Email") : "NULL") + "\t" +
                    (rs.getString("city") != null ? rs.getString("city") : "NULL") + "\t" +
                    rs.getString("institute_name") + "\t" +
                    rs.getString("course")
                );
            }
            
            // 19.UNION
            System.out.println("\n19. printing all records from both tables:");
            rs = stmt.executeQuery("SELECT s.*, i.institute_name, i.course " +
                                 "FROM student_data s LEFT JOIN institute i " +
                                 "ON s.rollno = i.student_id " +
                                 "UNION " +
                                 "SELECT s.*, i.institute_name, i.course " +
                                 "FROM student_data s RIGHT JOIN institute i " +
                                 "ON s.rollno = i.student_id " +
                                 "WHERE s.rollno IS NULL");
            System.out.println("rollno\tname\t\tPercentage\tEmail\t\tcity\tinstitute_name\tcourse");
            while (rs.next()) {
                System.out.println(
                    (rs.getObject("rollno") != null ? rs.getInt("rollno") : "NULL") + "\t" +
                    (rs.getString("name") != null ? rs.getString("name") : "NULL") + "\t" +
                    (rs.getObject("Percentage") != null ? rs.getDouble("Percentage") : "NULL") + "\t" +
                    (rs.getString("Email") != null ? rs.getString("Email") : "NULL") + "\t" +
                    (rs.getString("city") != null ? rs.getString("city") : "NULL") + "\t" +
                    rs.getString("institute_name") + "\t" +
                    rs.getString("course")
                );
            }
            
            // 20. Delete the tables
            stmt.executeUpdate("DROP TABLE student_data");
            stmt.executeUpdate("DROP TABLE institute");
            System.out.println("\n20. Deleted both tables");
            
            stmt.close();
            con.close();
            
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}