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

	final String COUNTRY_ELEMENT = "//div[contains(@class,'optionName ')][text()='%s']";

	@FindBy(id = "dd_header_signInOrUp")
	WebElement signUpLink;

	@FindBy(xpath = "//button[contains(@class,'linkTextSignup')]")
	WebElement singUpBtn;

	@FindBy(name = "email")
	WebElement emailInput;

	@FindBy(name = "password")
	WebElement passwordInput;

	@FindBy(name = "firstName")
	WebElement firstNameInput;

	@FindBy(name = "lastName")
	WebElement lastNameInput;

	@FindBy(xpath = "//button[text()='Create an account']")
	WebElement createAccBtn;

	@FindBy(xpath = "//a[contains(@class,'countryWrapper')]")
	WebElement selectCountry;

	@FindBy(id = "title")
	WebElement signUpPageTitle;

	@FindBy(xpath = "//span[contains(@class,'userName')]")
	WebElement userNameIcon;

	@FindBy(xpath = "//div[contains(@class,'recommendedProducts')]//div[contains(@class,'mediaContainer')]")
	List<WebElement> listOfProduct;

	@FindBy(xpath = "//div[contains(@class,'pdpPrice')]//span[contains(@class,'currency ')]")
	WebElement currencyEle;

	@FindBy(xpath = "//div[contains(@class,'recommendedProducts')]")
	WebElement recommendedProductEle;

	public LoginPage() {
		this.driver = DriverUtils.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void openWebsite() {
		driver.get(PropertyReader.getProperty("url"));
	}

	public void selectSignUp() {
		CommonMethods.waitForElementToBePresent(signUpLink);
		signUpLink.click();
		CommonMethods.waitForElementToBePresent(singUpBtn);
		singUpBtn.click();
	}

	public void verifySignUpPage() {
		CommonMethods.waitForElementToBePresent(signUpPageTitle);
		Assert.assertTrue("Sing up page is not displayed", CommonMethods.isDisplayed(signUpPageTitle));
	}

	public void fillRequiredDetails() {
		int number = new Random().nextInt(1000);
		String email = PropertyReader.getProperty("user.email") + number + "@gmail.com";
		emailInput.sendKeys(email);
		passwordInput.sendKeys(PropertyReader.getProperty("user.password"));
		firstNameInput.sendKeys(PropertyReader.getProperty("user.firstName"));
		lastNameInput.sendKeys(PropertyReader.getProperty("user.lastName"));
		createAccBtn.click();
	}

	public void verifySignUpSuccessful() {
		CommonMethods.waitForElementToBePresent(userNameIcon);
		Assert.assertTrue("Sing up is not successful", CommonMethods.isDisplayed(userNameIcon));
	}

	public void changeCountry(String country) {
		CommonMethods.waitForElementToBePresent(selectCountry);
		selectCountry.click();
		String loc = String.format(COUNTRY_ELEMENT, country);
		driver.findElement(By.xpath(loc)).click();
	}

	public void verifyCountry(String country) {
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Country is not changed", url.equalsIgnoreCase(PropertyReader.getProperty("saudi.url")));
	}

	public void verifyCurrentcy(String country) {
		CommonMethods.waitForElementToBePresent(currencyEle);
		String currency = PropertyReader.getProperty("saudi.currency");
		Assert.assertTrue("Currency is not changed", currency.equalsIgnoreCase(currencyEle.getText()));
	}

	public void userSelectAnyProduct() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CommonMethods.waitForElementToBePresent(recommendedProductEle);
		listOfProduct.get(0).click();
	}

}
