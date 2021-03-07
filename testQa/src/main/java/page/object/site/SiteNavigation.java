package page.object.site;

import static core.setup.DriverFactory.getDriver;

public class SiteNavigation{
	
	public void acessZeDelivery() {
		getDriver().get("https://www.ze.delivery/");
	}
}
