package core.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if (driver == null) {
			switch (Properties.browser) {
			case FIREFOX:
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			case CHROME:
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			}
	}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
