package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.CommonMethods;
import com.automation.utility.DriverUtils;

public class HomePage extends BasePage {

	@FindBy(xpath = "//img[@alt='OrangeHRM']")
	WebElement logo;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminMenu;

	@FindBy(id = "menu_admin_UserManagement")
	WebElement userManagementMenu;

	@FindBy(id = "menu_admin_viewSystemUsers")
	WebElement userTab;

	public HomePage() {
		driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyHomePage() {
		CommonMethods.waitForElementToBePresent(logo);
		Assert.assertTrue("Logo is missing on homepage", CommonMethods.isDisplayed(logo));
		Assert.assertTrue("Admin menu is missing on homepage", CommonMethods.isDisplayed(adminMenu));
	}

	public void selectAdminMenu() {
		adminMenu.click();
	}

	public void selectUserManagementMenu() {
		userManagementMenu.click();
	}

	public void selectUserTab() {
		userTab.click();
	}

}
