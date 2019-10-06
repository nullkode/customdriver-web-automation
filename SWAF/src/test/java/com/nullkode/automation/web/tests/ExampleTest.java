package com.nullkode.automation.web.tests;

import org.testng.annotations.Test;

import com.nullkode.automation.web.core.AbstractDriverController;
import com.nullkode.automation.web.core.DriverFactory;
import com.nullkode.automation.web.core.AbstractDriverController.DriverOptions;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;

/**
 * Test class to validate custom driver controller in different browsers.
 * @author abhijeet.batsa
 *
 */
public class ExampleTest {
	
	AbstractDriverController driverController;
	
	WebDriver driver;
	
	/**
	 * Test for Chrome browser
	 */
	@Test
	public void navigateToTwitterHomeUsingChrome() {
		
		driverController = DriverFactory.getDriverController(DriverOptions.CHROME);
		driver = driverController.getWebDriver();
		driver.get("https://twitter.com/");
		AssertJUnit.assertEquals("Twitter. It's what's happening", driver.getTitle());
	}
	
	/**
	 * Test for Firefox browser
	 */
	@Test
	public void navigateToTwitterHomeUsingFirefox() {
		
		driverController = DriverFactory.getDriverController(DriverOptions.FIREFOX);
		driver = driverController.getWebDriver();
		driver.get("https://twitter.com/");
		AssertJUnit.assertEquals("Twitter. It's what's happening.", driver.getTitle());
	}
	
	/**
	 * Test for Safari browser
	 */
	@Test
	public void navigateToTwitterHomeUsingSafari() {
		// You must enable the 'Allow Remote Automation' option in Safari's Develop menu to control Safari via WebDriver.
		driverController = DriverFactory.getDriverController(DriverOptions.SAFARI);
		driver = driverController.getWebDriver();
		driver.get("https://twitter.com/");
		AssertJUnit.assertEquals("Twitter. It's what's happening.", driver.getTitle());
	}
	
	/**
	 * Test for Edge browser
	 */
	@Test
	public void navigateToTwitterHomeUsingEdge() {
		
		driverController = DriverFactory.getDriverController(DriverOptions.EDGE);
		driver = driverController.getWebDriver();
		driver.get("https://twitter.com/");
		AssertJUnit.assertEquals("Twitter. It's what's happening", driver.getTitle());
	}
	
	/* Uncomment below code to execute the test in Windows IE browser.
	@Test
	public void navigateToTwitterHomeUsingIE() {
		
		driverController = DriverFactory.getDriverController(DriverOptions.IE);
		driver = driverController.getWebDriver();
		driver.get("https://twitter.com/");
		AssertJUnit.assertEquals("Twitter. It's what's happening", driver.getTitle());
	}
	*/

}
