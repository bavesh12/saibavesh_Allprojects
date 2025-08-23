package Testing_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class wait_ex {
    WebDriver driver;
    
    
    @BeforeTest
    public void implicitWait() {
        driver = new ChromeDriver();

        // Set implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void openpage() throws InterruptedException
    {
    	 driver.get("https://www.flipkart.com/");
         String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
         String actualtitle = driver.getTitle();
         Assert.assertEquals(actualtitle, expectedtitle, "Flipkart title validation failed");
         
         WebElement search = driver.findElement(By.name("q"));
         search.sendKeys("Watch");
         search.sendKeys(Keys.ENTER);
         System.out.println("Search button availble on webpage");
         
         WebElement add = driver.findElement(By.name("gf"));
         add.click();
       
    }   
    @AfterMethod
    public void afterTest() {
    	driver.quit();
    }
}