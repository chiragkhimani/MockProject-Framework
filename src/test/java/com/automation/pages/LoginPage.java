package com.automation.pages;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utility.CommonMethods;
import com.automation.utility.DriverUtils;
import com.automation.utility.PropertyReader;

public class LoginPage extends BasePage {

	public LoginPage() {
		this.driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void openWebsite() {
		driver.get(PropertyReader.getProperty("url"));
	}

}
