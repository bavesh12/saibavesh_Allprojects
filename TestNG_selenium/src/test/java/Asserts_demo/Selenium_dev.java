package Asserts_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Selenium_dev {
    WebDriver driver;
    boolean stopExecution = false; // Control variable for test execution

    @BeforeClass
    public void beforeClass() {
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
    }

    @Test
    public void title() {
    	   if(stopExecution)
    	    {
    	    throw new SkipException("Skipping test");
    	    }        
        String expectedtitle = "Selenium dev";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle, "Title Validation failed");
        System.out.println("Expected Title: " + expectedtitle);
        System.out.println("Actual Title: " + actualtitle);
        Assert.fail("failing title");
    }

    @Test(dependsOnMethods = {"title"})
    public void url() {
    	 if(stopExecution)
    	    {
    	    throw new SkipException("Skitpping test");
    	    }
        String expectedurl = "https://www.selenium.dev/";
        String actualurl = driver.getCurrentUrl();
        Assert.assertEquals(actualurl, expectedurl, "URL Validation failed");
        System.out.println("Expected URL: " + expectedurl);
        System.out.println("Actual URL: " + actualurl);
        Assert.fail("failing url");
    }

    @AfterClass
    public void afterClass(ITestResult result) {
        if(result.getStatus()==ITestResult.FAILURE)
        {
        stopExecution=true;
        }
        driver.close();
    }
}