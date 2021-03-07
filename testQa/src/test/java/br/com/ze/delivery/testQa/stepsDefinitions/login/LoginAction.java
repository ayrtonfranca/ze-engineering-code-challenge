package br.com.ze.delivery.testQa.stepsDefinitions.login;

import io.cucumber.java.en.When;
import page.object.login.LoginActivities;

public class LoginAction {
  
	LoginActivities loginActivities = new LoginActivities();
	
	@When("^I log in Ze Delivery$")
	public void log_ze_delivery() throws Throwable {
		loginActivities.loginZeDelivery("loginData", "login_valid");
	}
}