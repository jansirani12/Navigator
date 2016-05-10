package com.mcd.navigator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class FranchiseNavigator extends Common {

	@FindBy(xpath = "//button[text()='Filter']")
	public WebElement filterButton;

	@FindBy(xpath = "//button[contains(text(),'Clear')]")
	public WebElement clearButton;

	public FranchiseNavigator(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickOnListInDropDownInBladder() {
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//span[@class='k-icon k-i-arrow-s'])[3]")));
		driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-s'])[3]"))
				.click();
		sleep(500);
		Reporter.log("List Of Franchise Navigator Drop Down Is clicked<br/>");
	}

	public boolean isListOptionDisplayed(String listOption) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//li[contains(text(),'" + listOption + "')]")));
		Reporter.log("Verifying whether Region option is displayed in drop down<br/>");
		return driver.findElement(
				By.xpath("//li[contains(text(),'" + listOption + "')]"))
				.isDisplayed();
	}

	public void selectListOptionFromDropDownInBladder(String listOption) {
		clickOnListInDropDownInBladder();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//li[contains(text(),'" + listOption + "')]")));
		driver.findElement(
				By.xpath("//li[contains(text(),'" + listOption + "')]"))
				.click();
		Reporter.log("Select the value " + listOption
				+ " from the List drop down<br/>");
	}

	public void clickOnSpecificResultInGrid(String regionName) {
		wait.until(ExpectedConditions.elementToBeClickable(driver
				.findElement(By.xpath("//span[contains(text(),'" + regionName
						+ "')]/ancestor::tr[1]/td/input"))));
		driver.findElement(
				By.xpath("//span[contains(text(),'" + regionName
						+ "')]/ancestor::tr[1]/td/input")).click();
		Reporter.log("Click on the region - " + regionName + "<br/>");
		shortWaitForPageLoadOffshore();
	}
	
	public boolean verifyRegionOpenedInNewBlade(String regionName) {
		wait.until(ExpectedConditions.elementToBeClickable(driver
				.findElement(By
						.xpath("//h1[contains(text(),'"
								+ regionName + "')]"))));
		Reporter.log("Verify whether the region name '" + regionName
				+ "' is displayed in the second level bladder<br/>");
		return driver.findElement(
				By.xpath("//h1[contains(text(),'"
						+ regionName + "')]")).isDisplayed();
	}
	public void clickOnRegionNameFilterButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//span[@class='k-icon k-filter'])[1]")));
		driver.findElement(By.xpath("(//span[@class='k-icon k-filter'])[1]"))
				.click();
		Reporter.log("Region Name Filter Button is clicked<br/>");
	}

	public void selectValueFromDropDownInFilter(int dropdownIndex,
			String dropdownValue) {
		Select selectDropDown = new Select(driver.findElement(By
				.xpath("//form[contains(@class,'filter-menu')]//div/span["
						+ dropdownIndex + "]//select")));
		selectDropDown.selectByVisibleText(dropdownValue);
		Reporter.log("Select the value " + dropdownIndex
				+ " from the drop down<br/>");
	}

	public void enterValueToFilterName(int filterValueIndex, String filterValue) {
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//input[@class='k-textbox'])[" + filterValueIndex
						+ "]")));
		WebElement filterValueTextBox = driver.findElement(By
				.xpath("(//input[@class='k-textbox'])[" + filterValueIndex
						+ "]"));
		filterValueTextBox.clear();
		Reporter.log("Clear the contents of the " + filterValueIndex
				+ " filter value<br/>");
		filterValueTextBox.sendKeys(filterValue);
		Reporter.log("Enter filter value as " + filterValue + " in the "
				+ filterValueIndex + " filter value text box<br/>");
	}

	public void clickOnFilterButton() {
		wait.until(ExpectedConditions.elementToBeClickable(filterButton));
		filterButton.click();
		Reporter.log("Click on Filter button<br/>");
	}

	public void verifyFilterValueDisplaysAfterApplyingFilter(String filterValue) {
		sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//table[@class='k-selectable']//tr//td/span")));
		WebElement regionNameDisplayedOnUI = driver.findElement(By
				.xpath("//table[@class='k-selectable']//tr//td/span"));
		Assert.assertEquals(regionNameDisplayedOnUI.getText().trim(),
				filterValue);
		Reporter.log("Region name was displayed as expected - " + filterValue
				+ "<br>");
	}

	public boolean isOptionDisplayedInBladder(String zoneName) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//span[contains(text(),'" + zoneName + "')]")));
		Reporter.log("Verify whether the zone '" + zoneName
				+ "' is displayed on the bladder<br/>");
		return driver.findElement(
				By.xpath("//span[contains(text(),'" + zoneName + "')]"))
				.isDisplayed();
	}

	/*public void closeBlade(int bladeIndex) {
		shortWaitForPageLoadOffshore();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@blade-id='blade" + bladeIndex
						+ "']//span[contains(@class,'close-button')]")));
		driver.findElement(
				By.xpath("//div[@blade-id='blade" + bladeIndex
						+ "']//span[contains(@class,'close-button')]")).click();
		Reporter.log("Close the blade '" + bladeIndex + "'<br/>");
	}*/

	public void clickOnDataDropDown() {
		shortWaitForPageLoadOffshore();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//span[@class='k-icon k-i-arrow-s'])[4]")));
		driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-s'])[4]"))
				.click();
		Reporter.log("Data Drop Down is clicked<br/>");
	}

	public void verifyOptionFromDataDropDown(String dataOptions) {
		clickOnDataDropDown();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//li[contains(text(),'" + dataOptions + "')]")));
		Assert.assertEquals(
				driver.findElement(
						By.xpath("//li[contains(text(),'" + dataOptions + "')]"))
						.getText().trim(), dataOptions);
		Reporter.log("Entity Name was displayed in blader as expected-'"
				+ dataOptions + "'<br>");
	}
}
