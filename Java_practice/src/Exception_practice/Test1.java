package Exception_practice;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            int[] a = new int[4];
            System.out.println(a[6]); // ArrayIndexOutOfBoundsException

            System.out.println(5 / 0); // ArithmeticException

            String str = "Hello";
            System.out.println(str.charAt(6)); // StringIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e);
        }
    }
}
