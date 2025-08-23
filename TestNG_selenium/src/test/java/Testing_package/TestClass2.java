package Testing_package;

import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestClass2 {
    
    @Test
    public void amazon() throws InterruptedException {
        // Set the path to your chromedriver executable
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        try {
            // Navigate to Amazon India
            driver.get("https://www.flipkart.in/");
            
            // Maximize the browser window
            driver.manage().window().maximize();
            
            // URL validation
            String expectedurl = "https://www.flipkart.in/";
            String actualurl = driver.getCurrentUrl();
            Assert.assertEquals(actualurl, expectedurl, "flipkart URL validation failed");
            
            // Wait for 3 seconds
            Thread.sleep(3000);
            
            // Print thread ID
            System.out.println("flipkart - Thread ID: " + Thread.currentThread().getId());
            
        } finally {
            // Quit the driver in finally block to ensure it closes even if test fails
            driver.quit();
        }
    }
}