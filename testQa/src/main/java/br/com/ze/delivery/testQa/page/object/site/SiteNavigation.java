package br.com.ze.delivery.testQa.page.object.site;

import static br.com.ze.delivery.testQa.core.setup.DriverFactory.getDriver;

public class SiteNavigation{
	
	public void acessZeDelivery() {
		getDriver().get("https://www.ze.delivery/");
	}
}
