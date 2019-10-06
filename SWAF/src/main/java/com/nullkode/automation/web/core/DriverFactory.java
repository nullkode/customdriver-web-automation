package com.nullkode.automation.web.core;

import com.nullkode.automation.web.core.AbstractDriverController.DriverOptions;

public class DriverFactory {
	
	public static AbstractDriverController getDriverController(DriverOptions driverOpt) {
		
		AbstractDriverController driverController;
		
		switch(driverOpt) {
		
		case CHROME:
			
			driverController = new ChromeDriverController();
			break;
			
		case FIREFOX:
			
			driverController = new FirefoxDriverController();
			break;
			
		case SAFARI:
			
			driverController = new SafariDriverController();
			break;	
			
		case EDGE:
			
			driverController = new EdgeDriverController();
			break;
			
		default:
			
			driverController = new IEDriverController();
			break;
		
		} 
			
		return driverController;
		
	}

}
