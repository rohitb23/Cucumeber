package Stepdef;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Checkout {
int price = 50;
int Count = 5;
	
	
	@Given("^I am going (\\d+) a banana @ (\\d+) c$")
	public void I_am_going_a_banana_c(int arg1, int price) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("Welcome to Banana Hub");
	    int BananaPrice = price ;
	}

	@When("^I checkout (\\d+) at (\\d+)$")
	public void I_checkout_at(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    Checkout checkout = new Checkout();
	    checkout.add(Count, price);
	}

	@Then("^I should be charged (\\d+)\\*(\\d+)$")
	public void I_should_be_charged_(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("Please pay 200C");
	}


	public void add (int Count , int Price){
		System.out.println(Count*Price);
	
}
}
