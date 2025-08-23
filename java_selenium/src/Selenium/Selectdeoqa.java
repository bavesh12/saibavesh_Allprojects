package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selectdeoqa {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        
       
            driver.get("https://demoqa.com/select-menu");
            driver.manage().window().maximize();
            JavascriptExecutor js=(JavascriptExecutor)driver;
    		js.executeScript("window.scrollBy(0,200)");
            
            WebElement Dropdown = driver.findElement(By.id("oldSelectMenu"));
            Select os = new Select(Dropdown);
            os.selectByVisibleText("Blue");
            System.out.println("Selected from old dropdown: " + os.getFirstSelectedOption().getText());
        
            WebElement ms = driver.findElement(By.id("cars"));
            Select multiselect = new Select(ms);
            
            
            multiselect.selectByVisibleText("Black");
            multiselect.selectByVisibleText("Green");
            
            
            multiselect.selectByIndex(3); 
            
           
            List<WebElement> selectedOptions = multiselect.getAllSelectedOptions();
            
            for (WebElement option : selectedOptions) {
                System.out.println("- " + option.getText());
            
            
            }
            Thread.sleep(2000);
            
       
    }
}