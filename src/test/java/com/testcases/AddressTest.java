package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjectModel.Addressfunctionality;
import com.PageObjectModel.LoginFunction;
import com.base.TestBase;
import com.utils.Utils;

public class AddressTest extends TestBase {
	
	LoginFunction log;
	Addressfunctionality add;
	Utils ut;
	String sheetname= "Address";
	String sheetname1= "EditAddress";

	public AddressTest() {
		super();
	}
	@DataProvider
     public String[][] testdata() throws Throwable {
	 return Utils.setdata(sheetname);
     }
	
	@DataProvider
     public String[][] testdata1() throws Throwable {
	 return Utils.setdata(sheetname1);
    }
	
     @BeforeMethod
     public void setup() {
	 Intialization();
	 log=new LoginFunction(driver);
	 add=new Addressfunctionality(driver);
	 log.dologin();
     }

     @Test(priority=1,dataProvider="testdata",dataProviderClass=AddressTest.class)
     public void Address(String personname1 , String phonenumber1 , String city1 , String zipcode1 , String address1 , String location1) throws Throwable 
     {
         add.Addaddress(personname1, phonenumber1, city1, zipcode1,  address1, location1);

         add.AddInfo();
     }
     
     @Test(priority=1,dataProvider="testdata1",dataProviderClass=AddressTest.class)
     public void EditAddress(String personname1 , String phonenumber1 , String city1 , String zipcode1 , String address1 , String location1) throws Throwable 
     {
         add.EditAddress(personname1, phonenumber1, city1, zipcode1, address1, location1);

         add.update();
     }

     
     @Test(priority=2)
     
     public void delete() throws Throwable  {
    	 
    	 add.delete();
     }

      @AfterMethod
      public void teardown()
      {
      	driver.close();
      }
     
}


