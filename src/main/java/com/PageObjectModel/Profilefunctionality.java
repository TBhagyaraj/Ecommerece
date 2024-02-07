package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.utils.Utils;

public class Profilefunctionality extends TestBase {
	
	Actions ac=new Actions(driver);
	Utils us=new Utils();
	
	@FindBy(xpath="//div[@class=\"navbar-tool-text\"]")
	WebElement dashboard;
	
	@FindBy(xpath="//a[text()=\" My profile\"]")
	WebElement profile;
	
	@FindBy(xpath="//input[@name=\"f_name\"]")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@name=\"l_name\"]")
	WebElement Lastname;
	
	@FindBy(xpath="(//input[@type=\"email\"])[1]")
	WebElement Email;
	
	@FindBy(xpath="//input[@type=\"number\"]")
	WebElement phonenumber;
	
	@FindBy(xpath="//input[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@id=\"confirm_password\"]")
	WebElement Confirmpassword;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[3]")
	WebElement update;
	
	public Profilefunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

    public void ProfileEdit(String fname, String lname, String phnumber, String pass, String conpass, String conpass1) throws Throwable {
    	
    	ac.moveToElement(dashboard).build().perform();
    	Thread.sleep(2000);
    	
        profile.click();
        
        Firstname.clear();
        Firstname.sendKeys(fname);
        
        Lastname.clear();
        Lastname.sendKeys(lname);
        
        //Email.clear();
        //Email.sendKeys(mail);
        
        phonenumber.clear();
        phonenumber.sendKeys(phnumber);
        
        password.clear();
        password.sendKeys(pass);
        
        Confirmpassword.clear();
        Confirmpassword.sendKeys(conpass);
    }
    public void Update() 
    {  
        update.click();  
    }
}
