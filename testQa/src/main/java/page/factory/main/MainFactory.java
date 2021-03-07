package page.factory.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.setup.BasePage;

public class MainFactory extends BasePage{

	public MainFactory(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "header-user-badge")
	public WebElement btn_user_menu;

}