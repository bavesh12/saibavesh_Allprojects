package Testing_package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.function.Function;

import java.time.Duration;
import java.util.NoSuchElementException;

public class wait_ex1 {    
    @Test
    // explicit wait
    public void f() {
		/*
		 * WebDriver driver = new ChromeDriver();
		 * 
		  driver.get("http://zero.webappsecurity.com/login.html");
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 * 
		 * // Wait for and interact with username field WebElement user =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login"))
		 * ); user.sendKeys("username");
		 * 
		 * // Wait for and interact with password field WebElement pass =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "user_password"))); pass.sendKeys("password");
		 * 
		 * // Wait for and click login button WebElement loginButton =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));
		 * loginButton.click();
		 */
    	
    	WebDriver driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
    	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    	    .withTimeout(Duration.ofSeconds(10))
    	    .pollingEvery(Duration.ofSeconds(2))
    	    .ignoring(NoSuchElementException.class);

    	WebElement user = wait.until(new Function<WebDriver, WebElement>() {
    	    public WebElement apply(WebDriver driver) {
    	        return driver.findElement(By.id("user_login"));
    	    }
    	});
    	
    
    }
   
}