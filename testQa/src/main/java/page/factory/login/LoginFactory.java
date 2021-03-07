package page.factory.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.setup.BasePage;

public class LoginFactory extends BasePage{
	

	public LoginFactory(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "login-mail-input-email")
	public WebElement field_email;
	
	@FindBy(id = "login-mail-input-password")
	public WebElement field_password;
	
	@FindBy(id = "login-facebook-button-sign-in")
	public WebElement btn_facebook;
	
	@FindBy(id = "login-mail-button-sign-in")
	public WebElement btn_mail;
	
	@FindBy(id = "login-email-link-forgot-password")
	public WebElement link_forgot;
	
	@FindBy(id = "create-account-link")
	public WebElement link_account;
}