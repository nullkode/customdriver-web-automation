package com.nullkode.automation.web.core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverController extends AbstractDriverController{

	@Override
	protected void createWebDriver() {
		
		System.setProperty("webdriver.edge.driver",
				"drivers/msedgedriver");

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
