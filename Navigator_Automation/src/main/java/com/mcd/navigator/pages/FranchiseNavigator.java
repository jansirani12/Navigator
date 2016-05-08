package com.mcd.navigator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class FranchiseNavigator extends Common {

	public FranchiseNavigator(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void franchiseNavigatorListDropDown() {
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//span[@class='k-icon k-i-arrow-s'])[3]")));
		driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-s'])[3]"))
				.click();
		Reporter.log("Franchise Navigator Lis Drop Down is clicked<br/>");
	}

	public void clickOnListInDropDownInBladder() {
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//span[@class='k-icon k-i-arrow-s'])[3]")));
		driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-s'])[3]"))
				.click();
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

	@FindBy(xpath = "//li[contains(text(),'Zone')]")
	public WebElement zone;

	public void selectZoneFromDropDown() {
		wait.until(ExpectedConditions.elementToBeClickable(zone));
		zone.click();
		Reporter.log("Zone is displayed in drop down<br/>");
	}

	@FindBy(xpath = "(//li[contains(text(),'Entity')])[1]")
	public WebElement entity;

	public void selectEntityFromDropDown() {
		wait.until(ExpectedConditions.elementToBeClickable(entity));
		entity.click();
		Reporter.log("Entity is selected from drop down<br/>");
	}

	public void clickOnSpecificResultInGrid(String regionName) {
		wait.until(ExpectedConditions.elementToBeClickable(driver
				.findElement(By.xpath("//span[contains(text(),'" + regionName
						+ "')]/ancestor::tr[1]/td/input"))));
		driver.findElement(
				By.xpath("//span[contains(text(),'" + regionName
						+ "')]/ancestor::tr[1]/td/input")).click();
		Reporter.log("Click on the region - " + regionName + "<br/>");
	}

	public boolean verifyRegionOpenedInNewBlade(String regionName) {
		wait.until(ExpectedConditions.elementToBeClickable(driver
				.findElement(By
						.xpath("//div[@blade-id='blade2']/h1[contains(text(),'"
								+ regionName + "')]"))));
		Reporter.log("Verify whether the region name '" + regionName
				+ "' is displayed in the second level bladder<br/>");
		return driver.findElement(
				By.xpath("//div[@blade-id='blade2']/h1[contains(text(),'"
						+ regionName + "')]")).isDisplayed();
	}

	@FindBy(xpath = "//h1[contains(text(),'ATLANTA Region')]")
	public WebElement atlantaRegion;

	public void clickOnRegionNameFilterButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//span[@class='k-icon k-filter'])[1]")));
		driver.findElement(By.xpath("(//span[@class='k-icon k-filter'])[1]"))
				.click();
		Reporter.log("Region Name Filter Button is clicked<br/>");
	}

	public void regionFilterButton() {
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//span[@class='k-icon k-filter'])[1]")));
		sleep(1000);
		driver.findElement(By.xpath("(//span[@class='k-icon k-filter'])[1]"))
				.click();
		Reporter.log("Region Filtered Button is clicked<br/>");
	}

	@FindBy(xpath = "(//input[@class='k-textbox'])[1]")
	public WebElement filterByName;

	@FindBy(xpath = "//button[text()='Filter']")
	public WebElement filterButton;

	@FindBy(xpath = "//button[contains(text(),'Clear')]")
	public WebElement clearButton;

	// WebElement of East Zone displayed in blader
	@FindBy(xpath = "//span[contains(text(),'East')]")
	public WebElement eastZone;

	// WebElement of Experience of the Future
	@FindBy(xpath = "//span[contains(text(),'Experience of the Future')]")
	public WebElement experienceOfTheFutureZone;

	// WebElement of West is displayed
	@FindBy(xpath = "//span[contains(text(),'West')]")
	public WebElement westZone;

	// WebElement of AARONJAMESDJR Entity
	@FindBy(xpath = "//span[contains(text(),'AARON, JAMES D JR')]")
	public WebElement entityAARONJAMESDJR;

	// WebElemet of ABBATE, JAMES A Entity
	@FindBy(xpath = "//span[contains(text(),'ABBATE, JAMES A')]")
	public WebElement entityABBATEJAMESA;

	// WebElement of ABBATE,JOHN
	@FindBy(xpath = "//span[contains(text(),'ABBATE, JOHN')]")
	public WebElement entityABBATEJHON;

	// WebElement of ABBOTONI HEIDI D DARYL A
	@FindBy(xpath = "//span[contains(text(),'ABBOTONI, HEIDI D, & DARYL A')]")
	public WebElement entityABBOTONI_HEIDI_D_DARYL_A;

	// WebElement of ABBOUD ALIA C
	@FindBy(xpath = "//span[contains(text(),'ABBOUD, ALIA C')]")
	public WebElement entityABBOUD_ALIA_C;

	// WebElement of ABEDI,JIM J
	@FindBy(xpath = "//span[contains(text(),'ABEDI, JIM J')]")
	public WebElement entityABEDIJIMJ;

	// WebElement of ABRISHAMI, BEHNAM
	@FindBy(xpath = "//span[contains(text(),'ABRISHAMI, BEHNAM')]")
	public WebElement entityABRISHAMIBEHNAM;

	// WebElement of ACEVEDO, JUAN I
	@FindBy(xpath = "//span[contains(text(),'ACEVEDO, JUAN I')]")
	public WebElement entityACEVEDOJUNAI;

	// WebElement of ACOSTA, RICHARD, CELIA, CARLOS & CELIA JAIRALA
	@FindBy(xpath = "//span[contains(text(),'ACOSTA, RICHARD, CELIA, CARLOS & CELIA JAIRALA')]")
	public WebElement entityACOSTARICHARDCELIA;

	// WebElement of ACRE EDWARD
	@FindBy(xpath = "//span[contains(text(),'ACRE, EDWARD')]")
	public WebElement entity_Acre_Edwars;

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

	public void closeBlade(int bladeIndex) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//div[@blade-id='blade" + bladeIndex
						+ "']//span[contains(@class,'close-button')]")));
		Reporter.log("Close the blade '" + bladeIndex + "'<br/>");
		driver.findElement(
				By.xpath("//div[@blade-id='blade" + bladeIndex
						+ "']//span[contains(@class,'close-button')]")).click();
	}

	public void clickOnDataDropDown() {
		try {
			(new WebDriverWait(driver, 120)).until(ExpectedConditions
					.elementToBeClickable(By
							.xpath("//input[@name='WorkAroundForPageLoad']")));
		} catch (Exception e) {
			// Do nothing
		}
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
