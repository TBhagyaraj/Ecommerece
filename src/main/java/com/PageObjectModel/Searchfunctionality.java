package com.PageObjectModel;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;

public class Searchfunctionality extends TestBase {
     
	@FindBy(xpath="//input[@placeholder='Search here ...']")
	WebElement Search;
	
	@FindBy(xpath="//button[@style=\"border-radius: 0px 7px 7px 0px; left: unset; right: 0;top:0\"]")
	WebElement Button;

    @FindBy(xpath = "//div [@class=\" col-lg-3 col-md-4 col-sm-4 col-6  mb-2 p-2\"]")
    List<WebElement> Products;
    
    
    public Searchfunctionality(WebDriver driver) {
    	PageFactory.initElements(driver, this);
	}

    
	public void search() throws Throwable
	{
		Search.sendKeys(prop.getProperty("SearchText"));
	
		String tbr=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/", tbr);
	}
	
	public void Searchbutton()
	{
		Button.click();
	}
	
	public void dropdown() throws Throwable
	{
		Search.sendKeys(prop.getProperty("SearchText"));
		
		for(WebElement Pro:Products) {
			Thread.sleep(3000);
			if (Pro.getText().equals("Oppo A77s (Sunset Orange, 8GB RAM, 128 Storage)"))
			{
				Pro.click();
				String tbr1=driver.getCurrentUrl();
				Assert.assertEquals("https://e-quarz.com/product/oppo-a77s-sunset-orange-8gb-ram-128-storage-okg73a", tbr1);
                
            }
	 }
	 }
	
	}