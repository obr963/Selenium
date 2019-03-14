package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\OkantiBhagawanBhagaw\\eclipse-workspace\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver aa = new FirefoxDriver();
		
		aa.get("http://www.google.com");
		

	}

}
