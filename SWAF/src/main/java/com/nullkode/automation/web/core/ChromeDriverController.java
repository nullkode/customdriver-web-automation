package com.nullkode.automation.web.core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverController extends AbstractDriverController {

	@Override
	protected void createWebDriver() {

		System.setProperty("webdriver.chrome.driver",
				"drivers/chromedriver");

		System.setProperty("headless", "false");
		String headless = System.getProperty("headless");

		if ("true".equals(headless)) {

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
			
		} else {
			
			driver = new ChromeDriver();
		
		}

	}

}
