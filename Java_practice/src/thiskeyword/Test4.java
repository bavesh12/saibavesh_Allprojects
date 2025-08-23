package thiskeyword;

class Test4 {
    int rollno;
    String name;

    // Constructor with two parameters
    Test4(int rollno, String name) {
        this.rollno = rollno;   // refers to instance variable
        this.name = name;
    }

    // Constructor with one parameter, calls another constructor
    Test4(int rollno) {
        this(rollno, "Unknown"); // invokes constructor with rollno and name
    }

    // Method to display details
    void display() {
        System.out.println("Roll No: " + this.rollno);
        System.out.println("Name: " + this.name);
    }

    // Method to show how 'this' can be used to call another method
    void show() {
        this.display(); // calling display() using this
    }

    public static void main(String[] args) {
        Test4 s1 = new Test4(101, "Anil");
        Test4 s2 = new Test4(102);

        s1.show(); // uses 'this' to call display()
        s2.show();
    }
}
