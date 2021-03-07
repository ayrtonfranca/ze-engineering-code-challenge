package page.object.login;

import core.util.dataMass.LoginMass;
import page.object.home.HomeAction;

public class LoginActivities{

	HomeAction homeAction = new HomeAction();
	LoginAction loginAction = new LoginAction();
	
	public void loginZeDelivery(String file_json, String id_massa) {
		LoginMass loginMass = new LoginMass(file_json, id_massa);
		homeAction.clickBannerYes();
		homeAction.clickSignIn();
		loginAction.insertEmail(loginMass.getUser_email());
		loginAction.inserPassword(loginMass.getUser_password());
		loginAction.clickLoginMail();
	}
}
