package com.nullkode.automation.web.core;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageWrapper {
	
	private static final int TIME = 5;
	private static final Duration TIMEOUT = Duration.ofSeconds(5);
	private static final Duration POLLING = Duration.ofSeconds(100);
	

    protected WebDriver driver;
    private WebDriverWait wait;
	
	public PageWrapper(WebDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait(driver, TIMEOUT, POLLING);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIME), this);
		
	}
	
	public boolean isElementPresent(By locator) {
		
		// TODO
		
		return false;
		
	}
	
	public void getTitle() {
		
		// TODO
		
	}
	
	public void waitUntilElementIsFound(By locator) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));	  
		
	}
	
	public void waitUntilTextIsFound(By locator, String text) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	public void waitUntilElementFadesOut(By locator) {
		
		wait.until(ExpectedConditions.not(ExpectedConditions.invisibilityOfElementLocated(locator)));
		
	}
	
	public void waitUntilTextFadesOut(By locator, String text) {
		
		wait.until(ExpectedConditions.not(ExpectedConditions.invisibilityOfElementWithText(locator, text)));
	}
	
	

}
