package com.addcustomer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomer {
	
	@FindBy(id="done")
	public static WebElement check;
	@FindBy(id="fname")
	public static WebElement firstname;
	@FindBy(id="lname")
	public static WebElement lastname;
	@FindBy(id="email")
	public static WebElement Email;
	@FindBy(id="message")
	public static WebElement Address;
	@FindBy(id="telephoneno")
	public static WebElement PhoneNumber;
	@FindBy(name="submit")
	public static WebElement submit;
	
	
	

}
