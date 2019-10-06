package com.nullkode.automation.web.core;

import org.openqa.selenium.WebDriver;

public abstract class AbstractDriverController {

	protected WebDriver driver;

	protected abstract void createWebDriver();

	public enum DriverOptions {

		CHROME, FIREFOX, SAFARI, EDGE, IE;

	}

	public WebDriver getWebDriver() {

		if (null == driver) {

			createWebDriver();

		}

		return driver;

	}

	public void quitWebDriver() {

		if (null != driver) {

			driver.quit();
			driver = null;

		}
	}

}
