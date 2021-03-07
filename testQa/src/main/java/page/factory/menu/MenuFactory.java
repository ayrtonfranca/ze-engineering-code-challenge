package page.factory.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.setup.BasePage;

public class MenuFactory extends BasePage{

	public MenuFactory(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "logout-button")
	public WebElement btn_logout;
	
	@FindBy(id = "my-orders-card")
	public WebElement btn_requests;
}