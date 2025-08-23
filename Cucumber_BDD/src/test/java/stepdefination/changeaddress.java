package stepdefination;


import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class changeaddress {

    WebDriver driver;
    Actions actions;
    JavascriptExecutor js;

    @Given("I login to eBay with my credentials")
    public void i_login_to_ebay_with_my_credentials() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        actions = new Actions(driver);
        js = (JavascriptExecutor) driver;

        driver.get("https://www.ebay.com/");

        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();

        WebElement emailField = driver.findElement(By.id("userid"));
        emailField.clear();
        emailField.sendKeys("username951520@gmail.com");

        WebElement continueButton = driver.findElement(By.id("signin-continue-btn"));
        continueButton.click();

        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.clear();
        passwordField.sendKeys("Ammanana@0310");

        WebElement signInButton = driver.findElement(By.id("sgnBt"));
        signInButton.click();
    }

    @When("I hover over my profile")
    public void i_hover_over_my_profile() {
        WebElement profileElement = driver.findElement(By.cssSelector("#gh > nav > div.gh-nav__left-wrap > span.gh-identity"));
        actions.moveToElement(profileElement).perform();
    }

    @And("I navigate to account settings")
    public void i_navigate_to_account_settings() {
        WebElement accountSettings = driver.findElement(By.linkText("Account settings"));
        accountSettings.click();
    }

    @And("I go to personal information")
    public void i_go_to_personal_information() {
        WebElement personalInfo = driver.findElement(By.id("account-settings-link-PI"));
        personalInfo.click(); 
    }

    @And("I scroll down by {int} pixels")
    public void i_scroll_down_by_pixels(int pixels) {
        js.executeScript("window.scrollBy(0," + pixels + ")");
    }

    @And("I click edit address button")
    public void i_click_edit_address_button() {
        WebElement editAddressButton = driver.findElement(By.id("individual_personal_info_address_edit_button"));
        editAddressButton.click();
    }

    @And("I update my address details")
    public void i_update_my_address_details() throws InterruptedException {
        WebElement addressLine = driver.findElement(By.id("addressLine1"));
        addressLine.clear();
        addressLine.sendKeys("langer house");

        WebElement city = driver.findElement(By.id("city"));
        city.clear();
        city.sendKeys("Hyderabad");

        WebElement stateDropdown = driver.findElement(By.id("stateOrProvince"));
        Select stateSelect = new Select(stateDropdown);
        stateSelect.selectByValue("TS");

        WebElement postalCode = driver.findElement(By.id("postalCode"));
        postalCode.clear();
        postalCode.sendKeys("500085");
        
        Thread.sleep(3000);
        
        WebElement submitButton = driver.findElement(By.id("address_edit_submit_button"));
        submitButton.click();
    }

    @Then("my address should be updated successfully")
    public void my_address_should_be_updated_successfully() {
    	System.out.println("successfully changed address");
        
        driver.quit();
    }
}