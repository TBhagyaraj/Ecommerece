package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjectModel.equazfunctionality;
import com.base.TestBase;
import com.utils.Utils;

public class Equarztest extends TestBase {
	String Excelsheet_name="Login";
	equazfunctionality log;
    @DataProvider
    public String[][] testdata() throws Throwable {
   	 return Utils.setdata(Excelsheet_name);
    }
    @BeforeMethod
    
    public void setup() {
     	 Intialization();
   	  log=new equazfunctionality(driver);
    }
	
	@Test(dataProvider="testdata",dataProviderClass=Equarztest.class)
    public void verifylogin(String Username,String Password) {
    	log.Forlogin(Username, Password);
    }
}