package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrm {

	public static void loginstep(WebDriver driver,String user1,String pass1,String testexecution) throws InterruptedException
	{
		System.out.println("Manual test-->"+testexecution);
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.name("username"));
		user.sendKeys(user1);
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys(pass1);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
	}
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Welcome to OHRM  login page");
		
		loginstep(driver,"12345","password","unable to login");
		loginstep(driver,"username","12345678","unable to login");
		loginstep(driver,"345dfgh","fgh4567","unable to login");
		loginstep(driver,"","","unable to login");
		loginstep(driver,"Admin","admin123","user is able to login successfully");
		
	}

}
