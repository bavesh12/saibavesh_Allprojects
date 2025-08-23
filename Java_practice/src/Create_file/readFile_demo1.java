package Create_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readFile_demo1 {
	public static void main(String[] args) throws IOException {
        List<String> lines = new ArrayList<String>();
        FileInputStream r = new FileInputStream("C:\\Users\\saiba\\Desktop\\java-selenium\\Java_practice\\sample2.docx");
        int line;
        while((line = r.read()) != -1) {
            System.out.println((char)line);
        }

        for(String l : lines) {
            System.out.println(l);
        }
        r.close();
    }

}
