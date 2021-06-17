package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlesearchsteps {
	
	WebDriver driver =null;
	
	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
	System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/cucumberjava/src/test/resources/Features/driver/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.navigate().to("https://www.google.com/");
	 
	
	
	}

	@When("user enter the text in the search box")
	public void user_enter_the_text_in_the_search_box() throws InterruptedException {
		
		 driver.findElement(By.name("q")).sendKeys("cucumber java");
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  
		 Thread.sleep(2000);

	}
	@Then("user is able to see search results")
	public void user_is_able_to_see_search_results() {
		System.out.println("showing search results");
		driver.getPageSource().contains("Cucumber with java");
		driver.close();


	}

}
