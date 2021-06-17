package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.Homepage_PF;
import pagefactory.loginpage_PF;

public class logindemosteps_PF {

	WebDriver driver =null;
	loginpage_PF login;
	Homepage_PF home;

	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("I am inside logindemosteps_PF.class");
		System.setProperty("webdriver.chrome.driver", "C:/Users/hp/eclipse-workspace/cucumberjava/src/test/resources/Features/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.navigate().to("https://www.google.com/");


	}

	@And("User is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^use enters (.*) and (.*)$")
	public void use_enters_username_and_password(String username, String password) {
		login= new loginpage_PF(driver);
		login.enterusername(username);
		login.enterpassword(password);
		login.clickloginbutton();



		//          driver.findElement(By.id("name")).sendKeys(username);
		//          driver.findElement(By.id("password")).sendKeys(password);
		//          driver.findElement(By.id("login")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		home= new Homepage_PF(driver);
		home.checklogoutbutton();
		//		driver.findElement(By.id("logout")).isDisplayed();
		driver.close();
		driver.quit();
	}

}
