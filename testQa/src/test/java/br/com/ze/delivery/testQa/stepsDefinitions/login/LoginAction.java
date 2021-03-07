package br.com.ze.delivery.testQa.stepsDefinitions.login;

import br.com.ze.delivery.testQa.page.object.login.LoginActivities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginAction {
  
	LoginActivities loginActivities = new LoginActivities();
	
	@When("^I log in Ze Delivery$")
	public void log_ze_delivery() throws Throwable {
		loginActivities.loginZeDelivery(null, null);
	}
}
