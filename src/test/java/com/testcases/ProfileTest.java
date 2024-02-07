package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.PageObjectModel.LoginFunction;
import com.PageObjectModel.Profilefunctionality;
import com.base.TestBase;
import com.utils.Utils;

public class ProfileTest extends TestBase {
	
	LoginFunction log;
	Profilefunctionality prof;
	Utils ut;
	String sheetname= "Registration";
	//public ProfileTest() {
		//super();
	//}
	@DataProvider
     public String[][] testdata() throws Throwable {
	 return Utils.setdata(sheetname);
}

     @BeforeMethod
     public void setup() {
	 Intialization();
	 log=new LoginFunction(driver);
	 prof=new Profilefunctionality(driver);
	 log.dologin();
}

@Test(priority=1,dataProvider="testdata",dataProviderClass=ProfileTest.class)
public void Profile(String fname1, String lname1, String mail1, String phnumber1, String pass1, String conpass1) throws Throwable 
{
 prof.ProfileEdit(fname1,  lname1,  mail1,  phnumber1,  pass1, conpass1);
 
 prof.Update();
}

}
