package Multi_Threading;



//We can create Multi threading using
//1. By extending Thread class
//2. By implementing Runnable Interface

class Test1 extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Welcome");
         try {
             Thread.sleep(5);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

public class Test extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Hello");
         try {
             Thread.sleep(5);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }

 public static void main(String[] args) throws InterruptedException {
     Test t1 = new Test();     // creating thread
     Test1 t2 = new Test1();   // creating thread

     t1.start();
     t2.join();  // Main thread waits for t2 to complete (but t2 hasn't started yet)

     t2.start();
     t1.join();  // Main thread waits for t1 to complete
 }
}

