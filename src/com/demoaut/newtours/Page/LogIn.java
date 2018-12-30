package com.demoaut.newtours.Page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	//private WebElement user = driver.findElement(By. name("userName"); >>>> We used this one for a regular (NOT POM)
	
	@FindBy (name ="userName")
	private WebElement user;
	
	@FindBy (name = "password")
	private WebElement passw;
	
	@FindBy (name = "login")
	private WebElement submit;
	
	public LogIn(WebDriver driver) {// We create Constructor and related with BookTicketTests Class
		PageFactory.initElements(driver, this); // driver >> where we initiate Constructor
	}
	
	public void applicationLogin() {
		user.sendKeys("mercury");
		passw.sendKeys("mercury");
		submit.click();
	}
	
	
	
	

}
