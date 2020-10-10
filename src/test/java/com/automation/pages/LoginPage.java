package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.CommonMethods;
import com.automation.utility.DriverUtils;
import com.automation.utility.PropertyReader;

public class LoginPage extends BasePage {

	@FindBy(id = "txtUsername")
	WebElement userNameInput;

	@FindBy(id = "txtPassword")
	WebElement passwordInput;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	public LoginPage() {
		this.driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void openWebsite() {
		driver.get(PropertyReader.getProperty("url"));
	}

	public void loginWithAdminAccess() {
		CommonMethods.waitForElementToBePresent(userNameInput);
		userNameInput.sendKeys(PropertyReader.getProperty("admin.username"));
		passwordInput.sendKeys(PropertyReader.getProperty("admin.password"));
		loginBtn.click();
	}

}
