package Testing_package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Para_testing {
    WebDriver driver;
    
    @BeforeClass
    public void beforeClass() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.manage().window().maximize();
    }
    
    @Test(priority=4)
    public void eBay() throws InterruptedException {
        driver.get("https://www.ebay.com/?gad_source=1&gad_campaignid=22873541418&gbraid=0AAAABA_yasEeTcZi");
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "eBay title validation failed");
        Thread.sleep(3000);
        System.out.println("E-bay - Thread ID:"+Thread.currentThread().getId());

    }
    
    @Test(priority=3)
    public void amazon() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        String expectedurl = "https://www.amazon.in/";
        String actualurl = driver.getCurrentUrl();
        Assert.assertEquals(actualurl, expectedurl, "Amazon URL validation failed");
        Thread.sleep(3000);
        System.out.println("Amazon - Thread ID:"+Thread.currentThread().getId());
    }
    
    @Test(priority=1)
    public void flipkart() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle, expectedtitle, "Flipkart title validation failed");
        Thread.sleep(3000);
        System.out.println("Flipkart - Thread ID:"+Thread.currentThread().getId());

    }
    
    @Test(priority=2)
    public void zerobank() throws InterruptedException {
        driver.get("http://zero.webappsecurity.com/");
        String expectedTitle = "Zero - Personal Banking - Loans - Credit Cards";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "ZeroBank title validation failed");
        Thread.sleep(3000);
        System.out.println("zerobank - Thread ID:"+Thread.currentThread().getId());

    }
    
    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}