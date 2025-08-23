package Create_file;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable {
    int rollno;
    String name;
    
     Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    
     @Override
     public String toString() {
         return "rollno: " + rollno + ", Name: " + name;
     }
}