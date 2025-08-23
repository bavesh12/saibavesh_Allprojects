package Testng;

import org.testng.annotations.Test;

public class multipleruns {
    @Test
    public void repeatThisTest() {
        int numberOfRuns = 5; // Set how many times you want to run the test logic
        
        for (int i = 0; i < numberOfRuns; i++) {
            System.out.println("This test is running multiple times - " + System.currentTimeMillis());
        }
    }
}
