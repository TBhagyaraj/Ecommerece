package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registrationfunctionality {
	
	
	@FindBy(xpath = "//a[@class='btn btn-outline-primary']")
	WebElement Signup;

	@FindBy(name = "f_name")
	WebElement Firstname;

	@FindBy(name = "l_name")
	WebElement Lastname;

	@FindBy(name = "email")
	WebElement Email;

	@FindBy(name = "phone")
	WebElement Phonenumber;
	
	
	@FindBy (id="si-password")
	WebElement Password;
	
	@FindBy (name="con_password")
	WebElement ConfirmPassword;
	
	
	@FindBy (id="inputCheckd")
	WebElement Checkbox;
	
	@FindBy (id="sign-up")
	WebElement SignupButton;
	
	
	
	public Registrationfunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void ForRegistration(String fname, String lname, String mail, String phnumber, String pass, String conpass) {
		
	        Signup.click();
			Firstname.sendKeys(fname);
			Lastname.sendKeys(lname);
			Email.sendKeys(mail);
			Phonenumber.sendKeys(phnumber);
			Password.sendKeys(pass);
			ConfirmPassword.sendKeys(conpass);
			Checkbox.click();
			SignupButton.click();
	   
		
		}


	
}
