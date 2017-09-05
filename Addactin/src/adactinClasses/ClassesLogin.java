package adactinClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassesLogin {

	
	WebDriver driver;
	
	// Define username field
	@FindBy (id="username")
	WebElement username;
	
	// Define password field
	@FindBy (id="password")
	WebElement password;
	
	// Define login button
	@FindBy (id="login")
	WebElement login;
	
	public ClassesLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	
	
	// Sends keys to username field
	public void fillUsername(String user) {
		username.sendKeys(user);
	}
	
	// Sends keys to password field
	public void fillPassword(String pass) {
		password.sendKeys(pass);
	}
	
	//Click login button
	public void clickLoginButton() {
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
