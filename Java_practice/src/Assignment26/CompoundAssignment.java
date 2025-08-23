package Assignment26;

public class CompoundAssignment {
    public static void main(String[] args) {
        int x = 5;

        // Operation 1: x = x + 4.5;
        // This will NOT compile because 4.5 is a double 
        // Assigning a double to int requires explicit casting.

        // Operation 2: x += 4.5;
        // This compiles and runs. The compound assignment operator (+=) implicitly
        // casts the double result to int, truncating the decimal part.
        x += 4.5; // x becomes 9 (5 + 4.5 = 9.5, truncated to 9)
        System.out.println("After x += 4.5, x = " + x);
    }
}