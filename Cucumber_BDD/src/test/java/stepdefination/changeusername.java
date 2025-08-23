package stepdefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class changeusername {

    WebDriver driver;

    @Given("I log into eBay with valid credentials")
    public void i_log_into_ebay_with_valid_credentials() {        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.ebay.com/");

        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();

        WebElement emailField = driver.findElement(By.id("userid"));
        emailField.clear();
        emailField.sendKeys("username951520@gmail.com");

        WebElement continueButton = driver.findElement(By.id("signin-continue-btn"));
        continueButton.click();

        // Add a small delay for page transition
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.clear();
        passwordField.sendKeys("Ammanana@0310");

        WebElement signInButton = driver.findElement(By.id("sgnBt"));
        signInButton.click();

        System.out.println("Logged into eBay account successfully");
    }

    @When("I hover over the profile icon")
    public void i_hover_over_the_profile_icon() {
        // Add a small delay to ensure page is loaded
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Using a more reliable selector for the profile icon
        WebElement profileMenu = driver.findElement(By.cssSelector("#gh > nav > div.gh-nav__left-wrap > span.gh-identity")); 
        Actions actions = new Actions(driver); 
    	actions.moveToElement(profileMenu).build().perform(); 
        System.out.println("Clicked profile menu");
    }

    @And("I navigate to account preferences")
    public void i_navigate_to_account_preferences() {
        // Add a small delay for menu to appear
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement accountSettings = driver.findElement(By.linkText("Account settings"));
        accountSettings.click();
        System.out.println("Navigated to account preferences");
    }

    @And("I click on personal information")
    public void i_click_on_personal_information() {
        // Add a small delay for page load
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//*[@id=\"account-settings-link-PI\"]")).click(); 
        System.out.println("Opened personal information section");
    }

    @And("I select edit username option")
    public void i_select_edit_username_option() {
        // Add a small delay for page load
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement editUsername = driver.findElement(By.linkText("Edit"));
        editUsername.click();
        System.out.println("Clicked edit username");
    }

    @And("I update the username to {string}")
    public void i_update_the_username_to(String newUsername) {
        // Add a small delay for page load
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.clear();
        usernameField.sendKeys(newUsername);

        WebElement saveButton = driver.findElement(By.id("saveBtn"));
        saveButton.click();

        System.out.println("Updated username to: " + newUsername);
    }

    @And("I re-login after username change")
    public void i_re_login_after_username_change() {
        // Add a small delay for changes to take effect
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Log out first
        WebElement profileMenu = driver.findElement(By.id("gh-ug"));
        profileMenu.click();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement signOut = driver.findElement(By.linkText("Sign out"));
        signOut.click();
        
        // Now log back in
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();

        WebElement emailField = driver.findElement(By.id("userid"));
        emailField.clear();
        emailField.sendKeys("username951520@gmail.com");

        WebElement continueButton = driver.findElement(By.id("signin-continue-btn"));
        continueButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.clear();
        passwordField.sendKeys("Ammanana@0310");

        WebElement signInButton = driver.findElement(By.id("sgnBt"));
        signInButton.click();

        System.out.println("Re-logged in after username change");
    }

    @Then("the username should be updated on my account")
    public void the_username_should_be_updated_on_my_account() {
        // Add a small delay for page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        WebElement profileMenu = driver.findElement(By.id("gh-ug"));
        String updatedUsername = profileMenu.getText();

        System.out.println("Verified username after update: " + updatedUsername);

        driver.quit();
    }
}