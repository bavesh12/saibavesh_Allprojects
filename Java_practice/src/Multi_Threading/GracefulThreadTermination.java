package Multi_Threading;

public class GracefulThreadTermination implements Runnable {
    private volatile boolean running = true;  //  visibility across threads

    @Override
    public void run() {
        while (running) {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
                Thread.currentThread().interrupt();  // Restore interrupt flag
                break;
            }
        }
        System.out.println("Thread stopped gracefully.");
    }

    // Method to stop the thread
    public void stopThread() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        GracefulThreadTermination task = new GracefulThreadTermination();
        Thread thread = new Thread(task);
        thread.start();

        Thread.sleep(3000);  // Let the thread run for 3 seconds
        task.stopThread();   // Stop the thread
    }
}