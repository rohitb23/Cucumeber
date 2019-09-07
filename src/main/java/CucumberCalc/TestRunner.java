package CucumberCalc;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/*
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue = {"Stepdef"}
		,dryRun = false
		,monochrome = true		)
*/


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Feature/Checkout.feature"}
		,glue = {"Stepdef"}
		,dryRun = false
		)
		
		
		
	



public class TestRunner {

}
