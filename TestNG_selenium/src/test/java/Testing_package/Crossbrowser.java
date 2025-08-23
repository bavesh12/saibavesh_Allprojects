package Testing_package;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class Crossbrowser {
    WebDriver driver;
    
    @BeforeTest
    public void setup() {
        // Common setup can go here if needed
    }
    
    @Test
    public void chromeBrowser() throws InterruptedException {
    	driver = new ChromeDriver();
    	driver.get("https://www.flipkart.com/");
        String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle, "Flipkart title validation failed");
        Thread.sleep(3000);
    }
    
    @Test
    public void firefoxBrowser() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");
        String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle, "Flipkart title validation failed");
        Thread.sleep(3000);
    }
    
    @Test
    public void edgeBrowser() throws InterruptedException {
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\saiba\\Desktop\\Selenium\\edgedriver_win64\\msedgedriver.exe");
    	driver = new EdgeDriver();
    	driver.get("https://www.flipkart.com/");
        String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle, "Flipkart title validation failed");
        Thread.sleep(3000);
    }
    
    
    @AfterMethod
    public void afterTest() {
    	driver.quit();
    }
}