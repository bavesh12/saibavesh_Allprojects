package typecasting;

//File: Testdemo.java


class Test {
 void show() {
     System.out.println("Hello");
 }
}

class Test1 extends Test {
 void display() {
     System.out.println("Welcome");
 }

 void show() {
     System.out.println("How are you?");
 }
}


class Test2 extends Test1 {
    void display() {
        System.out.println("Good Morning");
    }

    void show() {
        System.out.println("Have a nice day");
    }
}
public class Testdemo {
 public static void main(String[] args) {
     Test t1 = new Test(); // Upcasting not done here yet
     t1.show();
     Test t = new Test1(); // Upcasting (Test1 object as Test type)
     t.show(); // Calls overridden method in Test1 -> "How are you?"
     Test1 tt = (Test1)t;
     tt.display();
     tt.show();
     Test t2 = new Test2(); // Upcasting Test2 to Test
     t2.show();
     }
 }

