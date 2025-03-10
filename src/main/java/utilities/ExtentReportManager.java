package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    public static ExtentReports extent;
    public static ExtentTest test;

    // Initialize the Extent Report
    public static void initReport() {
        if (extent == null) {
            ExtentSparkReporter htmlReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
        }
    }

    // Create a test case in the report
    public static void createTest(String testName) {
        if (extent == null) {
            initReport(); // Ensure the report is initialized before creating a test
        }
        test = extent.createTest(testName);
    }

    // Flush the report to write data
    public static void flushReport() {
        if (extent != null) {
            extent.flush();
        }
    }
}
