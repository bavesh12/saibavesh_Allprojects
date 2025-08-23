package Create_file;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_data {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("sample2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s1 = (Student) ois.readObject();
        Student s2 = (Student) ois.readObject();

        ois.close();
        fis.close();

        FileWriter fw = new FileWriter("sample2_output.txt");
        fw.write(s1.toString() + "\n");
        fw.write(s2.toString() + "\n");
        fw.close();

        System.out.println("Deserialized and converted to text format.");
    }
}
