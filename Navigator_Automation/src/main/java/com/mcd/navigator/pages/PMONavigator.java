package com.mcd.navigator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class PMONavigator extends Common {

	public PMONavigator(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, 15);

	@FindBy(xpath = "//div[@class='indicator']//span[@class='k-dropdown-wrap k-state-default']")
	public WebElement NavigatorDropDown;

	public String NavigatorDropDownXpath = "//div[@class='indicator']//span[@class='k-dropdown-wrap k-state-default']//span";

	@FindBy(xpath = "(//span[contains(text(),'PMO Navigator')])[1]")
	public WebElement pmoNavigatorIsSelected;

	@FindBy(xpath = "//label[contains(text(), 'Import TAG')]")
	public WebElement ImportTAGTextBox;

	@FindBy(xpath = "//label[contains(text(), 'Map Site')]")
	public WebElement MapSiteTextBox;

	@FindBy(xpath = "//label[contains(text(), 'Trade Areas')]")
	public WebElement TradeAreaTextBox;

	@FindBy(xpath = "//div[@class='indicator']//span[@class='k-icon k-i-arrow-s']")
	public WebElement NavigatorDropwDownArrowButton;

	@FindBy(xpath = "//a[@title='Import From TAG']")
	public WebElement ImportTAGIcon;

	@FindBy(xpath = "//a[@title='Open Existing Trade Area']")
	public WebElement TradeAreasIcon;

	@FindBy(xpath = "//span[@class='k-widget k-dropdown k-header groupFilter']//span[@class='k-dropdown-wrap k-state-default' and @unselectable='on']")
	public WebElement ListDropDown;

	@FindBy(xpath = "//div[@id='tabs-toggle']/i")
	public WebElement tabsToggleButton;

	@FindBy(xpath = "//span[contains(text(), 'Development Group')]")
	public WebElement DevelopmentGroupOptionSelected;

	@FindBy(xpath = "//tbody[@role='rowgroup']//tr[1]/td/input")
	public WebElement AltanticButton;

	@FindBy(xpath = "//tbody[@role='rowgroup']//tr[2]/td/input")
	public WebElement MidAmericaButton;

	@FindBy(xpath = "//tbody[@role='rowgroup']//tr[3]/td/input")
	public WebElement PacificButton;

	@FindBy(xpath = "//tr[@role='row']/th[3]/a[1]")
	public WebElement NameFilterField;

	@FindBy(xpath = "(//span[@class='k-widget k-dropdown k-header']/span[1])[3]")
	public WebElement NameFilterOperator;

	@FindBy(xpath = "//span[text()='Atlantic']")
	public WebElement Atlantic;

	@FindBy(xpath = "//span[text()='Mid-America']")
	public WebElement MidAmerica;

	@FindBy(xpath = "//span[text()='Pacific']")
	public WebElement Pacific;

	public void clickOnTabToggle() {
		wait.until(ExpectedConditions.elementToBeClickable(tabsToggleButton));
		tabsToggleButton.click();
		Reporter.log("Tabs Toggle button clicked<br/>");
	}

	public void verifyNavigatorDropDownPresence(String xpathExpression) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(NavigatorDropDownXpath)));
		Reporter.log("Navigator Drop Down is present on the PMO Navigator Landing page");
	}

	public void clickListDropDownArrowPMO() {
		sleep(5000);
		driver.findElement(By.xpath("//span[@class='k-widget k-dropdown k-header groupFilter']/span/span[2]"))
				.isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(driver
				.findElement(By
						.xpath("//span[@class='k-widget k-dropdown k-header groupFilter']/span/span[2]"))));
		sleep(2000);
		driver.findElement(By.xpath("//span[@class='k-widget k-dropdown k-header groupFilter']/span/span[2]"))
				.click();
	}

	public void selecListDropDownOptionPMO(String listDropDownOption) {
		driver.findElement(
				By.xpath("//li[(text()='" + listDropDownOption + "')]"))
				.isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//li[(text()='" + listDropDownOption + "')]")));
		sleep(2000);
		driver.findElement(
				By.xpath("//li[(text()='" + listDropDownOption + "')]"))
				.click();
		//waitForPageLoadOffshore();
	}

	public void clickZonePMO(String zoneNumber) {
		driver.findElement(
				By.xpath("//tbody[@role='rowgroup']/tr[" + zoneNumber
						+ "]/td[1]")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(driver
				.findElement(By.xpath("//tbody[@role='rowgroup']/tr["
						+ zoneNumber + "]/td[1]"))));
		sleep(5000);
		driver.findElement(
				By.xpath("//tbody[@role='rowgroup']/tr[" + zoneNumber
						+ "]/td[1]")).click();
		//waitForPageLoadOffshore();
	}

	public void clickRegionPMO(String RegionNumber) {
		driver.findElement(
				By.xpath("//tbody[@role='rowgroup']/tr[" + RegionNumber
						+ "]/td[1]/input")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(driver
				.findElement(By.xpath("//tbody[@role='rowgroup']/tr["
						+ RegionNumber + "]/td[1]/input"))));
		sleep(5000);
		driver.findElement(
				By.xpath("//tbody[@role='rowgroup']/tr[" + RegionNumber
						+ "]/td[1]/input")).click();
		//waitForPageLoadOffshore();
	}

	public void clickMiniMarketPMO(String MiniMarketNumber) {
		driver.findElement(
				By.xpath("//tbody[@role='rowgroup']/tr[" + MiniMarketNumber
						+ "]/td[1]")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//tbody[@role='rowgroup']/tr[" + MiniMarketNumber
						+ "]/td[1]")));
		sleep(5000);
		driver.findElement(
				By.xpath("//tbody[@role='rowgroup']/tr[" + MiniMarketNumber
						+ "]/td[1]")).click();
		//waitForPageLoadOffshore();
	}

	public void clickMCDSitesPMO(String MCDSiteNumber) {
		driver.findElement(
				By.xpath("(//tbody[@role='rowgroup']/tr[" + MCDSiteNumber
						+ "]/td[1]/input)[1]")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//tbody[@role='rowgroup']/tr[" + MCDSiteNumber
						+ "]/td[1]/input)[1]")));
		sleep(5000);
		driver.findElement(
				By.xpath("(//tbody[@role='rowgroup']/tr[" + MCDSiteNumber
						+ "]/td[1]/input)[1]")).click();
		//waitForPageLoadOffshore();
	}

	// div[@id='blade1Grid']/div[3]/table/tbody/tr[1]/td[1]/input

	public void clickDevelopmentGroupPMO(String DevGroupNumber) {
		driver.findElement(
				By.xpath("//div[@id='blade1Grid']/div[3]/table/tbody/tr["
						+ DevGroupNumber + "]/td[1]/input")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@id='blade1Grid']/div[3]/table/tbody/tr["
						+ DevGroupNumber + "]/td[1]/input")));
		sleep(5000);
		driver.findElement(
				By.xpath("//div[@id='blade1Grid']/div[3]/table/tbody/tr["
						+ DevGroupNumber + "]/td[1]/input")).click();
		//waitForPageLoadOffshore();
	}

	public void clickEntityPMO(String EntityNumber) {
		driver.findElement(
				By.xpath("//div[@id='blade2Grid']/div[3]/table/tbody/tr["
						+ EntityNumber + "]/td[1]/input")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@id='blade2Grid']/div[3]/table/tbody/tr["
						+ EntityNumber + "]/td[1]/input")));
		sleep(5000);
		driver.findElement(
				By.xpath("//div[@id='blade2Grid']/div[3]/table/tbody/tr["
						+ EntityNumber + "]/td[1]/input")).click();
		//waitForPageLoadOffshore();
	}

	public void clickOperatorPMO(String OperatorNumber) {
		driver.findElement(
				By.xpath("//div[@id='blade3Grid']/div[3]/table/tbody/tr["
						+ OperatorNumber + "]/td[1]/input")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@id='blade3Grid']/div[3]/table/tbody/tr["
						+ OperatorNumber + "]/td[1]/input")));
		sleep(5000);
		driver.findElement(
				By.xpath("//div[@id='blade3Grid']/div[3]/table/tbody/tr["
						+ OperatorNumber + "]/td[1]/input")).click();
		//waitForPageLoadOffshore();
	}

	public void clickMcdSitesDevGrpPMO(String SiteNumber) {
		driver.findElement(
				By.xpath("//div[@id='blade4Grid']/div[3]/table/tbody/tr["
						+ SiteNumber + "]/td[1]/input")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@id='blade4Grid']/div[3]/table/tbody/tr["
						+ SiteNumber + "]/td[1]/input")));
		sleep(5000);
		driver.findElement(
				By.xpath("//div[@id='blade4Grid']/div[3]/table/tbody/tr["
						+ SiteNumber + "]/td[1]/input")).click();
		//waitForPageLoadOffshore();
	}

	public void foucsAndClickMapMarker(String MarkerID) {
		WebElement element = driver
				.findElement(By
						.xpath("//div[@id='map-canvas']/div/div[1]/div[3]/div[1]/div[@id='"
								+ MarkerID + "']"));
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView(true);", element);
		driver.findElement(
				By.xpath("//div[@id='map-canvas']/div/div[1]/div[3]/div[1]/div[@id='"
						+ MarkerID + "']")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@id='map-canvas']"
						+ "/div/div[1]/div[3]/div[1]/div[@id='" + MarkerID
						+ "']")));
		sleep(5000);
		driver.findElement(
				By.xpath("//div[@id='map-canvas']/div/div[1]/div[3]/div[1]/div[@id='"
						+ MarkerID + "']")).click();
		//waitForPageLoadOffshore();
	}

	public void clickDivisionPMO(String DivisionNumber) {
		driver.findElement(
				By.xpath("//div[@id='blade1Grid']/div[3]/table/tbody/tr["
						+ DivisionNumber + "]/td[1]/input")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@id='blade1Grid']/div[3]/table/tbody/tr["
						+ DivisionNumber + "]/td[1]/input")));
		sleep(5000);
		driver.findElement(
				By.xpath("//div[@id='blade1Grid']/div[3]/table/tbody/tr["
						+ DivisionNumber + "]/td[1]/input")).click();
		//waitForPageLoadOffshore();
	}

	public void clickRegionOfDivisionPMO(String RegionNUmber) {
		driver.findElement(
				By.xpath("//div[@id='blade2Grid']/div[3]/table/tbody/tr["
						+ RegionNUmber + "]/td[1]/input")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@id='blade2Grid']/div[3]/table/tbody/tr["
						+ RegionNUmber + "]/td[1]/input")));
		sleep(5000);
		driver.findElement(
				By.xpath("//div[@id='blade2Grid']/div[3]/table/tbody/tr["
						+ RegionNUmber + "]/td[1]/input")).click();
		//waitForPageLoadOffshore();
	}

	public void clickMiniMarketDivisionPMO(String MiniMarketNumber) {
		driver.findElement(
				By.xpath("//div[@id='blade3Grid']/div[3]/table/tbody/tr["
						+ MiniMarketNumber + "]/td[1]/input")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@id='blade3Grid']/div[3]/table/tbody/tr["
						+ MiniMarketNumber + "]/td[1]/input")));
		sleep(5000);
		driver.findElement(
				By.xpath("//div[@id='blade3Grid']/div[3]/table/tbody/tr["
						+ MiniMarketNumber + "]/td[1]/input")).click();
		//waitForPageLoadOffshore();

	}

	public void clickMCDSitesDivisionPMO(String MCDSiteNumber) {
		driver.findElement(
				By.xpath("//div[@id='blade4Grid']/div[3]/table/tbody/tr["
						+ MCDSiteNumber + "]/td[1]/input")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@id='blade4Grid']/div[3]/table/tbody/tr["
						+ MCDSiteNumber + "]/td[1]/input")));
		sleep(5000);
		driver.findElement(
				By.xpath("//div[@id='blade4Grid']/div[3]/table/tbody/tr["
						+ MCDSiteNumber + "]/td[1]/input")).click();
//		waitForPageLoadOffshore();
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

	public void clickOnListInDropDownInBladder() {
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//span[@class='k-icon k-i-arrow-s'])[7]")));
		driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-s'])[7]"))
				.click();
		sleep(500);
		Reporter.log("List Of Franchise Navigator Drop Down Is clicked<br/>");
	}
}
