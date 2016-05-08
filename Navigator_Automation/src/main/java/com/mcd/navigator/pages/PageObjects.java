package com.mcd.navigator.pages;

import org.openqa.selenium.WebDriver;

public class PageObjects extends Common {

	public LoginPage getLoginPage(WebDriver driver) {
		return new LoginPage(driver);
	}

	public HomePage getHomePage(WebDriver driver) {
		return new HomePage(driver);
	}

	public FranchiseNavigator getFranchiseNavigator(WebDriver driver) {
		return new FranchiseNavigator(driver);
	}
	
	public PMONavigator getPMONavigator(WebDriver driver) {
		return new PMONavigator(driver);
	}
}
