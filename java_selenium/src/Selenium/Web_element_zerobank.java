package Selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element_zerobank {

	
		
		public static void loginstep(WebDriver driver,String user1,String pass1,String testexecution) throws InterruptedException
		{
			System.out.println("Manual test-->"+testexecution);
			WebElement user=driver.findElement(By.id("user_login"));
			user.sendKeys(user1);
			WebElement pass=driver.findElement(By.id("user_password"));
			pass.sendKeys(pass1);
			driver.findElement(By.name("submit")).click();
			Thread.sleep(5000);
		}
		public static void main(String args[]) throws InterruptedException{
			WebDriver driver=new ChromeDriver();
			driver.get("http://zero.webappsecurity.com/login.html");
			System.out.println("Welcome to zero bank login page");
			
			loginstep(driver,"12345","password","unable to login");
			loginstep(driver,"username","12345678","unable to login");
			loginstep(driver,"345dfgh","fgh4567","unable to login");
			loginstep(driver,"","","unable to login");
			loginstep(driver,"username","password","user is able to login successfully");
			
		}

	}


