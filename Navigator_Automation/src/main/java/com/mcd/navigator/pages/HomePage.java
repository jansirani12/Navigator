package com.mcd.navigator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class HomePage extends Common {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// Navigator Drop Down
	@FindBy(xpath = "(//span[text()='select'])[1]")
	public WebElement navigatorDropDown;

	// Click on Navigator Main Drop Down
	public void clickNavigatorDropDown() {
		try {
			(new WebDriverWait(driver, 120)).until(ExpectedConditions
					.elementToBeClickable(By
							.xpath("(//input[@name='Bala_Test']")));
		} catch (Exception e) {
			// Do nothing
		}
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//span/span[@class='k-select'])[1]")));
		WebElement navigatorDropDown = driver.findElement(By
				.xpath("(//span/span[@class='k-select'])[1]"));
		sleep(5000);
		navigatorDropDown.click();
		Reporter.log("Navigator Drop Down Clicked<br/>");
	}

	// Franchise Navigator
	@FindBy(xpath = "//div/span/img[@alt='Franchise Navigator']")
	public WebElement franchiseNavigator;

	// Map Drop Down
	@FindBy(xpath = "(//span[@class='k-icon k-i-arrow-s'])[2]")
	public WebElement mapDropdown;

	// site drop down
	@FindBy(xpath = "(//span[@class='k-select'])[3]")
	public WebElement mcdonaldsSite;

	// Region
	@FindBy(xpath = "//li[@id='308cb348-38db-457d-9d07-fad64f03e147']")
	public WebElement Region;

	public void clickOnNavigatorDropDown(String navigatorOption) {
		clickNavigatorDropDown();
		Reporter.log("Click on Navigator Drop Down Icon<br>");
		driver.findElement(
				By.xpath("//div/span/img[@alt='" + navigatorOption + "']"))
				.isDisplayed();
		Reporter.log("Verifying whether the navigator option '"
				+ navigatorOption + "' was present in the dropdown<br>");
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div/span/img[@alt='" + navigatorOption + "']")));
		Reporter.log("Select the Franchise Navigator option as "
				+ navigatorOption + "<br>");
		driver.findElement(
				By.xpath("//div/span/img[@alt='" + navigatorOption + "']"))
				.click();
		try {
			(new WebDriverWait(driver, 120)).until(ExpectedConditions
					.elementToBeClickable(By
							.xpath("(//input[@name='Bala_Test']")));
		} catch (Exception e) {
			// Do nothing
		}
	}
}