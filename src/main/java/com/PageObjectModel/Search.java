/*package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Search extends TestBase{

	@FindBy(name="name")
	WebElement search;
	
	//@FindBy(name="password")
	//WebElement passward;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement Submit;
	
	public Search(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Forlogin() {
		search.sendKeys(prop.getProperty("Productname"));
		//passward.sendKeys(Password);
		Submit.click();
		
		return ;

}
}*/