package Create_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperationsDemo {
    public static void main(String[] args) throws IOException {
        File dataFile = new File("sample1.txt");
        try {
            dataFile.createNewFile();
            System.out.println("File writable: " + dataFile.setWritable(true));
        } catch (Exception e) {
            System.out.println("Error in file creation");
            System.out.println(e);
        }
        
        if (dataFile.exists()) {
            System.out.println("\nFile Information:");
            System.out.println("File name: " + dataFile.getName());
            System.out.println("File path: " + dataFile.getAbsolutePath());
            System.out.println("File size: " + dataFile.length());
            System.out.println("Readable: " + dataFile.canRead());
            System.out.println("Writable: " + dataFile.canWrite());
        } else {
            System.out.println("File does not exist");
        }

        try {
            PrintWriter fileWriter = new PrintWriter(new FileWriter("sample1.txt",true));// because file exits it appends the same content or if not exist it creates one
            fileWriter.println("hello everyone");
            fileWriter.println("welcome to the wipro training");
            fileWriter.close();
            System.out.println("\nData written successfully to sample1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nFile Contents:");
        List<String> fileContents = new ArrayList<String>();
        BufferedReader fileReader = new BufferedReader(new FileReader("sample1.txt"));
        String currentLine;
        while ((currentLine = fileReader.readLine()) != null) {
            fileContents.add(currentLine);
        }
        for (String content : fileContents) {
            System.out.println(content);
        }
        fileReader.close();
    }
}