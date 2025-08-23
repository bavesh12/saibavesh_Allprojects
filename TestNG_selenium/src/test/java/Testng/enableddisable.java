package Testng;

import org.testng.annotations.Test;

public class enableddisable{
    @Test(enabled = true)
    public void activeTest() {
        System.out.println("This is the active test running");
    }

    @Test(enabled = false)
    public void disabledTest() {
        System.out.println("This test won't run as it's disabled");
    }
}