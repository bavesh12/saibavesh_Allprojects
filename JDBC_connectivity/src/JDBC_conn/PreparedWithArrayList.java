package JDBC_conn;

import java.sql.*;
import java.util.ArrayList;

public class PreparedWithArrayList {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Ammanana@0310";
        
        // Create list of courses to insert
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course(101, "C"));
        courses.add(new Course(102, "B"));
        courses.add(new Course(103, "A"));
        
        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            try (Connection con = DriverManager.getConnection(url, user, password)) {
                System.out.println("Connection established successfully");
                
                // Insert all courses from the ArrayList
                PreparedWithArrayList obj = new PreparedWithArrayList();
                obj.insertCourses(con, courses);
                
                System.out.println("All courses inserted successfully");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        }
    }

    public void insertCourses(Connection con, ArrayList<Course> courses) throws SQLException {
        String query = "INSERT INTO courses (course_id, course_name) VALUES (?, ?)";
        
        try (PreparedStatement ps = con.prepareStatement(query)) {
            for (Course course : courses) {
                ps.setInt(1, course.getId());
                ps.setString(2, course.getName());
                ps.addBatch(); // Add to batch for bulk insert
            }
            
            int[] results = ps.executeBatch();
            System.out.println("Inserted " + results.length + " courses");
        }
    }
}

// Helper class to represent Course data
class Course {
    private int id;
    private String name;
    
    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}
