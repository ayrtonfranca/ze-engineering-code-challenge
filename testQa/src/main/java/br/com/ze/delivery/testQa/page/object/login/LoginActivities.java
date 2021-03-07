package br.com.ze.delivery.testQa.page.object.login;

import br.com.ze.delivery.testQa.page.object.home.HomeAction;

public class LoginActivities{

	HomeAction homeAction = new HomeAction();
	LoginAction loginAction = new LoginAction();
	
	public void loginZeDelivery(String file_json, String id_massa) {
		homeAction.clickBannerYes();
		homeAction.clickSignIn();
		loginAction.insertEmail(id_massa);
		loginAction.inserPassword(id_massa);
		loginAction.clickLoginMail();
	}
}
