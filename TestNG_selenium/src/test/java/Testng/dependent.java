package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dependent {
    WebDriver driver;
    private WebDriverWait wait;

    String baseUrl = "https://www.ebay.com/";
    
    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    
    @Test(priority = 1, description = "Login to eBay account")
    public void login() {
        driver.get(baseUrl);
        WebElement signInLink = wait.until(ExpectedConditions.elementToBeClickable(
            By.linkText("Sign in")));
        signInLink.click();

        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.id("userid")));
        usernameField.sendKeys("username951520@gmail.com");
        
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.id("signin-continue-btn")));
        continueButton.click();
        
        WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.id("pass")));
        passwordField.sendKeys("Ammanana@0310");
        
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(
            By.id("sgnBt")));
        signInButton.click();

        System.out.println("Login steps completed");
    }

    @Test(dependsOnMethods = "login")
    public void searchProduct() {
        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("iPhone 13");
        driver.findElement(By.id("gh-search-btn")).click();
        
        System.out.println("Product search completed");
    }
    
    @Test(dependsOnMethods = "searchProduct")
    public void logout() {
        WebElement accountMenu = driver.findElement(By.cssSelector("#gh > nav > div.gh-nav__left-wrap > span.gh-identity")); ;
        
        Actions actions = new Actions(driver); 
        actions.moveToElement(accountMenu).build().perform();
        
        WebElement signOutLink = wait.until(ExpectedConditions.elementToBeClickable(
            By.linkText("Sign out")));
        signOutLink.click();
        
        System.out.println("Logout completed");
    }
    
    @AfterClass
    public void Test() {
        if (driver != null) {
            driver.close();
        }
    }
}