package Testing_package;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;      
import java.util.List;

public class eBayTestCases {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;
    PageClass page;
    private static final String EBAY_URL = "https://www.ebay.com/";
    private static final String USERNAME = "username951520@gmail.com";
    private static final String PASSWORD = "Ammanana@0310";
    private static final String NEW_USERNAME = "saibavesh6665";
    private static final String NEW_ADDRESS = "langer housz, hyderabad, teleganan, 564006";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        page = new PageClass(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
        driver.get(EBAY_URL);
    }

    //Login
    @Test(priority = 1)
    public void testLogin() {
    	driver.get("https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&sgfl=gh");

    	// login
    	PageClass pg = new PageClass(driver);
    	pg.email_in();
    	pg.con_in();
    	pg.pass_in();
    	pg.submit_in();
    }
    
    //Multiple searches
    @Test(priority = 2) 
    public void testMultipleSearches() {
        String[] searchItems = {"laptop", "smartphone", "headphones", "watch", "camera"};
        PageClass pg = new PageClass(driver);
        
        try {
            for (String item : searchItems) {
                pg.searchItem(item);
                pg.clickSearchButton();
                pg.navigateToHome();
            }
        } catch (Exception e) {
            Assert.fail("Test failed: " + e.getMessage());
        }
    }
    
    @Test(priority = 3)
    public void addToCart() {
        page.navigateToProductPage();
        page.clickAddToCart();
        page.goToCart();
    }

    @Test(priority = 4, dependsOnMethods = "addToCart")
    public void deleteFromCart() {
        page.goToCart();
        page.removeItemFromCart();
        page.navigateToHome();

    }  
    
    @Test(priority = 5)
    public void ShopByCategories() {
        page.hoverOverCategoryMenu();
        page.selectElectronicsCategory();
        page.navigateToHomePage();
    }
    
    @Test(priority = 6)
    public void getProductDescription() {
        try {
            // search
            page.navigateToHomePage();
            page.searchForProduct("laptop");
            
            //Scroll andclick product
            page.scrollDown(500);
            page.clickProductImage();
            
            //new window
            page.switchToNewWindow();
            
            // Get and verify description
            String productDesc = page.getProductDescription();
            System.out.println("= product description =\n" + productDesc);
            Assert.assertFalse(productDesc.isEmpty(), "Description should not be empty");
            
            //back to lapotop
            page.closeNewWindowAndSwitchBack();
        } catch (Exception e) {
            Assert.fail("Test failed: " + e.getMessage());
        }
    }
    
    @Test(priority = 7)
    public void languageSelectionTest() {
        //Initialize and maximize
        page.maximizeWindow();
        page.navigateToHomePage();
        
        //Hover and select language
        page.hoverOverLanguageDropdown();
        page.selectGermanLanguage();
    }
    
    @Test(priority = 8)
    public void shopByCategoryAll() throws InterruptedException {
        page.openCategoryMenu();
        
        List<WebElement> categoryElements = page.getAllCategories();
        
        for (WebElement category : categoryElements) {
            page.highlightElement(category);
            page.clickCategory(category);
            page.navigateBack();
            page.openCategoryMenu();
        }
    }

    @Test(priority = 9)
    public void changeLoginName() throws InterruptedException {
        page.hoverOverUserProfile();
        page.navigateToAccountSettings();
        page.clickAccountSettingsLink();
        page.clickEditUsername();
        page.updateUsername(NEW_USERNAME);
        page.loginAfterUsernameChange("username951520@gmail.com", "Ammanana@0310");
    }
    
    @Test(priority = 10)
    public void changeaddress() throws InterruptedException { 
    	page.hoverOverUserProfile1();
        page.navigateToAccountSettings1();
        page.clickAccountSettings1();
        page.scrollDown(400);
        page.clickEditAddress();
        page.scrollDown(400);
        page.updateAddress("@@@@@$$$$", "Hyderabad", "500085");
 }
}