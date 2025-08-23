package Create_file;
import java.io.File;

public class FileDetails {
    public static void main(String[] args) {
        File f = new File("sample.txt");

        if (f.exists()) {
            System.out.println("File name: " + f.getName());// Print file name
            System.out.println("File Location: " + f.getAbsolutePath());// File path
            System.out.println("File size: " + f.length());// File size in bytes
            System.out.println("File readable:"+ f.canRead());
            System.out.println("File writable:"+f.canWrite());
        } else {
            System.out.println("File not found");
        }
    }
}
