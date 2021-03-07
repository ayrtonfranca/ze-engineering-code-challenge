package br.com.ze.delivery.testQa.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import core.setup.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature/",
		tags = "@login",
		glue = "")
public class CucumberRunner {

	@AfterClass
	public static void finalizarRunner() {
		DriverFactory.killDriver();
	}
}
