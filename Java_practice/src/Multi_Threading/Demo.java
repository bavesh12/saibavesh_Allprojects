package Multi_Threading;


class Demo1 extends Thread{
public void run()
{
	for(int i = 1; i <= 5;i++) {
		System.out.println("Hello");
	}
	System.out.println(Thread.currentThread().getName());
}
}

public class Demo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Welcome");
            System.out.println(Thread.currentThread().getName());
            Thread.yield(); // Suggests that the current thread is willing to yield its current use of a processor
        }
    }

    public static void main(String[] args) {
        Demo t1 = new Demo();
        Demo t2 = new Demo();
        t1.start();
        t2.start();
    }
}
