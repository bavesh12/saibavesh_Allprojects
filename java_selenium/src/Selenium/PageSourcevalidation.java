package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourcevalidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		String PageSource=driver.getPageSource();
		System.out.println("PageSource:"+PageSource);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		System.out.println("Page load successfully");


	}

}
