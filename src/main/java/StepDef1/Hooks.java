package StepDef1;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	
@Before("@Smoke")
public void tearUP(){
	System.out.println("B4 Hook");
}

@After("@Smoke")
public void tearDown(){
	System.out.println("A4Hook");
}

@Before("@Red")
public void tearit(){
	System.out.println("br Red Tears");
}

@After("@Red")
public void apart(){
	System.out.println("Tearing apart");
}
}

