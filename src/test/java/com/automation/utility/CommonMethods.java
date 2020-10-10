package com.automation.utility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

	static WebDriver driver = DriverUtils.getDriver();

	static WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(),
			Long.parseLong(PropertyReader.getProperty("timeout")));

	public static void waitForElementToBePresent(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForElementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static boolean isDisplayed(WebElement element) {
		try {
			return element.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public static void switchToNewWindow() {
		String currentWindow = driver.getWindowHandle();
		Set<String> listOfWindow = driver.getWindowHandles();

		for (String window : listOfWindow) {
			if (!window.equals(currentWindow)) {
				driver.switchTo().window(window);
			}
		}
	}

	public static void selectDropdownText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static boolean isDisabled(WebElement element) {
		return !element.isEnabled();
	}

}
