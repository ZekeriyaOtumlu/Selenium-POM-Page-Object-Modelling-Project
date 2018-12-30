package com.demoaut.newtours.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	
	@FindBy (name ="passFirst0")
	private WebElement firstName;
	
	@FindBy (name ="passLast0")
	private WebElement lastName;
	
	@FindBy (name ="creditnumber")
	private WebElement ccNumber;
	
	@FindBy (name = "buyFlights")
    private WebElement submit;
	
	public BookAFlight(WebDriver driver) { // Create Constructor for related to BookTicketTests Class
		PageFactory.initElements(driver, this);
		}
	public void flightBooking(String fName, String lName, String credCardNum) {// We using Parameter for method
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		ccNumber.sendKeys(credCardNum);
		submit.click();
	}
}
