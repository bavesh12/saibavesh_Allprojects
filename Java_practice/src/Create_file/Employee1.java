package Create_file;


import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee1 implements Serializable {
    private int id;
    private String name;
    
    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return id + "," + name; 
    }
}