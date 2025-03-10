// src/test/java/runners/TestRunner.java
package runners;

import io.cucumber.testng.CucumberOptions;


import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/test/resources/features/Login.feature",
    glue = "stepdefinitions",
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
    // Empty class to run Cucumber tests
	
	


}
