
package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjectModel.Registrationfunctionality;
import com.base.TestBase;

import com.utils.Utils;

public class RegistrationTest extends TestBase {
     String Excelsheet_name="Registration";
     Registrationfunctionality reg;
     
     @DataProvider
     public String[][] testdata() throws Throwable {
    	 return Utils.setdata(Excelsheet_name);
     }
     
     @BeforeMethod
     
     public void setup() {
    	 Intialization();
    	 reg=new Registrationfunctionality(driver);
     }
     
     
     @Test(dataProvider="testdata",dataProviderClass=RegistrationTest.class)
     public void verifyregistration(String Firstname,String Lastname,String Email,String phonenumber,String password,String confirmpassword) {
            reg.ForRegistration(Firstname,Lastname,Email,phonenumber,password,confirmpassword);
     }
     
     @AfterMethod
     
     public void teardown() {
    	 driver.close();
     }
     
     
   
     
  
}
