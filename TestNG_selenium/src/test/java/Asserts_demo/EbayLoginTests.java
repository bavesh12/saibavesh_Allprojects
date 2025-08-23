package Asserts_demo;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;

public class EbayLoginTests {
    WebDriver driver;
    boolean stopExecution = false;
    
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
    }
    
    // Test pass
    @Test(enabled = true)
    public void navigateToLoginPage() {
        if(stopExecution) throw new SkipException("Test skipped");
        Assert.assertTrue(driver.getTitle().contains("eBay")); // Simple check that will pass
    }
    
    // Test will skip
    @Test(enabled = false)
    public void disabledTest() {
        System.out.println("This test is disabled");
    }
    
    // Test pass (3 times)
    @Test(invocationCount = 3)
    public void checkLoginPageTitle() {
        Assert.assertTrue(driver.getCurrentUrl().contains("ebay.com")); // Simple check that will pass
    }
    
    //Optional parameters
    @Test
    @Parameters({"username", "password"})
    public void parameterizedLoginTest(@Optional("defaultUser") String username, 
                                     @Optional("defaultPass") String password) {
        throw new SkipException("Skipping parameterized test");
    }
    
    // Test pass
    @Test
    public void login() {
        Assert.assertTrue(driver.findElement(By.id("gh-logo")).isDisplayed()); // Simple check that will pass
    }
    
    // Test will skip
    @Test(dependsOnMethods = "login")
    public void searchProduct() {
        throw new SkipException("Skipping search product test");
    }
    
    // Test will skip (depends on searchProduct which is skipped)
    @Test(dependsOnMethods = "searchProduct")
    public void logout() {
        System.out.println("This won't execute due to dependency");
    }
    
    @DataProvider(name = "loginData")
    public Object[][] provideLoginData() {
        return new Object[][] {
            {"username951520@gmail.com","Ammanana@0310"},
            {"testuser1@example.com", "pass123"},
            {"invaliduser", "wrongpass"},
            {"", ""}
        };
    }
    
    // Test will pass for all data sets
    @Test(dataProvider = "loginData")
    public void dataDrivenLoginTest(String username, String password) {
        Assert.assertTrue(true); // Always passes
    }
    
    @AfterMethod
    public void afterMethod(ITestResult result) {
        if(result.getStatus() == ITestResult.FAILURE) {
            stopExecution = true;
        }
    }
}