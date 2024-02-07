/*package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Registration extends TestBase {
	
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
	WebElement Passward;
	
	@FindBy (name="con_password")
	WebElement ConfirmPassward;
	
	
	@FindBy (id="inputCheckd")
	WebElement Checkbox;
	
	@FindBy (id="sign-up")
	WebElement SignupButton;
	
	
	
	public Registration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public SignInpage dologin() {
		Firstname.sendKeys(prop.getProperty("firstname"));
		Lastname.sendKeys(prop.getProperty("lastname"));
		Email.sendKeys(prop.getProperty("MailID"));
		Phonenumber.sendKeys(prop.getProperty("mobilenumber"));
		Passward.sendKeys(prop.getProperty("Password"));
		ConfirmPassward.sendKeys(prop.getProperty("Confirmpassword"));
		SignupButton.click();
   
		return new SignInpage();
	}
	

}
*/