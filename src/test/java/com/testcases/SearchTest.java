package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.PageObjectModel.LoginFunction;
import com.PageObjectModel.Searchfunctionality;
import com.base.TestBase;



	
	public class SearchTest extends TestBase {
	     LoginFunction log;
	     Searchfunctionality sea;
	     
	     	
         @BeforeMethod
	     public void setup() {
	    	 Intialization();
	    	 log=new LoginFunction(driver);
	    	 sea=new Searchfunctionality(driver);
	    	 log.dologin();
	     }
	     
	     @Test
	     public void Search() throws Throwable  
	     {
	     sea.search();	
	     }
	     @Test
	     public void drop() throws Throwable
	     {
	     sea.dropdown();	
	     }
	     
	     
	 }
