package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String expectedTitle="selenium";
		String actualTitle=driver.getTitle();
		System.out.println("Page load successfully");
		System.out.println("Actal Title    :"+actualTitle);
		System.out.println("Expected Title :"+expectedTitle);
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title Not Matched");
		}
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		

	}

}
