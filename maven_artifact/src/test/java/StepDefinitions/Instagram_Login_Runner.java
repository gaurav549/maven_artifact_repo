package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\Features"},
		glue = {"StepDefinitions"},
		tags = {"@RegressionTest","~@SmokeTest"},
		monochrome=true,	
				plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"}

		)
public class Instagram_Login_Runner {

}

