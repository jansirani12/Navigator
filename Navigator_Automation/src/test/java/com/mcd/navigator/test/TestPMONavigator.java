package com.mcd.navigator.test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mcd.common.annotations.TestInfo;
import com.mcd.navigator.pages.PageObjects;

public class TestPMONavigator extends PageObjects {

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "browser", "url" })
	public void setUp(String browser, String url) {
		driver = getWebDriver(browser);
		wait = new WebDriverWait(driver, 20);
		navigate(url);
	}

	@Test(testName = "Verify all the Elements are present on PMO Navigator Landing Page", description = "Logininto PMO Navigator Home Page", priority = 0)
	@TestInfo(testCaseID = "TC_01", testCaseDescription = "Logininto PMO Navigator Home Page")
	public void verifyPMONavigatorOtionOnLAndingPage() {
		getLoginPage(driver).userNameTextBox.click();
		getLoginPage(driver).userNameTextBox.sendKeys("etst0028");
		getLoginPage(driver).passWordTexrBox.click();
		getLoginPage(driver).passWordTexrBox.sendKeys("Marc2016");
		getLoginPage(driver).loginButton.click();
		getHomePage(driver).clickOnNavigatorDropDown("PMO Navigator");
		getPMONavigator(driver).pmoNavigatorIsSelected.isDisplayed();
		Assert.assertEquals(getPMONavigator(driver).pmoNavigatorIsSelected
				.getText().trim(), "PMO Navigator");
		Reporter.log("PMO Navigator option is present and selected on the Page");
		// Assert.assertTrue(getPMONavigator(driver).pmoNavigatorIsSelected.isDisplayed(),
		// "PMO Navigator is not displayed on drop down");
		Assert.assertEquals(getPMONavigator(driver).ImportTAGTextBox.getText()
				.trim(), "Import TAG");
		Reporter.log("Import TAG is present on the Page");
		Assert.assertEquals(getPMONavigator(driver).TradeAreaTextBox.getText()
				.trim(), "Trade Areas");
		Reporter.log("Trade Areas is present on the page");
		Assert.assertEquals(getPMONavigator(driver).MapSiteTextBox.getText()
				.trim(), "Map Site");
		Reporter.log("Map Site is present on the page");
		Assert.assertEquals(
				getPMONavigator(driver).DevelopmentGroupOptionSelected
						.getText().trim(), "Development Group");
		Reporter.log("Development Group Option is present and selected on the Page");
		Assert.assertEquals(getPMONavigator(driver).Atlantic.getText().trim(),
				"Atlantic");
		Reporter.log("Atlantic is present on the Page");
		Assert.assertEquals(
				getPMONavigator(driver).MidAmerica.getText().trim(),
				"Mid-America");
		Reporter.log("Mid-America is present on the Page");
		Assert.assertEquals(getPMONavigator(driver).Pacific.getText().trim(),
				"Pacific");
		Reporter.log("Pacific is present on the Page");
	}

	@Test(testName = "Verify all the drop down options are present on PMO Navigator Drop Down", description = "Verify all the drop down options are present on PMO Navigator Drop Down", priority = 1)
	@TestInfo(testCaseID = "TC_02", testCaseDescription = "Verify all the drop down options are present on PMO Navigator Drop Down")
	public void verifyPresenceOfAllDropDownOptionsInNavigatorDropDown() {
		getLoginPage(driver).userNameTextBox.click();
		getLoginPage(driver).userNameTextBox.sendKeys("etst0028");
		getLoginPage(driver).passWordTexrBox.click();
		getLoginPage(driver).passWordTexrBox.sendKeys("Marc2016");
		getLoginPage(driver).loginButton.click();
		getPMONavigator(driver).clickNavigatorDropDown();
		getPMONavigator(driver).verifyPresenceOfNavigatorDropwDownOptions(
				"PMO Navigator");
		getPMONavigator(driver).verifyPresenceOfNavigatorDropwDownOptions(
				"PMO Reports");
		getPMONavigator(driver).verifyPresenceOfNavigatorDropwDownOptions(
				"Franchise Navigator");
		getPMONavigator(driver).verifyPresenceOfNavigatorDropwDownOptions(
				"Franchise Navigator Reports");
		getPMONavigator(driver).verifyPresenceOfNavigatorDropwDownOptions(
				"Strategic Plan");
		getPMONavigator(driver).verifyPresenceOfNavigatorDropwDownOptions(
				"Admin Portal");
		getPMONavigator(driver).verifyPresenceOfNavigatorDropwDownOptions(
				"Alteryx Analytics Gallery");
		getPMONavigator(driver).verifyPresenceOfNavigatorDropwDownOptions(
				"Share Point");
		getPMONavigator(driver).verifyPresenceOfNavigatorDropwDownOptions(
				"Global Performance Matrix Site");
		getPMONavigator(driver).verifyPresenceOfNavigatorDropwDownOptions(
				"Business Review Application");
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		getHomePage(driver).clickOnNavigatorDropDown("PMO Navigator");
		driver.quit();
	}

}