package Create_file;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class write_file {
    public static void main(String[] args) {
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter("sample.txt"));
            w.write("Hello\n");
            w.write("Welcome to Java");
            w.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}