package Create_file;

import java.nio.file.*;
import java.io.IOException;

public class FileAppendExample {
    public static void main(String[] args) throws IOException{
        Path filePath = Paths.get("Append.txt");
        String content = "good morning everyone\n";
        
        
            // Write with APPEND option (creates file if doesn't exist)
            Files.writeString(filePath,content,StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            
            System.out.println("File Created");
            System.out.println("Data appended successfully");
    }
}