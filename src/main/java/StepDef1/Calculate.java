package StepDef1;



import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Calculate {

	
	@Given("^(\\d+) and (\\d+) are provided$")
	public void and_are_provided(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   System.out.println(arg1 % arg2);
	}

	@When("^modulus is calculated$")
	public void modulus_is_calculated() throws Throwable {
		System.out.println("Odd or Even");
	   
	}

	@Then("^results are provided$")
	public void results_are_provided() throws Throwable {
		System.out.println("Results Checked");
	    
	}
	
	
	@Given("^Two numbers are provided$")
	public void Two_numbers_are_provided(DataTable arg1) throws Throwable {
	   List<List<String>> data = arg1.raw();
	   System.out.println(data.get(0).get(0) + data.get(0).get(1));
	   System.out.println(data.get(1));
	   
	}

	@When("^mod is checked$")
	public void mod_is_checked() throws Throwable {
	   
	}

	@Then("^Results are out$")
	public void Results_are_out() throws Throwable {
	   
	}
	
	

	
	
	
}
