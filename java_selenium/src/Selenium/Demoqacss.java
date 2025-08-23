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

public class Demoqacss {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		WebElement fname=driver.findElement(By.cssSelector("input[id=\"firstName\"]"));
		fname.sendKeys("SAI KUMAR");
		
		WebElement lname=driver.findElement(By.cssSelector("input[id=\"lastName\"]"));
		lname.sendKeys("K");
		
//		WebElement fname=driver.findElement(By.cssSelector("input#firstName[class=\" mr-sm-2 form-control\"]"));
//		fname.sendKeys("sai Kumar");
		
		WebElement email=driver.findElement(By.cssSelector("input[id=\"userEmail\"]"));
		email.sendKeys("abcd@gmail.com");
		
		driver.findElement(By.cssSelector("label[for=\"gender-radio-1\"]")).click();

		WebElement mnum=driver.findElement(By.cssSelector("div>input[id=\"userNumber\"]"));
		mnum.sendKeys("8886801300");
		
		driver.findElement(By.cssSelector("input[id=\"dateOfBirthInput\"]")).click();
		driver.findElement(By.cssSelector("select>option[value=\"2025\"]")).click();
		driver.findElement(By.cssSelector("select>option[value=\"3\"]")).click();
		driver.findElement(By.cssSelector("div[class=\"react-datepicker__day react-datepicker__day--001\"]")).click();
	
		WebElement sub=driver.findElement(By.cssSelector("input[id=\"subjectsInput\"]"));
		sub.sendKeys("a");
		sub.sendKeys(Keys.ARROW_DOWN);
		sub.sendKeys(Keys.ENTER);
		
		js.executeScript("window.scrollBy(0,900)");
		
		driver.findElement(By.cssSelector("label[for=\"hobbies-checkbox-1\"]")).click();
		driver.findElement(By.cssSelector("label[for=\"hobbies-checkbox-2\"]")).click();
		
		WebElement img=driver.findElement(By.cssSelector("input[id=\"uploadPicture\"]"));
		img.sendKeys("C:\\Users\\user\\Pictures\\cartoonboy.jpg");
		
		
		WebElement add=driver.findElement(By.cssSelector("textarea[placeholder=\"Current Address\"]"));
		add.sendKeys("HIG-15,Near Nexus Mall,Phase-6,Hyderabad-500085");
		
		driver.findElement(By.cssSelector("div[id=\"state\"]")).click();
		WebElement inpt=driver.findElement(By.cssSelector("div>input[id=\"react-select-3-input\"]"));
		
		inpt.sendKeys("NCR");
		inpt.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("div[id=\"city\"]")).click();
		WebElement city=driver.findElement(By.cssSelector("input[id=\"react-select-4-input\"]"));
		city.sendKeys("delhi");
		city.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("button[id=\"submit\"]")).click();
		
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("screenshotcss12345.png");
		Files.copy(src.toPath(), dest.toPath(),StandardCopyOption.COPY_ATTRIBUTES);
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
