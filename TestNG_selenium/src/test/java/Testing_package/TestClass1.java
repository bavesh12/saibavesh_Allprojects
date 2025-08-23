package Testing_package;

import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestClass1 {
    
    @Test
    public void amazon() throws InterruptedException {
        // Set the path to your chromedriver executable
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        try {
            // Navigate to Amazon India
            driver.get("https://www.amazon.in/");
            
            // Maximize the browser window
            driver.manage().window().maximize();
            
            // URL validation
            String expectedurl = "https://www.amazon.in/";
            String actualurl = driver.getCurrentUrl();
            Assert.assertEquals(actualurl, expectedurl, "Amazon URL validation failed");
            
            // Wait for 3 seconds
            Thread.sleep(3000);
            
            // Print thread ID
            System.out.println("Amazon - Thread ID: " + Thread.currentThread().getId());
            
        } finally {
            // Quit the driver in finally block to ensure it closes even if test fails
            driver.quit();
        }
    }
}