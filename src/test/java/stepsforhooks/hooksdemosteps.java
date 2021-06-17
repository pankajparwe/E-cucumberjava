package stepsforhooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class hooksdemosteps {
	WebDriver driver= null;
	@Before
	public void browsersetup() {
		System.out.println("I am inside browser setup");
		System.setProperty("webdriver.chrome.driver","src/test/resources/Features/driver/chromedriver.exe" );
		driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}


	@Given("user is on login page")
	public void user_is_on_login_page() {
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
	}




}
