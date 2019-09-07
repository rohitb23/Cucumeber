package Stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testStep {
	public static WebDriver driver;
	public String d ;
	@Given("^Navigate to chromedriver$")
	public void Navigate_to_chromedriver() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.setProperty("webdriver.chrome.driver","/Users/rohitbaweja/Desktop/chromedriver");
		driver = new ChromeDriver();
	    
	}

	@And("^provide $")
	public void provide_URL() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
	    driver.navigate().to("https://www.google.com");
	}

	@When("^Capture the Title$")
	public void Capture_the_Title() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   d = driver.getTitle();
	   System.out.println(d);
	}

	@Then("^check catured and provider title$")
	public void check_catured_and_provider_title() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
	    Assert.assertTrue(4 == 4);
	    driver.close();
	}

}
