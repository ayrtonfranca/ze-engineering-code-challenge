package br.com.ze.delivery.testQa.page.object.home;

import static br.com.ze.delivery.testQa.core.setup.DriverFactory.getDriver;

import br.com.ze.delivery.testQa.page.factory.home.HomeFactory;

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
