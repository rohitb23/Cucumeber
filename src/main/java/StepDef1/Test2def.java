package StepDef1;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ch.qos.logback.core.net.SyslogOutputStream;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test2def {
	WebDriver driver;
	@Given("^you have a tite$")
	public void you_have_a_tite() throws Throwable {
	 System.setProperty("webdriver.chrome.driver","/Users/rohitbaweja/Desktop/chromedriver");
	 driver = new ChromeDriver();
	 driver.navigate().to("https://www.google.com");
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.quit();
	}

	@When("^you go to search screen$")
	public void you_go_to_search_screen() throws Throwable {
	   // driver.findElement(By.name("q")).sendKeys("Ram Ram");
		System.out.println("Currently giving static : " + (4*4));
		
	}

	@Then("^your results are populated$")
	public void your_results_are_populated() throws Throwable {
	   // List<WebElement> ld = driver.findElements(By.tagName("a"));
	 System.out.println(java.time.LocalTime.now());
	    
	}

}
