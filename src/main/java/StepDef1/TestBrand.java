package StepDef1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestBrand {

	@Given("^Name Entered$")
	public void Name_Entered() throws Throwable {
		System.out.println("Rohit Baweja");
	    
	}

	@When("^Name asked$")
	public void Name_asked() throws Throwable {
		System.out.println("Name asked");
	    
	}

	@Then("^name provided$")
	public void name_provided() throws Throwable {
		System.out.println("Provide it");
	   
	}
	
	
	
	
	
	@Given("^I have a sum method$")
	public void I_have_a_sum_method() throws Throwable {
	    System.out.println("Values to Print");
	}

	@When("^Values are added to Varargs$")
	public void Values_are_added_to_Varargs() throws Throwable {
	    System.out.println(java.time.LocalTime.now());
	}

	@Then("^Result comes as addition$")
	public void Result_comes_as_addition() throws Throwable {
	   System.out.println(true);
	}

	@Given("^a array (\\d+)d is set up$")
	public void a_array_d_is_set_up(int d) throws Throwable {
	    
		int[][]e = new int[d][d];
		
	}

	@When("^values to be loaded$")
	public void values_to_be_loaded() throws Throwable {
	   System.out.println(2+3+4);
		
		
	}

	@Then("^Values to b displayed$")
	public void Values_to_b_displayed() throws Throwable {
	    System.out.println("Magic");
	}
}
