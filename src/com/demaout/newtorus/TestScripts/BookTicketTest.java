package com.demaout.newtorus.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Page.BookAFlight;
import com.demoaut.newtours.Page.FlightConfirmation;
import com.demoaut.newtours.Page.FlightFinder;
import com.demoaut.newtours.Page.LogIn;
import com.demoaut.newtours.Page.SelectFlight;

public class BookTicketTest {
	
   WebDriver driver;
   
   @BeforeTest
   public void openBrowser() {
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.get("http://newtours.demoaut.com");
}
   @Test 
   public void ticketBookingTest() {
	   LogIn lg = new LogIn(driver); // if we Execute it like that, ERROR will Exist, Because now we have 2 objects( driver and lg). We need to Create Constructor 
       lg.applicationLogin(); // we called method in LogIn Class
       
       FlightFinder ff = new FlightFinder(driver); // if we Execute it like that, ERROR will Exist, Because now we have 2 objects( driver and ff). We need to Create Constructor 
       ff.findFlight(); // we called method in FlightFinder
       
       SelectFlight sf = new SelectFlight(driver); // if we Execute it like that, ERROR will Exist, Because now we have 2 objects( driver and sf). We need to Create Constructor 
       sf.flightSelection(); // we called method in SelectFlight
       
       BookAFlight bf = new BookAFlight(driver); // if we Execute it like that, ERROR will Exist, Because now we have 2 objects( driver and bf). We need to Create Constructor
       bf.flightBooking("Zack", "Otumlu", "34562819280"); // We called method in BookAFlight class and enter the values for Parameters method
   
       FlightConfirmation fc = new FlightConfirmation(driver); // if we Execute it like that, ERROR will Exist, Because now we have 2 objects( driver and fc). We need to Create Constructor
       String expectedMessage = "Your itinerary has been booked!";
       String actualMessage = fc.successMessage.getText();
       Assert.assertEquals(actualMessage, expectedMessage);
       
   
   }
   
   @AfterTest
   public void closeBrowser() {
	   driver.close();
   }

}
