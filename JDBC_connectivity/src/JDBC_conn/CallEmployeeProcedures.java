package JDBC_conn;

import java.sql.*;

public class CallEmployeeProcedures {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "Ammanana@0310";

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            
            // 1. employee table
        	 System.out.println("Original Employee Data");
             ResultSet originalRs = con.createStatement().executeQuery("SELECT * FROM employee");
             System.out.println("ID\tName\t\tSalary\t\tDepartment");

             while (originalRs.next()) {
                 int id = originalRs.getInt("emp_id");
                 String name = originalRs.getString("emp_name");
                 double salary = originalRs.getDouble("salary");
                 String dept = originalRs.getString("department");
                 System.out.printf("%d\t%-15s\t%,.2f\t%s\n", id, name, salary, dept);
             }
             originalRs.close();
             
              // 2. Add 5000 bonus 
             System.out.println("\nAdding 5000 Bonus");
             CallableStatement addBonus = con.prepareCall("{CALL AddBonusToAll()}");
             ResultSet bonusRs = addBonus.executeQuery();
             System.out.println("ID\tName\t\tSalary\t\tDepartment");

             while (bonusRs.next()) {
                 int id = bonusRs.getInt("emp_id");
                 String name = bonusRs.getString("emp_name");
                 double salary = bonusRs.getDouble("salary");
                 String dept = bonusRs.getString("department");
                 System.out.printf("%d\t%-15s\t%,.2f\t%s\n", id, name, salary, dept);
             }
             bonusRs.close();
             
            // 2.Same name Employees procedure
            System.out.println("\nEmployees with same names:");
            CallableStatement sameNames = con.prepareCall("{CALL FindSameNameEmployees()}");
            ResultSet nameRs = sameNames.executeQuery();
            
            System.out.println("Name\t\tCount");
            System.out.println("---------------------");
            while (nameRs.next()) {
                String name = nameRs.getString("emp_name");
                int count = nameRs.getInt("count");
                System.out.printf("%-15s\t%d\n", name, count);
            }
            
            // 3.get salary range procedure
            System.out.println("\nSalary Range:");
            CallableStatement salaryRange = con.prepareCall("{CALL GetSalaryRange()}");
            ResultSet rangeRs = salaryRange.executeQuery();
            
            if (rangeRs.next()) {
                double highest = rangeRs.getDouble("highest_salary");
                double lowest = rangeRs.getDouble("lowest_salary");
                System.out.printf("Highest Salary: %.2f\n", highest);
                System.out.printf("Lowest Salary: %.2f\n", lowest);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}