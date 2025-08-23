package Create_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Se_data {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student(101, "Neeva Sharma");
        Student s2 = new Student(102, "sai Sharma");

        
        
        FileOutputStream fos = new FileOutputStream("sample2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(s1);
        oos.writeObject(s2);

        oos.close();
        fos.close();
        System.out.println("Serialization done successfully");
    }
}