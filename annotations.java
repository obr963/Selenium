package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class annotations {

	@BeforeMethod
	public void before() {
		System.out.println("Before test");
	}
	@Test
	@Parameters("userid")
	public void openingbrowser(String userid) {
	System.out.println("TestNg");
	System.out.println(userid);
	}
	@Test
	public void flightFirst() {
		System.out.println("test pass");
	}
	@AfterTest
	public void closebrowser() {
		System.out.println("closing the browser");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After each method");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("My first method is before suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("Me LAst method is after suite");
	}
			
}
