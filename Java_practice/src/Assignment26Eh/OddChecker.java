package Assignment26Eh;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddChecker {
    public static void checkOdd(int n) throws OddNumberException {
        if (n % 2 != 0) {
            throw new OddNumberException("Odd number: " + n);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5};
        for (int n : numbers) {
            try {
                checkOdd(n);
                System.out.println(n + " is even");
            } catch (OddNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}