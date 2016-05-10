package com.mcd.navigator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;

public class HomePage extends Common {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// Click on Navigator Main Drop Down
	public void clickNavigatorDropDown() {
		waitForPageLoadOffshore();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("(//span/span[@class='k-select'])[1]")));
		WebElement navigatorDropDown = driver.findElement(By
				.xpath("(//span/span[@class='k-select'])[1]"));
		// div[@class='indicator']//span[@class='k-icon k-i-arrow-s']
		sleep(5000);
		navigatorDropDown.click();
		Reporter.log("Navigator Drop Down Clicked<br/>");
	}

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
//		waitForPageLoadOffshore();
	}

	public void resetAppToPMONavigator() {
		
			clickNavigatorDropDown();
			driver.findElement(
					By.xpath("//span[contains(text(), 'Franchise Navigator')]"))
					.isDisplayed();
			wait.until(ExpectedConditions.elementToBeClickable(By
					.xpath("//span[contains(text(), 'Franchise Navigator')]")));
			driver.findElement(
					By.xpath("//span[contains(text(), 'Franchise Navigator')]"))
					.click();
			clickNavigatorDropDown();
			driver.findElement(
					By.xpath("//span[contains(text(), 'PMO Navigator')]"))
					.isDisplayed();
			wait.until(ExpectedConditions.elementToBeClickable(By
					.xpath("//span[contains(text(), 'PMO Navigator')]")));
			driver.findElement(
					By.xpath("//span[contains(text(), 'PMO Navigator')]"))
					.click();
			}
}