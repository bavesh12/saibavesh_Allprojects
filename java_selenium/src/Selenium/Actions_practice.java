package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		
		
		WebElement doubleclick=driver.findElement(By.id("doubleClickBtn"));
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick).perform();
		System.out.println("Double click");
		
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		Actions act1=new Actions(driver);
		act1.contextClick(rightclick).perform();
		System.out.println("Right click");
		
//		WebElement click=driver.findElement(By.id("ClickBtn"));
//		act.contextClick(click).perform();
//		System.out.println(" click");
		System.out.println("Click");
		
		

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement motors=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
		act.moveToElement(motors).perform();
		Thread.sleep(5000);
		
		WebElement fashion=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[5]/a"));
		act.moveToElement(fashion).perform();
		Thread.sleep(5000);
		
		WebElement sports=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[7]/a"));
		act.moveToElement(sports).perform();
		
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		//Actions act=new Actions(driver);
		//JavascriptExecutor js1=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).perform();
		Thread.sleep(5000);
		driver.close();
	}
	

}
