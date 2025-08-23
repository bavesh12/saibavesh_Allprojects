package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
    WebDriver driver;
    
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    
    @DataProvider(name = "loginData")
    public Object[][] provideLoginData() {
        return new Object[][] {
            {"standard_user", "secret_sauce", true},  // valid credentials
            {"locked_out_user", "secret_sauce", false}, 
            {"problem_user", "secret_sauce", true},   //valid
            {"performance_glitch_user", "secret_sauce", true},// valid
            {"invalid_user", "invalid_pass", false},
            {"", "secret_sauce", false},
            {"standard_user", "", false}
        };
    }
    
    @Test(dataProvider = "loginData")
    public void testLoginWithMultipleCredentials(String username, String password, boolean expectedSuccess) {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        
        usernameField.clear();
        usernameField.sendKeys(username);
        passwordField.clear();
        passwordField.sendKeys(password);
        loginButton.click();
    }
}