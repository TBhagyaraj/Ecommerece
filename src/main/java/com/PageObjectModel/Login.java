package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;


public class Login extends TestBase {


	//Webelements address and initiate this by using pagefactory class 

	@FindBy (id="si-email")
	WebElement user;

	@FindBy (id="si-password")
	WebElement password;

	@FindBy (xpath="//button[text()='Sign in']")
	WebElement signin;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public Homepage dologin() {
		user.sendKeys(prop.getProperty("Username"));
		password.sendKeys(prop.getProperty("Password"));
		signin.click();
   
		return new Homepage();
	}
	
}
