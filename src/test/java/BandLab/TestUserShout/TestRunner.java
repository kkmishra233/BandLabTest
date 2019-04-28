package BandLab.TestUserShout;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
@SuppressWarnings("unused")
@RunWith(Cucumber.class)
@CucumberOptions
(
		monochrome = true, plugin = { "pretty", "html:target/Cucumber/report.html",
		"json:target/cucumber.json" }, tags = { "~@ignore" }, features = { "src/test/Resources/" }
		)
public class TestRunner {

}
