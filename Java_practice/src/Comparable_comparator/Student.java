package Comparable_comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int id;
    String name;
    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public int compareTo(Student s) {  // Fixed parentheses
        return this.id - s.id;
    }
    
    @Override
    public String toString() {
        return id + " " + name;
    }
    
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
            new Student(3, "Amit"),
            new Student(1, "Rahul"),
            new Student(2, "Kiran")
        );
        
        Collections.sort(list); // Uses Comparable
        
        list.forEach(System.out::println);
    }
}
