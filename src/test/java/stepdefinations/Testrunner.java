package stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/driver/logindemo.feature", 



glue= {"stepdefinations"},
monochrome = true,
plugin = {"pretty",
		"junit:target/JUnitReports/report.xml",// to generate reports
        "html:target/html/htmlreport.html",
        "json:target/json/file.json"}

 
)

		 
		  
		
public class Testrunner {

}
