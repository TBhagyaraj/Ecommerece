package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class equazfunctionality  {
	
	@FindBy(name="user_id")
	WebElement user;
	
	@FindBy(name="password")
	WebElement passward;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement submit;
	
	public equazfunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Forlogin(String Username,String Password) {
		user.sendKeys(Username);
		passward.sendKeys(Password);
		submit.click();
	}
}