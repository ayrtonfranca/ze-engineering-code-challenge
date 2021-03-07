package br.com.ze.delivery.testQa.stepsDefinitions.site;

import br.com.ze.delivery.testQa.page.object.site.SiteNavigation;
import io.cucumber.java.en.Given;

public class SiteAction {

	SiteNavigation siteNavigation = new SiteNavigation();
	
	@Given("^I'm at Ze Delivery$")
	public void given_ze_delivery() throws Throwable {
		siteNavigation.acessZeDelivery();
	}
}