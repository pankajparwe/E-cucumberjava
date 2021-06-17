package stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/HooksDemo", 


glue= {"stepsforhooks"},
monochrome = true,
plugin = {"pretty",
		"junit:target/JUnitReports/report.xml",// to generate reports
        "html:target/html/htmlreport.html",
        "json:target/json/file.json"}

 
)


public class Testrunnerhooks {

}
