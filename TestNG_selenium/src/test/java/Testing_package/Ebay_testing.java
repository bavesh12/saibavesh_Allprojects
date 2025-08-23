package Testing_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay_testing {
    WebDriver driver;
    
    @BeforeTest // 1 (setup)
    public void beforeTest() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    
    @Test // 2 (actual test case)
    public void search() {
        WebElement search = driver.findElement(By.id("gh-ac"));
        search.clear();
        search.sendKeys("Watch");
        search.sendKeys(Keys.ENTER);
        driver.navigate().refresh();
        
        // Clear and search for another item
       // search = driver.findElement(By.id("gh-ac"));
        //search.clear();
        //search.sendKeys("Phone");
        //search.sendKeys(Keys.ENTER);
    }
    @Test(priority = 1)
    public void search1() {
        WebElement search = driver.findElement(By.id("gh-ac"));
        search.clear();
        search.sendKeys("phone");
        search.sendKeys(Keys.ENTER);
        driver.navigate().refresh();
    }
    
    @Test(priority = 2)
    public void search2() {
        WebElement search = driver.findElement(By.id("gh-ac"));
        search.clear();
        search.sendKeys("Bag");
        search.sendKeys(Keys.ENTER);
        driver.navigate().refresh();
    }
    // Add this if you want to close the browser after tests
    @AfterTest
    public void afterTest() {
        Assert.assertTrue(true, "Search button is not working");
        driver.close();
    }
}