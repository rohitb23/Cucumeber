package CucumberCalc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToCalc {

	public static void main (String[] args){
		
		System.setProperty("webdriver.chrome.driver","/Users/rohitbaweja/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		System.out.println("Welcome");
		String d = driver.getTitle();
		System.out.println(d);
		driver.close();
		
		
	}
	
}
