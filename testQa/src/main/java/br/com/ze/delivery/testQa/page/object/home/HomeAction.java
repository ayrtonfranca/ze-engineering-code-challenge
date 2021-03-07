package br.com.ze.delivery.testQa.page.object.home;

import static br.com.ze.delivery.testQa.core.setup.DriverFactory.getDriver;

import br.com.ze.delivery.testQa.core.setup.BasePage;
import br.com.ze.delivery.testQa.page.factory.home.HomeFactory;

public class HomeAction extends BasePage{

	public HomeAction() {
		super(getDriver());
	}

	HomeFactory homeFactory = new HomeFactory(getDriver());
	
	public void clickBannerYes() {
		homeFactory.btn_yes.click();
	}
	
	public void clickBannerNo() {
		homeFactory.btn_no.click();
	}
}
