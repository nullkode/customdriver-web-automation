package com.nullkode.automation.web.core;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SafariDriverController extends AbstractDriverController{

	@Override
	protected void createWebDriver() {
		
		SafariOptions safariOptions = new SafariOptions();
		this.driver = new SafariDriver(safariOptions);
		
	}

}
