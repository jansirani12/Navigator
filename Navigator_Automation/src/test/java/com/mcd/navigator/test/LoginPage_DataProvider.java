package com.mcd.navigator.test;

import org.testng.annotations.DataProvider;

import com.mcd.navigator.excelutils.LoginPageData;

public class LoginPage_DataProvider {
	
	@DataProvider(name = "TC_01")
	public static Object[][] LoinTestData() {
		LoginPageData loginPageTestData = new LoginPageData("TC_01");
		return new Object[][] {{loginPageTestData}};
		
	}
	
}
