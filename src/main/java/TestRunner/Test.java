package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Feature/test.feature","Feature/feature2.feature" , "Feature/Example.feature"},
glue = {"StepDef1"},
dryRun = false,
monochrome = false,
strict = false,
tags = {"@Red,@Smoke"},
format = "html:/Users/rohitbaweja/Desktop/commandlinebasics/testin23")
public class Test {

}
