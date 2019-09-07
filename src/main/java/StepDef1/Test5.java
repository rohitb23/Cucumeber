package StepDef1;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test5 {
	@Given("^I want to write a step with two numbers$")
	public void I_want_to_write_a_step_with_two_numbers(DataTable arg1) throws Throwable {
	  List<List<String>> d = arg1.raw();
	  System.out.println((d.get(0).get(0)) + (d.get(0).get(1)));
	  System.out.println("Numbers");
	}

	@When("^these two numbers collide$")
	public void these_two_numbers_collide() throws Throwable {
	    
	}

	@Then("^I verify the results  in result$")
	public void I_verify_the_results_in_result() throws Throwable {
	   System.out.println("Result was displayed");
	}

}
