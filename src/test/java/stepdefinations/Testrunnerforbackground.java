package stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/BackgroundDemo.feature", 



glue= {"stepsforbackground"},
monochrome = true,
plugin = {"pretty",
		"junit:target/JUnitReports/report.xml",// to generate reports
        "html:target/html/htmlreport.html",
        "json:target/json/file.json",  
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
dryRun= false

 
)


public class Testrunnerforbackground {

}
