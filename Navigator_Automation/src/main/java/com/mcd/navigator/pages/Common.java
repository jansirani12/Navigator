package com.mcd.navigator.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public abstract class Common {
	public WebDriver driver;
	public WebDriverWait wait;
	public Actions action;
	public JavascriptExecutor jse = (JavascriptExecutor) driver;

	public Common(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 100);
		action = new Actions(driver);
	}

	public Common(String browser) {
		getWebDriver(browser);
	}

	public Common() {
	}

	public WebDriver getWebDriver(String browser) {
		switch (browser) {
		case "internet-explorer":
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")
							+ "\\Drivers\\IEDriverServer.exe");
			DesiredCapabilities capabilities = DesiredCapabilities
					.internetExplorer();
			capabilities.setCapability(
					InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			driver = new InternetExplorerDriver();
			break;
		case "firefox":
			FirefoxProfile ffprofile = new FirefoxProfile();
			driver = new FirefoxDriver(ffprofile);
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")
							+ "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		default:
			break;
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	public void navigate(String applicationURL) {
		driver.get(applicationURL);

	}

	public void sleep(long seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickNavigatorDropDown() {
		driver.findElement(
				By.xpath("//div[@class='indicator']//span[@class='k-icon k-i-arrow-s']"))
				.isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//div[@class='indicator']//span[@class='k-icon k-i-arrow-s']")));
		sleep(5000);
		driver.findElement(
				By.xpath("//div[@class='indicator']//span[@class='k-icon k-i-arrow-s']"))
				.click();
	}

	public void verifyPresenceOfNavigatorDropwDownOptions(
			String navigatorDropDownOption) {
		// clickNavigatorDropDown();
		driver.findElement(
				By.xpath("//span[contains(text(), '" + navigatorDropDownOption
						+ "')]")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//span[contains(text(), '" + navigatorDropDownOption
						+ "')]")));
		Assert.assertEquals(
				driver.findElement(
						By.xpath("//span[contains(text(), '"
								+ navigatorDropDownOption + "')]")).getText()
						.trim(), navigatorDropDownOption);
	}

	public void clickOnNavigatorDropDownOptions(String navigatorDropDownOption) {
		clickNavigatorDropDown();
		driver.findElement(
				By.xpath("//span[contains(text(), '" + navigatorDropDownOption
						+ "')]")).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//span[contains(text(), '" + navigatorDropDownOption
						+ "')]")));
		driver.findElement(
				By.xpath("//span[contains(text(), '" + navigatorDropDownOption
						+ "')]")).click();
	}
}
