package Stepdef;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;


public class checking {
	
	int bananaPrice = 0;
	Checkout CheckOut;

	@Given("^the price of the \"([^\"]*)\" is (\\d+) c$")
	public void the_price_of_the_is_c(String name, int price) throws Throwable {
	    bananaPrice = price ;
	}


	@When("^I checkout (\\d+) \"([^\"]*)\"$")
	public void I_checkout(int itemCount, String itemName) throws Throwable {
	   CheckOut = new Checkout();
	   CheckOut.add(itemCount,bananaPrice);
	}

	@Then("^the total price should be (\\d+)c$")
	public void the_total_price_should_be_c(int total) throws Throwable {
	  boolean d = (total == CheckOut.total());
	  }
	 
	}	
	
	
	
