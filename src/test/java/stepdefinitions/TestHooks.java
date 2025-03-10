package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import utilities.ExtentReportManager;
import utilities.ScreenshotHelper;
import pages.LoginPage;

public class TestHooks {
    
    public static WebDriver driver;
    public static LoginPage loginPage;
    public static ScreenshotHelper screenshotHelper;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        screenshotHelper = new ScreenshotHelper(driver);

        // Initialize Extent Report before the first test starts
        ExtentReportManager.initReport();
        ExtentReportManager.createTest("Login Test");  // 🔥 Ensure test case is created
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }

        // Flush Extent Report after execution
        ExtentReportManager.flushReport();
    }
}
