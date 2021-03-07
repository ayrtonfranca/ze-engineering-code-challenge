package br.com.ze.delivery.testQa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/feature/",
		tags = "@login",
		glue = "")
public class CucumberRunner {

}
