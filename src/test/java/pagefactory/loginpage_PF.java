package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage_PF {
	WebDriver driver;
	
	@FindBy(id="name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login")
	WebElement btn_login;
	
	
	
	public loginpage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this );
	}
	
	public void enterusername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterpassword (String password) {
		txt_password.sendKeys(password);
		
	}
	public void clickloginbutton() {
		btn_login.click();
	}

}
