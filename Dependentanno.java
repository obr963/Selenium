package testNG;

import org.testng.annotations.Test;

public class Dependentanno {
	
	@Test
	public void openingbrowser() {
	System.out.println("TestNg");
	}
	@Test(dependsOnMethods= {"openingbrowser"})
	public void flightFirst() {
		System.out.println("test pass");
	}
	
	@Test(enabled=false)
	public void payment() {
	System.out.println("Issue testcase");
System.out.println("Issue testcase");
	}

}
