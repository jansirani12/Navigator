package com.mcd.navigator.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Common {

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// User Name
	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_UsernameRegular']")
	public WebElement userNameTextBox;

	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_PasswordTextBoxRegular']")
	public WebElement passWordTexrBox;

	@FindBy(xpath = "//input[@id='ctl00_ContentPlaceHolder1_btnSubmit']")
	public WebElement loginButton;
	
	public void loginIntoApplication(String userName, String password) {
		userNameTextBox.click();
		userNameTextBox.sendKeys(userName);
		Reporter.log("Enter user name as '" + userName + "'<br/>");
		passWordTexrBox.click();
		passWordTexrBox.sendKeys(password);
		Reporter.log("Enter password as '" + password + "'<br/>");
		loginButton.click();
		Reporter.log("Click on login button<br/>");
	}
}
