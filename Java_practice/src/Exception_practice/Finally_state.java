package Exception_practice;

public class Finally_state {
    public static void main(String[] args) {
        try {
            int[] a = new int[4];
            System.out.println(a[6]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e); // Exception handling
        } finally {
            System.out.println("Important code"); // Always executed
        }

        System.out.println("End"); // Executed after finally
    }
}
