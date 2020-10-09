package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.CommonMethods;
import com.automation.utility.DriverUtils;

public class UserListingPage extends BasePage {

	@FindBy(id = "systemUser-information")
	WebElement pageTitle;

	@FindBy(id = "btnAdd")
	WebElement addBtn;

	public UserListingPage() {
		driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyUserListingPage() {
		CommonMethods.waitForElementToBePresent(pageTitle);
		Assert.assertTrue("User listing page title is not dispalyed", CommonMethods.isDisplayed(pageTitle));
		Assert.assertTrue("Add button is missing on user listing page", CommonMethods.isDisplayed(addBtn));
	}

	public void clickOnAddBtn() {
		addBtn.click();
	}

}
