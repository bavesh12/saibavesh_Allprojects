package Create_file;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Serialdata2 {
    public static void main(String[] args) {
        // Create a list
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee(101, "Minisha Shah"));
        employees.add(new Employee(102, "Rahul Kumar"));
        employees.add(new Employee(103, "Alex Johnson"));
        
        // Write all records
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employeess.txt"))) {
            for (Employee emp : employees) {
                writer.write(emp.toString());
                writer.newLine();
            }
            System.out.println(employees.size() + " records saved successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        // Print in console
        System.out.println("\nAll Employee Records:");
        employees.forEach(emp -> System.out.println(emp));
    }
}