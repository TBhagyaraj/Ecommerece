package com.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjectModel.Loginfunctionality;
import com.base.TestBase;
import com.utils.Utils;

public class Logintest extends TestBase {
	
	String Excelsheet_name="Login";
	Loginfunctionality log;
	
    @DataProvider
    public String[][] testdata() throws Throwable {
   	 return Utils.setdata(Excelsheet_name);
    }
    @BeforeMethod
    
    public void setup() {
     	 Intialization();
   	  log=new Loginfunctionality(driver);
    }
	
    
    @Test(dataProvider="testdata",dataProviderClass=Logintest.class)
    public void verifylogin(String Username,String Password) {
    	log.Forlogin(Username, Password);
    }
    
    @AfterMethod
    public void teardown() {
    	driver.close();
    }
    
    
}