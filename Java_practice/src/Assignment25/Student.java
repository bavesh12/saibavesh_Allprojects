package Assignment25;

public class Student {
    private final String name;
    private final String rollNumber;
    private final int marks;

    public Student(String name, String rollNumber, int marks) {
        this.name = name != null ? name : "";
        this.rollNumber = rollNumber != null ? rollNumber : "";
        this.marks = (marks >= 0 && marks <= 100) ? marks : 0;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void displayDetails() {
        System.out.println("Student: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks);
    }

    // Reserved for future implementation
    protected boolean inputMarks(int newMarks) {
        return false; // Not implemented yet
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", "A001", 85);
        Student student2 = new Student("Bob", "B002", -10); // Invalid marks
        System.out.println("Testing Student 1:");
        student1.displayDetails();
        System.out.println("Testing Student 2 (invalid marks):");
        student2.displayDetails();
    }
}