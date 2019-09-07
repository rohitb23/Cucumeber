package CucumberCalc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)	
	@CucumberOptions(
			features = "Features1"
			,glue = {"StepDef12"}
			,dryRun = false
			,monochrome = false)

public class TestRunner1 {

}
