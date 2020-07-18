package com.testCases;

import org.testng.annotations.Test;

import PageObjects.Login;
import utils.BaseClassOH;
import utils.Xls_Reader;

public class LoginTest extends BaseClassOH {
	Login lp;
	Xls_Reader reader;
	
	public LoginTest(){
		
	}
	String sheetName="Sheet1";
	@Test(dataProvider="getLogintTestData")
	public static void validatingLoginPage(){
		
		
	}
	
	

}
