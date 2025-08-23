package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerobanknt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to zero bank ");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("12345678");
		
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("");
		driver.findElement(By.name("submit")).click();
		String h3Text = driver.findElement(By.tagName("h3")).getText();
		System.out.println("Error msg " + h3Text);
		if(h3Text.contains("Troubles entering the site?")) {
			System.out.println("Login Failed");
		}
		else {
			System.out.println("Login Successful");
		}
		
		
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to zero bank ");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("12345678");
		
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("12345678");
		driver.findElement(By.name("submit")).click();
		String h3t = driver.findElement(By.tagName("h3")).getText();
		System.out.println("Error msg " + h3t);
		if(h3t.contains("Troubles entering the site?")) {
			System.out.println("Login Failed");
		}
		else {
			System.out.println("Login Successful");
		}
		
		
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to zero bank ");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("");
		
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("");
		driver.findElement(By.name("submit")).click();
		String h32 = driver.findElement(By.tagName("h3")).getText();
		System.out.println("Error msg: " + h32);
		if(h32.contains("Troubles entering the site?")) {
			System.out.println("Login Failed");
		}
		else {
			System.out.println("Login Successful");
		}

		
		driver.get("http://zero.webappsecurity.com/login.html");
		System.out.println("Welcome to zero bank ");
		driver.findElement(By.id("user_login")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		
		driver.findElement(By.id("user_password")).click();
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		
		driver.findElement(By.name("submit")).click();
		String expextedurl1="http://zero.webappsecurity.com/login.html?login_error=true";
		String acurl1=driver.getCurrentUrl();
		
		if(acurl1.equals(expextedurl1))
		{
			System.out.println("Login Failed");	
		}
		else {
			System.out.println("Login Successfull");
		}
		
		Thread.sleep(5000);
		
		
		driver.close();
	}

}
