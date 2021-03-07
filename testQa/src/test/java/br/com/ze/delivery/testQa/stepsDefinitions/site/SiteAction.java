package br.com.ze.delivery.testQa.stepsDefinitions.site;

import io.cucumber.java.en.Given;
import page.object.site.SiteNavigation;

public class SiteAction {

	SiteNavigation siteNavigation = new SiteNavigation();
	
	@Given("^I'm at Ze Delivery$")
	public void given_ze_delivery() throws Throwable {
		siteNavigation.acessZeDelivery();
	}
}