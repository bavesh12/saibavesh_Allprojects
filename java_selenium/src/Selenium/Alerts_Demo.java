package Selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement samplealert=driver.findElement(By.cssSelector("button[id=\"alertButton\"]"));
		samplealert.click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(5000);
		
		
		WebElement timealert=driver.findElement(By.cssSelector("button[id=\"timerAlertButton\"]"));
		timealert.click();
		Thread.sleep(7000);
		
		Alert alert3=driver.switchTo().alert();
		alert3.accept();
		//alert2.dismiss();
		
		Thread.sleep(5000);
		
		WebElement confirmalert=driver.findElement(By.cssSelector("button[id=\"confirmButton\"]"));
		confirmalert.click();
		Thread.sleep(3000);
		Alert alert1=driver.switchTo().alert();
		//alert.accept();
		alert1.dismiss();
		
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		WebElement promptalert=driver.findElement(By.cssSelector("button[id=\"promtButton\"]"));
		promptalert.click();
		Thread.sleep(3000);
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("sai");
		alert2.accept();
		//alert2.dismiss();
		
		
		driver.close();
	}

}
