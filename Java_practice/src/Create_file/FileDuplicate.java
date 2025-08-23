package Create_file;

import java.nio.file.*;
import java.io.IOException;


public class FileDuplicate {
    public static void main(String[] args) {
        try {
            Path originalFile = Paths.get("original.txt");
            Path copiedFile = Paths.get("duplicate.txt");

            Files.writeString(originalFile, "Hello! everyone");

            Files.copy(originalFile, copiedFile, StandardCopyOption.REPLACE_EXISTING);

            System.out.println("copy completed successfully.");
        } catch (IOException e) {
            System.err.println("Error during file operation: " + e.getMessage());
            e.printStackTrace();
        }
    }
}