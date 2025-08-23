package Selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class First {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("First Script");
		//setup browser (Chrome driver,firefox driver)
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\New folder\\chromedriver-win64\\chromedriver.exe");
	
		//create object for browser
		//Set WebApplication URL
//		try {
//			WebDriver driver=new ChromeDriver();
//			driver.get("https://www.selenium.dev/");
//			driver.manage().window().maximize();
//			Thread.sleep(5000);
//			driver.close();
//			System.out.println("Page load successfully");
//		}
//		catch(Exception e) {
//			System.out.println("Unable to open url");
//		}
		
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String expectedurl="https://www.selenium.dev/";
		String actualurl=driver.getCurrentUrl();
		if(expectedurl.equals(actualurl)) {
			System.out.println("Validation successful");
		}
		else {
			System.out.println("Validation failed");
		}
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		System.out.println("Page load successfully");
		
		
		
		
		
	}

}









