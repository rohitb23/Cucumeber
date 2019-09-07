package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Feature/testBrand.feature"},
		glue = "StepDef1",
		dryRun = false)
public class TestPRac {

}
