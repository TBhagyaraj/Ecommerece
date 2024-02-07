package com.PageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.TestBase;
import com.utils.Utils;

public class Addressfunctionality extends TestBase{

	Actions ac=new Actions(driver);
	Utils us=new Utils();
	
	@FindBy(xpath="//div[@class=\"navbar-tool-text\"]")
	WebElement Dashboard;
	
	@FindBy(xpath="//a[text()=\" My profile\"]")
	WebElement Profile;
   
	@FindBy(xpath="//a[@href=\"https://e-quarz.com/account-address\"]")
	WebElement AddressButton;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[4]")
	WebElement Addaddress;
	
	@FindBy(xpath="//label[@for=\"a25\"]")
	WebElement Permanentaddress;
	
	@FindBy(xpath="//label[text()=\"Shipping\"]")
	WebElement Shipping;
	
	@FindBy(xpath="(//input[@type=\"text\"])[3]")
	WebElement Personname;
	
	@FindBy(xpath="(//input[@type=\"text\"])[4]")
	WebElement Number;
	
	@FindBy(xpath="(//input[@type=\"text\"])[5]")
	WebElement City; 
	
	@FindBy(xpath="(//input[@type=\"text\"])[6]")
	WebElement Zipcode;
	
	@FindBy(xpath="//select[@name=\"country\"]")
	WebElement Country;
	
	@FindBy(xpath="//textarea[@id=\"address\"]")
	WebElement Address;
	
	@FindBy(xpath="//input[@title=\"Search your location here\"]")
	WebElement Locationsearch;

	@FindBy(xpath="//button[text()=\"Add Informations  \"]")
	WebElement Addinformation;
	
	@FindBy(xpath="//i[@class=\"fa fa-edit fa-lg\"]")
	WebElement Edit;
	
	@FindBy(xpath="//label[text()='Home']")
	WebElement Home;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[3]")
	WebElement Update;
	
	@FindBy(xpath="//i[@class=\"fa fa-trash fa-lg\"]")
	WebElement Delete;
	
	public Addressfunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void Addaddress(String personname,String phonenumber,String city,String zipcode,String address,String location) throws Throwable {
		
		ac.moveToElement(Dashboard).build().perform();
		Thread.sleep(2000);
		
	    Profile.click();
	    AddressButton.click();
	    Addaddress.click();
	    Permanentaddress.click();
	    Shipping.click();
	    Personname.sendKeys(personname);
	    Number.sendKeys(phonenumber);
	    City.sendKeys(city);
	    Zipcode.sendKeys(zipcode);
	    
	    Select select=new Select(Country);
	    select.selectByVisibleText("India");
	    
	    Address.sendKeys(address);
	    Locationsearch.sendKeys(location);
	    
	    Thread.sleep(3000);
	}
	public void AddInfo() {
		
	    Addinformation.click();
	    
	}
	
public void EditAddress(String personname,String phonenumber,String city,String zipcode,String address,String location) throws Throwable {
		
		ac.moveToElement(Dashboard).build().perform();
		Thread.sleep(2000);
		
	    Profile.click();
	    AddressButton.click();
	    Edit.click();
	    Home.click();
	    Shipping.click();
	    Personname.clear();
	    Personname.sendKeys(personname);
	    Number.clear();
	    Number.sendKeys(phonenumber);
	    City.clear();
	    City.sendKeys(city);
	    Zipcode.clear();
	    Zipcode.sendKeys(zipcode);
	    
	    Select select=new Select(Country);
	    select.selectByVisibleText("India");
	    
	    Address.clear();
	    Address.sendKeys(address);
	    Locationsearch.sendKeys(location);
	    
	    Thread.sleep(3000);
	}
	public void update() {
		
	   Update.click();
	    
	}
	
	
	public void delete() throws Throwable {
		
		ac.moveToElement(Dashboard).build().perform();
		Thread.sleep(2000);
		
	    Profile.click();
	    AddressButton.click();
		Delete.click();
		driver.switchTo().alert().accept();
	}

		
}	