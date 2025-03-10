package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;
import utilities.ExtentReportManager;
import utilities.ScreenshotHelper;

import static stepdefinitions.TestHooks.driver;


import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentTest;

public class LoginSteps {
	
	private LoginPage loginPage;
	private ScreenshotHelper screenshotHelper;

    // Constructor for LoginSteps
    public LoginSteps() {
        // Initialize the LoginPage object
        loginPage = new LoginPage(driver);
        this.screenshotHelper = TestHooks.screenshotHelper;
    }
    
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
    	 if (ExtentReportManager.test == null) {
             ExtentReportManager.createTest("Login Page Test");
         }
    	driver.manage().window().maximize();  // Optional: Maximize the window
        driver.get("https://www.saucredemo.com/v1/"); 
        ExtentReportManager.test.info("Navigated to Login Page");
        
     // Take Screenshot and Add to Extent Report
        String screenshotPath = screenshotHelper.takeScreenshot("LoginPage");
        ExtentReportManager.test.addScreenCaptureFromPath(screenshotPath);
    }
    
    @When("the user enters username {string}")
    public void the_user_enters_username(String username) {
        loginPage.enterUsername(username);  // Call the method from LoginPage
        ExtentReportManager.test.info("User entered the username sucessfully");
    }

    @When("the user enters password {string}")
    public void the_user_enters_password(String password) {
        loginPage.enterPassword(password);  // Call the method from LoginPage
        ExtentReportManager.test.info("User entered password successfully.");
    }

    @Then("the user should be logged in")
    public void the_user_should_be_logged_in() {
        loginPage.clickLogin();  // Call the method from LoginPage
        ExtentReportManager.test.info("User clicked login successfully.");
        
    } 

      //optional to close browser after test
@After
public void tearDown() {
    driver.quit();
}
}
