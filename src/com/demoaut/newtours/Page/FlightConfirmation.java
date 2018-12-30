package com.demoaut.newtours.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightConfirmation {
	
	@FindBy (css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)")
    public WebElement successMessage; // We used public instead of Private because we want to reach it from everywhere.
	
	public FlightConfirmation(WebDriver driver) {// Constructor
		PageFactory.initElements(driver, this);
	}
	
	// We DO NOT Need to Method, Because we have no any action here.
}
