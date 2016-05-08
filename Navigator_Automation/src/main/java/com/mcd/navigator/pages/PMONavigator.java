package com.mcd.navigator.pages;

import org.openqa.selenium.By;
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

	public void verifyNavigatorDropDownPresence(String xpathExpression) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath(NavigatorDropDownXpath)));
		Reporter.log("Navigator Drop Down is present on the PMO Navigator Landing page");
	}
}
