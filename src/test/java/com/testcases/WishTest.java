package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjectModel.LoginFunction;
import com.PageObjectModel.WishlistFunctionality;
import com.base.TestBase;

public class WishTest extends TestBase {

	LoginFunction log;
    WishlistFunctionality wish;
    	
    @BeforeMethod
    public void setup() {
   	 Intialization();
   	 log=new LoginFunction(driver);
   	 wish=new WishlistFunctionality(driver);
   	 log.dologin();
    }
    
    @Test(priority=1)
    public void addoppocase() 
    {
     wish.OPPO();	
    }
    
    @Test(priority=2)
    public void homepage()
    {
     wish.homepage();
    }
    
    @Test(priority=3)
    public void addAvrofurniture() 
    {
    wish.Avro();
    }
    
    @Test(priority=4)
    public void Realme()
    {
    	wish.realme();
    }
    
    @Test(priority=5)
    public void RemoveAvro()  
    {
    wish.Remove();	
    }
    
    @Test(priority=6)
    
    public void Buying()
    {
    	wish.Buy();
    }
    
    @Test
    public void Count()
    {
    	wish.count();
    }
    
    
    @AfterMethod
    public void teardown()
    {
    	driver.close();
    }
}

