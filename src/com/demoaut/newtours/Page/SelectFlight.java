package com.demoaut.newtours.Page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	
	@FindBy (css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(9) > tbody > tr:nth-child(7) > td.frame_action_xrows > input[type=\"radio\"]")
	private WebElement departFlight;
	
	@FindBy (css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(10) > tbody > tr:nth-child(5) > td.frame_action_xrows > input[type=\"radio\"]")
   private WebElement returnFlight;
	
	@FindBy(name = "reserveFlights")
	private WebElement submit;
	
	
	public SelectFlight (WebDriver driver) { // Create Constructor for related with BookTicketTests Class
		PageFactory.initElements(driver, this); // where we initiate constructor
		
		}
	public void flightSelection() { // method for using the actions
		departFlight.click();
		returnFlight.click();
		submit.click();
		
		
	}
	
}
