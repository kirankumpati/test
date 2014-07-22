package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import base.PageBase;
import dashboard.RequestAccessForOthers;

public class RequestTest {
	private WebDriver driver;
	RequestAccessForOthers requestAccessForOthers; 

	String identity = "Adam.Kennedy";

	public RequestTest() {
		//requestAccess();
	}

	public RequestTest(WebDriver driver) {

		this.driver = driver;
		requestAccessForOthers = new RequestAccessForOthers(driver);
		requestAccess();
	}

	@Test
	public void requestAccess() {
		requestAccessForOthers.findIdentity(identity);
		//requestAccessForOthers.forMethod("user");

	}

}
