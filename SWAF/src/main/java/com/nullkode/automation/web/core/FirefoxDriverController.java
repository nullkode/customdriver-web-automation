package com.nullkode.automation.web.core;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverController extends AbstractDriverController{

	@Override
	protected void createWebDriver() {
		
		System.setProperty("webdriver.gecko.driver",
				"drivers/geckodriver");
		
		System.setProperty("headless", "false");
		String headless = System.getProperty("headless");
		
		if("true".equals(headless)) {
			
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.addArguments("--headless");
			driver = new FirefoxDriver(firefoxOptions);
			
		}else {
			
			driver = new FirefoxDriver();
			
		}
		
		
		
		
	}

}
