package Create_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Serial_data {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "sai");
        Employee emp1 = new Employee(102, "kumar sharma");

        try {
            FileWriter fw = new FileWriter("Employee.txt");
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write(emp.toString());
            bf.newLine();
            bf.write(emp1.toString());
            bf.newLine();
            bf.close();
            fw.close();
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("Failed");
            System.out.println(e);
        }
    }
}
