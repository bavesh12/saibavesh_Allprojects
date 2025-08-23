package Create_file;

import java.io.File;
public class CreateNew_file {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\saiba\\Desktop\\count.txt");
        try {
            f.createNewFile(); // create file on particular location
            System.out.println(f.setWritable(true));
        }
        catch(Exception e) {
            System.out.println("File not found");
            System.out.println(e);
        }
    }
}