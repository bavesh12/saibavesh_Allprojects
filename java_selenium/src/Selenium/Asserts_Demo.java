package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class Asserts_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement search =driver.findElement(By.id("gh-ac"));
		
		Assert.assertTrue(true,"No, search button is not available on page");
		
		WebElement search1 =driver.findElement(By.id("gh-ac"));
		search1.sendKeys("watch");
		search1.sendKeys(Keys.ENTER);
	}

}
