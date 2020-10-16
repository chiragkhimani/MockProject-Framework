package com.automation.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.CommonMethods;
import com.automation.utility.DriverUtils;

import io.cucumber.datatable.DataTable;

public class HomePage extends BasePage {

	@FindBy(xpath = "//img[@alt='OrangeHRM']")
	WebElement logo;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminMenu;

	@FindBy(id = "menu_admin_UserManagement")
	WebElement userManagementMenu;

	@FindBy(id = "menu_admin_viewSystemUsers")
	WebElement userTab;
	
	@FindBy(id= "menu_admin_Job" )
	WebElement jobMenu;
	
	@FindBy(xpath = "//a[@id='menu_admin_Job']/../ul/li/a")
	List<WebElement> jobDropdownValues;
	

	@FindBy(id = "menu_admin_Job")
	WebElement jobMenu;

	@FindBy(xpath = "//a[@id='menu_admin_Job']/../ul/li/a")
	List<WebElement> jobDropdownValues;

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

	public void hoverMouseOnJobMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(jobMenu).perform();
<<<<<<< HEAD
		
	}

	public void verifyJobDropdownValues(DataTable dataTable) {	
		List<String> expValues = dataTable.asList();
		
		for(int i = 0; i < expValues.size(); i++) {
=======
	}

	public void verifyJobDropdownValues(DataTable dataTable) {
		List<String> expValues = dataTable.asList();
		for (int i = 0; i < expValues.size(); i++) {
>>>>>>> fae1e18ca313a764e8e7b9244d4ee3592f41099a
			String expValue = expValues.get(i);
			String actValue = jobDropdownValues.get(i).getText();
			System.out.println(expValue);
			System.out.println(actValue);
			Assert.assertTrue("Expected- " + expValue + " actual-" + actValue, expValue.equalsIgnoreCase(actValue));
<<<<<<< HEAD
			
			
			
		}
	}

=======
		}
	}

	public void userOpenWixWebsite() {
		driver.get(
				"https://support.wix.com/en/article/wix-editor-using-iframes-to-display-visible-content-on-your-site");
	}

>>>>>>> fae1e18ca313a764e8e7b9244d4ee3592f41099a
}
