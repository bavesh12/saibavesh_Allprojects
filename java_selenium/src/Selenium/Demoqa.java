package Selenium;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException, IOException{
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		
				
		
		
		WebElement fname=driver.findElement(By.id("firstName"));
		fname.sendKeys("sai");
		WebElement lname=driver.findElement(By.id("lastName"));
		lname.sendKeys("k");
		WebElement email =driver.findElement(By.id("userEmail"));
		email.sendKeys("saik@gmail.com");
		WebElement mnum =driver.findElement(By.id("userNumber"));
		mnum.sendKeys("8886801300");
		
		
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement year  = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select sel = new Select(year);
		//sel.selectByIndex(125);//2025
		//sel.selectByValue("2025");
		sel.selectByVisibleText("2025");
		
		//driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement month  = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		Select sel1 = new Select(month);
		sel1.selectByIndex(0);
		//sel1.selectByIndex(1);
		//sel1.selectByVisibleText("February");
		
		//selecting particular date
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[4]")).click();
		
		WebElement sub=driver.findElement(By.id("subjectsInput"));
		String[] subjects= {"Math","phy","Eco","eng"};
		for(String subject:subjects) {
			sub.sendKeys(subject);
			sub.sendKeys(Keys.ENTER);
		}
//		sub.sendKeys("Maths");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("ph");
//		sub.sendKeys(Keys.ENTER);
//		sub.sendKeys("a");
//		sub.sendKeys(Keys.ARROW_DOWN);
//		sub.sendKeys(Keys.ENTER);
		
		js.executeScript("window.scrollBy(0,900)");
		
		WebElement ch2= driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label"));
		ch2.click();
		
		
		WebElement ch3= driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
		ch3.click();
		
		
		
		
		
		
		
		WebElement img=driver.findElement(By.id("uploadPicture"));
		img.sendKeys("C:\\Users\\user\\Pictures\\cartoonboy.jpg");
		
		
		WebElement add=driver.findElement(By.id("currentAddress"));
		add.sendKeys("HIG-15,Near Nexus Mall,Phase-6,Hyderabad-500085");
		
		
		
		
		WebElement state=driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("NCR");
		state.sendKeys(Keys.ENTER);
		
		
		WebElement city=driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Delhi");
		city.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("submit")).click();
		
		
		

		
		Thread.sleep(7000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File dest=new File("screenshot1.png");
		   Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);
		driver.close();
	}

}
