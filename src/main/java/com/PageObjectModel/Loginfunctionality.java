package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Loginfunctionality extends TestBase {
	
	@FindBy(name="user_id")
	WebElement user;
	
	@FindBy(name="password")
	WebElement passward;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement submit;
	
	public Loginfunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Forlogin(String username,String password) {
		user.sendKeys(username);
		passward.sendKeys(password);
		submit.click();
	
	}

		}
