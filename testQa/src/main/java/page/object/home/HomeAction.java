package page.object.home;

import static core.setup.DriverFactory.getDriver;

import page.factory.home.HomeFactory;

public class HomeAction{

	HomeFactory homeFactory = new HomeFactory(getDriver());
	
	public void clickBannerYes() {
		homeFactory.btn_yes.click();
	}
	
	public void clickBannerNo() {
		homeFactory.btn_no.click();
	}
	
	public void clickSignIn() {
		homeFactory.btn_sign_in.click();
	}
}
