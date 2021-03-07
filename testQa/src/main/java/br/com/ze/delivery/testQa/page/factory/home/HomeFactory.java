package br.com.ze.delivery.testQa.page.factory.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.ze.delivery.testQa.core.setup.BasePage;

public class HomeFactory extends BasePage {
	
	public HomeFactory(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "age-gate-button-yes")
	public WebElement btn_yes;
	
	@FindBy(id = "age-gate-button-no")
	public WebElement btn_no;
	
	@FindBy(id = "welcome-button-sign-in")
	public WebElement btn_sign_in; 
}
