package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjectModel.equazfunctionality;
import com.base.TestBase;

import com.utils.Utils;

public class Equazlogin extends TestBase {
     String Excelsheet_name="Login";
     equazfunctionality loginequaz;
     @DataProvider
     public String[][] datatest() throws Throwable {
    	 return Utils.setdata(Excelsheet_name);
     }
     @BeforeMethod
     public void setup() {
    	 Intialization();
    	 loginequaz=new equazfunctionality(driver);
     }
     @Test(dataProvider="datatest",dataProviderClass=Equazlogin.class)
     public void verifylogin(String Username,String Password) {
    	 loginequaz.Forlogin(Username, Password);
     }
}
