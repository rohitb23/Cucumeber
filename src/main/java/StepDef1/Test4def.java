package StepDef1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test4def {

	

	@When("^we multiply them$")
	public void we_multiply_them() throws Throwable {
	 System.out.println("We will give u the results soon"); 
	}

	@Then("^Results of \"(.*)\" and \"(.*)\" is displayed$")
	
	@Given("^two numbers  (\\d+)  and (\\d+)  are given$")
	public void two_numbers_and_are_given(int arg1, int arg2) throws Throwable {
		 System.out.println("Two numbers :" + arg1 + " " + arg2);
	}

	@Then("^Results of (\\d+) and (\\d+) is displayed$")
	public void Results_of_and_is_displayed(int arg1, int arg2) throws Throwable {
		System.out.println(arg1*arg2);
	}
}
