package br.com.ze.delivery.testQa.page.object.login;

import static br.com.ze.delivery.testQa.core.setup.DriverFactory.getDriver;
import br.com.ze.delivery.testQa.core.setup.BasePage;
import br.com.ze.delivery.testQa.page.object.home.HomeAction;

public class LoginActivities extends BasePage{

	public LoginActivities() {
		super(getDriver());
	}
	
	HomeAction homeAction = new HomeAction();
	
	public void loginZeDelivery(String file_json, String id_massa) {
		homeAction.clickBannerYes();
	}
}
