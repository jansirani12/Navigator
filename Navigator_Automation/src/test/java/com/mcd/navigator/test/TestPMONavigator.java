package com.mcd.navigator.test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mcd.common.annotations.TestInfo;
import com.mcd.navigator.excelutils.LoginPageData;
import com.mcd.navigator.pages.PageObjects;

public class TestPMONavigator extends PageObjects {

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "browser", "url" })
	public void setUp(String browser, String url) {
		driver = getWebDriver(browser);
		wait = new WebDriverWait(driver, 20);
		navigate(url);
	}

	/*@Test(testName = "Verify all the Elements are present on PMO Navigator Landing Page", description = "Logininto PMO Navigator Home Page", dataProvider = "TC_01", dataProviderClass = LoginPage_DataProvider.class, priority = 0)
	@TestInfo(testCaseID = "TC_01", testCaseDescription = "Logininto PMO Navigator Home Page")
	public void verifyPMONavigatorOptionOnLandingPage(LoginPageData data) {
		// Login into the application
		getLoginPage(driver).loginIntoApplication(data.getUserName(),
				data.getPassWord());
		getHomePage(driver).clickOnNavigatorDropDown("PMO Navigator");
		getPMONavigator(driver).pmoNavigatorIsSelected.isDisplayed();
		Assert.assertEquals(getPMONavigator(driver).pmoNavigatorIsSelected
				.getText().trim(), "PMO Navigator");
		Reporter.log("PMO Navigator option is present and selected on the Page");
		Assert.assertEquals(getPMONavigator(driver).ImportTAGTextBox.getText()
				.trim(), "Import TAG");
		Reporter.log("Import TAG is present on the Page");
		Assert.assertEquals(getPMONavigator(driver).TradeAreaTextBox.getText()
				.trim(), "Trade Areas");
		Reporter.log("Trade Areas is present on the page");
		Assert.assertEquals(getPMONavigator(driver).MapSiteTextBox.getText()
				.trim(), "Map Site");
		Reporter.log("Map Site is present on the page");
		getPMONavigator(driver).clickOnTabToggle();
		Assert.assertEquals(
				getPMONavigator(driver).DevelopmentGroupOptionSelected
						.getText().trim(), "Development Group");
		Reporter.log("Development Group Option is present and selected on the Page");
		getPMONavigator(driver).selectListOptionFromDropDownInBladder(
				"Development Group");
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
	}*/

	@Test(testName = "Verify that user is able to Navigate to all Blade Levels when Zone has been selected in PMO Navigator", description = "Verify that user is able to Navigate to all Blade Levels when Zone has been selected in PMO Navigator", dataProvider = "TC_01", dataProviderClass = LoginPage_DataProvider.class, priority = 1)
	@TestInfo(testCaseID = "TC_01", testCaseDescription = "Verify that user is able to Navigate to all Blade Levels when Zone has been selected in PMO Navigator")
	public void verifyAllBladeLevelsForPMOZone(LoginPageData data) {
		// Login into the application
		getLoginPage(driver).loginIntoApplication(data.getUserName(),
				data.getPassWord());
		getHomePage(driver).resetAppToPMONavigator();
		getPMONavigator(driver).clickListDropDownArrowPMO();
		getPMONavigator(driver).selecListDropDownOptionPMO("Zone");
		getPMONavigator(driver).clickZonePMO("3");
		getPMONavigator(driver).clickRegionPMO("2");
		getPMONavigator(driver).clickMiniMarketPMO("3");
		getPMONavigator(driver).clickMCDSitesPMO("1");
		getPMONavigator(driver).foucsAndClickMapMarker("65906");

	}

	@Test(testName = "Verify that user is able to Navigate to all Blade Levels when Development Group has been selected in PMO Navigator", description = "Verify that user is able to Navigate to all Blade Levels when Development Group has been selected in PMO Navigator", dataProvider = "TC_01", dataProviderClass = LoginPage_DataProvider.class, priority = 2)
	@TestInfo(testCaseID = "TC_02", testCaseDescription = "Verify that user is able to Navigate to all Blade Levels when Development Group has been selected in PMO Navigator")
	public void verifyAlBladesForPMODevelopmentGroup(LoginPageData data) {
		// Login into the application
		getLoginPage(driver).loginIntoApplication(data.getUserName(),
				data.getPassWord());
		getHomePage(driver).resetAppToPMONavigator();
		getPMONavigator(driver).clickListDropDownArrowPMO();
		getPMONavigator(driver).selecListDropDownOptionPMO("Development Group");
		getPMONavigator(driver).clickDevelopmentGroupPMO("2");
		getPMONavigator(driver).clickEntityPMO("2");
		getPMONavigator(driver).clickOperatorPMO("1");
		getPMONavigator(driver).clickMcdSitesDevGrpPMO("1");
		getPMONavigator(driver).foucsAndClickMapMarker("63909");
	}

	@Test(testName = "Verify that user is able to Navigate to all Blade Levels when Division has been selected in PMO Navigator", description = "Verify that user is able to Navigate to all Blade Levels when Division has been selected in PMO Navigator", dataProvider = "TC_01", dataProviderClass = LoginPage_DataProvider.class, priority = 3)
	@TestInfo(testCaseID = "TC_03", testCaseDescription = "Verify that user is able to Navigate to all Blade Levels when Division has been selected in PMO Navigator")
	public void verifyAlBladesForPMODivision(LoginPageData data) {
		// Login into the application
		getLoginPage(driver).loginIntoApplication(data.getUserName(),
				data.getPassWord());
		getHomePage(driver).resetAppToPMONavigator();
		getPMONavigator(driver).clickListDropDownArrowPMO();
		getPMONavigator(driver).selecListDropDownOptionPMO("Division");
		getPMONavigator(driver).clickDivisionPMO("1");
		getPMONavigator(driver).clickRegionOfDivisionPMO("1");
		getPMONavigator(driver).clickMiniMarketDivisionPMO("1");
		getPMONavigator(driver).clickMCDSitesDivisionPMO("1");
		getPMONavigator(driver).foucsAndClickMapMarker("55795");
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		// getHomePage(driver).clickOnNavigatorDropDown("PMO Navigator");
		driver.quit();
	}

}