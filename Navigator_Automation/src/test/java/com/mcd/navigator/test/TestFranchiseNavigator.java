package com.mcd.navigator.test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mcd.common.annotations.TestInfo;
import com.mcd.navigator.excelutils.LoginPageData;
import com.mcd.navigator.pages.PageObjects;

public class TestFranchiseNavigator extends PageObjects {

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "browser", "url" })
	public void setUp(String browser, String url) {
		driver = getWebDriver(browser);
		wait = new WebDriverWait(driver, 20);
		navigate(url);
	}

	@Test(testName = "Verify that Franchise Navigator is selected", description = "Verify that user is abe to navigate into Franchise Navigator Landing page", dataProvider = "TC_01", dataProviderClass = LoginPage_DataProvider.class, priority = 0)
	@TestInfo(testCaseID = "TC 01", testCaseDescription = "Verify that user is abe to navigate into Franchise Navigator Landing page")
	public void verifyUserIsOnFranchiseNavigatorLandingPage(LoginPageData data) {
		// Login into the application
		getLoginPage(driver).loginIntoApplication(data.getUserName(),
				data.getPassWord());
		// Navigate to Franchise Navigator
		getHomePage(driver).clickOnNavigatorDropDown("Franchise Navigator");
		// Select the Franchise Navigator List
		getFranchiseNavigator(driver).clickOnListInDropDownInBladder();
		// Verify that Region is displayed in List Drop down
		Assert.assertTrue(
				getFranchiseNavigator(driver).isListOptionDisplayed("Region"),
				"Region is not displayed on Franchise drop down");
		// Verify that Zone is displayed in List Drop down
		Assert.assertTrue(
				getFranchiseNavigator(driver).isListOptionDisplayed("Zone"),
				"Zone is not displayed on Franchise Drop down list");
		// Verify that Entity is displayed in List Drop down
		Assert.assertTrue(
				getFranchiseNavigator(driver).isListOptionDisplayed("Entity"),
				"Entity is not displayed on Franchise Drop Down");
		// Click again to close the element
		getFranchiseNavigator(driver).clickOnListInDropDownInBladder();
		// select Region from drop down
		getFranchiseNavigator(driver).selectListOptionFromDropDownInBladder(
				"Region");
		// Click on Region Name filter button
		getFranchiseNavigator(driver).clickOnRegionNameFilterButton();
		// Click on Region Name filter button
		getFranchiseNavigator(driver).clickOnRegionNameFilterButton();
		// Select the filter by value from drop down
		getFranchiseNavigator(driver).selectValueFromDropDownInFilter(1,
				"Is equal to");
		// Enter the filter value in the text box
		getFranchiseNavigator(driver).enterValueToFilterName(1, "ATLANTA");
		// Click on filter button
		getFranchiseNavigator(driver).clickOnFilterButton();
		// Verify the filter displays appropriate result
		getFranchiseNavigator(driver)
				.verifyFilterValueDisplaysAfterApplyingFilter("ATLANTA");
		// Click on Region Name filter button
		getFranchiseNavigator(driver).clickOnRegionNameFilterButton();
		// Select the filter by value from drop down
		getFranchiseNavigator(driver).selectValueFromDropDownInFilter(1,
				"Is equal to");
		// Enter the filter value in the text box
		getFranchiseNavigator(driver).enterValueToFilterName(1,
				"BALTIMORE-WASHINGTON");
		// Click on filter button
		getFranchiseNavigator(driver).clickOnFilterButton();
		// Verify the filter displays appropriate result
		getFranchiseNavigator(driver)
				.verifyFilterValueDisplaysAfterApplyingFilter(
						"BALTIMORE-WASHINGTON");
		// Click on Region Name filter button
		getFranchiseNavigator(driver).regionFilterButton();
		// Select the filter by value from drop down
		getFranchiseNavigator(driver).selectValueFromDropDownInFilter(1,
				"Is equal to");
		// Enter the filter value in the text box
		getFranchiseNavigator(driver).enterValueToFilterName(1, "BOSTON");
		// Click on filter button
		getFranchiseNavigator(driver).clickOnFilterButton();
		// Verify the filter displays appropriate result
		getFranchiseNavigator(driver)
				.verifyFilterValueDisplaysAfterApplyingFilter("BOSTON");
		// Click on Region Name filter button
		getFranchiseNavigator(driver).clickOnRegionNameFilterButton();
		// Select the filter by value from drop down
		getFranchiseNavigator(driver).selectValueFromDropDownInFilter(1,
				"Is equal to");
		// Enter the filter value in the text box
		getFranchiseNavigator(driver).enterValueToFilterName(1, "HEARTLAND");
		// Click on filter button
		getFranchiseNavigator(driver).clickOnFilterButton();
		// Verify the filter displays appropriate result
		getFranchiseNavigator(driver)
				.verifyFilterValueDisplaysAfterApplyingFilter("HEARTLAND");
	}

	@Test(testName = "Select Zone from Franchise navigator list and verify the zone's got displayed in first blader", description = "Select Zone from Franchise navigator list and verify the zone's got displayed in first blader", dataProvider = "TC_01", dataProviderClass = LoginPage_DataProvider.class, priority = 1)
	@TestInfo(testCaseID = "TC 03", testCaseDescription = "Select Zone from Franchise navigator list and verify the zone's got displayed in first blader")
	public void selectZoneAndVerifyZonesAreDisplayedInBlader(LoginPageData data) {
		// Login into the application
		getLoginPage(driver).loginIntoApplication(data.getUserName(),
				data.getPassWord());
		// Navigate to Franchise Navigator
		getHomePage(driver).clickOnNavigatorDropDown("Franchise Navigator");
		// Select the Franchise Navigator List
		getFranchiseNavigator(driver).clickOnListInDropDownInBladder();
		// Verify that Zone is displayed in List Drop down
		Assert.assertTrue(
				getFranchiseNavigator(driver).isListOptionDisplayed("Zone"),
				"Zone is not displayed on Franchise Drop down list");
		// Click again to close the element
		getFranchiseNavigator(driver).clickOnListInDropDownInBladder();
		// select Region from drop down
		getFranchiseNavigator(driver).selectListOptionFromDropDownInBladder(
				"Zone");
		// Verify that West Zone is displayed in result blade
		Assert.assertTrue(getFranchiseNavigator(driver)
				.isOptionDisplayedInBladder("West"),
				"West Zone is not displayed is not displayed in blader ");
		// Verify that East Zone is displayed in result blade
		Assert.assertTrue(getFranchiseNavigator(driver)
				.isOptionDisplayedInBladder("East"),
				"East Zone is not displayed is not displayed in blader");
		// Verify that Experience of the future Zone is displayed in result
		// blade
		Assert.assertTrue(getFranchiseNavigator(driver)
				.isOptionDisplayedInBladder("Experience of the Future"),
				"Experience of the Future is not displayed in blader");
	}

	@Test(testName = "Select Zone from Franchise navigator list and verify the zone's got displayed in first blader", description = "Select Zone from Franchise navigator list and verify the zone's got displayed in first blader", dataProvider = "TC_01", dataProviderClass = LoginPage_DataProvider.class, priority = 2)
	@TestInfo(testCaseID = "TC 04", testCaseDescription = "Select Zone from Franchise navigator list and verify the zone's got displayed in first blader")
	public void selectEntityAndVerifyEntityAreDisplayedInBlader(
			LoginPageData data) {
		// Login into the application
		getLoginPage(driver).loginIntoApplication(data.getUserName(),
				data.getPassWord());
		// Navigate to Franchise Navigator
		getHomePage(driver).clickOnNavigatorDropDown("Franchise Navigator");
		// select Entity from drop down
		getFranchiseNavigator(driver).selectListOptionFromDropDownInBladder(
				"Entity");
		// verify that AARON, JAMES D JR entity is displayed on Blade one
		Assert.assertTrue(getFranchiseNavigator(driver)
				.isOptionDisplayedInBladder("AARON, JAMES D JR"),
				"AARON, JAMES D JR is not displayed");
		// Verify that ABBATE, JAMES A entity is displayed on Blade one
		Assert.assertTrue(getFranchiseNavigator(driver)
				.isOptionDisplayedInBladder("ABBATE, JAMES A"),
				"ABBATE, JAMES A is not displayed");
		// Verify that ABBATE, JOHN entity is displayed on Blade one
		Assert.assertTrue(getFranchiseNavigator(driver)
				.isOptionDisplayedInBladder("ABBATE, JOHN"),
				"ABBATE, JOHN is not displayed");
		// Verify that ABBOTONI, HEIDI D, & DARYL A is displayed on Blade one
		Assert.assertTrue(
				getFranchiseNavigator(driver).entityABBOTONI_HEIDI_D_DARYL_A
						.isDisplayed(),
				"ABBOTONI HEIDI D DARY A is not displayed");
		// Verify that ABBOUD ALIA C Entity is displayed in blade one
		Assert.assertTrue(
				getFranchiseNavigator(driver).entityABBOUD_ALIA_C.isDisplayed(),
				"ABBOUD, ALIA C is not displayed");
		Assert.assertTrue(
				getFranchiseNavigator(driver).entityABEDIJIMJ.isDisplayed(),
				"ABEDI, JIM J is not displayed");
		Assert.assertTrue(getFranchiseNavigator(driver).entityABRISHAMIBEHNAM
				.isDisplayed(), "ABRISHAMI, BEHNAM is not displayed");
		Assert.assertTrue(
				getFranchiseNavigator(driver).entityACEVEDOJUNAI.isDisplayed(),
				"ACEVEDO, JUAN I is not displayed");
		Assert.assertTrue(getFranchiseNavigator(driver)
				.isOptionDisplayedInBladder("ABBOTONI, HEIDI D, & DARYL A"),
				"ACOSTA, RICHARD, CELIA, CARLOS & CELIA JAIRALA is not displayed");
		Assert.assertTrue(getFranchiseNavigator(driver)
				.isOptionDisplayedInBladder("ACRE, EDWARD"),
				"ACRE,EDWARS is not displayed");
	}

	@Test(testName = "Verify whether Data Entity Measures is displayed in drop down", description = "Verify whether Data Entity Measures is displayed in drop doen", dataProvider = "TC_01", dataProviderClass = LoginPage_DataProvider.class, priority = 3)
	@TestInfo(testCaseID = "TC 05", testCaseDescription = "Verify whether Data Entity Measures is displayed in drop down")
	public void verifyDataEntityMeasures(LoginPageData data) {
		// Login into the application
		getLoginPage(driver).loginIntoApplication(data.getUserName(),
				data.getPassWord());
		// Navigate to Franchise Navigator
		getHomePage(driver).clickOnNavigatorDropDown("Franchise Navigator");
		// select Entity from drop down
		getFranchiseNavigator(driver).selectListOptionFromDropDownInBladder(
				"Region");
		// Select the data option from the dropdown and verify
		getFranchiseNavigator(driver).verifyOptionFromDataDropDown(
				"Entity Measures");
		// select Entity from drop down
		getFranchiseNavigator(driver).selectListOptionFromDropDownInBladder(
				"Zone");
		// Select the data option from the dropdown and verify
		getFranchiseNavigator(driver).verifyOptionFromDataDropDown(
				"Entity Measures");
		// select Entity from drop down
		getFranchiseNavigator(driver).selectListOptionFromDropDownInBladder(
				"Entity");
		// Select the data option from the dropdown and verify
		getFranchiseNavigator(driver).verifyOptionFromDataDropDown(
				"Business Review");
	}

	@Test(testName = "Verify that Atlanta Region is selected", description = "Verify that user is abe to Atlanda Region in second lavel blader", dataProvider = "TC_01", dataProviderClass = LoginPage_DataProvider.class, priority = 4)
	@TestInfo(testCaseID = "TC 02", testCaseDescription = "Verify that user is able to view Atlanta in second lavel blader")
	public void verifyAtlantaRegioHeaderInBlader(LoginPageData data) {
		// Login into the application
		getLoginPage(driver).loginIntoApplication(data.getUserName(),
				data.getPassWord());
		// Navigate to Franchise Navigator
		getHomePage(driver).clickOnNavigatorDropDown("Franchise Navigator");
		// select Region from drop down
		getFranchiseNavigator(driver).selectListOptionFromDropDownInBladder(
				"Region");
		// Select the Region as Atlanta
		getFranchiseNavigator(driver).clickOnSpecificResultInGrid("ATLANTA");
		// Verify whether the region name is displayed in the second level
		// bladder
		Assert.assertTrue(getFranchiseNavigator(driver)
				.verifyRegionOpenedInNewBlade("ATLANTA"),
				"ATLANTA Region Blade is not opened in second level blader");
		// Close the second blade opened
		getFranchiseNavigator(driver).closeBlade(2);
	}

	@Test(testName = "CliCk on East Zone in Blader one and verify East Zone is displayed in Header in Blader2", description = "Clcik on East Zone in Blader one and verify East Zone is displayed in Header in Blader2", dataProvider = "TC_01", dataProviderClass = LoginPage_DataProvider.class, priority = 5)
	@TestInfo(testCaseID = "TC 06", testCaseDescription = "Select Zone from Franchise navigator list and verify the zone's got displayed in first blader")
	public void verifyEastZoneHeaderInBlader(LoginPageData data) {
		// Login into the application
		getLoginPage(driver).loginIntoApplication(data.getUserName(),
				data.getPassWord());
		// Navigate to Franchise Navigator
		getHomePage(driver).clickOnNavigatorDropDown("Franchise Navigator");
		// select Zone from drop down
		getFranchiseNavigator(driver).selectListOptionFromDropDownInBladder(
				"Zone");
		// select East Zone from the result grid in the bladder
		getFranchiseNavigator(driver).clickOnSpecificResultInGrid("East");
		// Verify whether the East Zone Header is displayed in the second level
		// bladder
		Assert.assertTrue(getFranchiseNavigator(driver)
				.verifyRegionOpenedInNewBlade("East Zone"),
				"East Zone was not displayed in the ");
		// Close the second blade opened
		getFranchiseNavigator(driver).closeBlade(2);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		// getHomePage(driver).clickOnNavigatorDropDown("Franchise Navigator");
		driver.quit();
	}
}