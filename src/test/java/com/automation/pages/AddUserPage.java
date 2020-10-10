package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.CommonMethods;
import com.automation.utility.DriverUtils;
import com.automation.utility.PropertyReader;

public class AddUserPage extends BasePage {

	@FindBy(id = "UserHeading")
	WebElement pageTitle;

	@FindBy(id = "btnSave")
	WebElement saveBtn;

	@FindBy(id = "systemUser_employeeName_empName")
	WebElement employeeNameInput;

	@FindBy(id = "systemUser_userName")
	WebElement userNameInput;

	@FindBy(id = "systemUser_password")
	WebElement passswordInput;

	@FindBy(id = "systemUser_confirmPassword")
	WebElement confirmPasswordInput;

	@FindBy(xpath = "//div[@class='message success fadable']")
	WebElement successMsg;

	public AddUserPage() {
		driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyAddUserPage() {
		CommonMethods.waitForElementToBePresent(pageTitle);
		Assert.assertTrue("Page title missing from add user page", CommonMethods.isDisplayed(pageTitle));
		Assert.assertTrue("Save button missing from add user page", CommonMethods.isDisplayed(saveBtn));
	}

	public void fillRequiredDetails() {
		employeeNameInput.sendKeys(PropertyReader.getProperty("adduser.employeename"));
		userNameInput.sendKeys(PropertyReader.getProperty("adduser.username"));
		passswordInput.sendKeys(PropertyReader.getProperty("adduser.password"));
		confirmPasswordInput.sendKeys(PropertyReader.getProperty("adduser.password"));
	}

	public void clickOnSaveBtn() {
		CommonMethods.waitForElementToBeClickable(saveBtn);
		saveBtn.click();
	}

	public void verifyAddUserSuccessMsg() {
		CommonMethods.waitForElementToBePresent(successMsg);
		Assert.assertTrue("Add user success message is not displayed", CommonMethods.isDisplayed(successMsg));
	}
}
