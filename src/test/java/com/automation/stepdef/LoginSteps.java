package com.automation.stepdef;

import com.automation.pages.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage login = new LoginPage();

	@Then("user opens the website")
	public void open_website() {
		login.openWebsite();
	}

	@When("user select sign up from the drop down")
	public void user_select_sign_up_from_the_drop_down() {
		login.selectSignUp();
	}

	@Then("verify user is on sign up page")
	public void verify_user_is_on_sign_up_page() {
		login.verifySignUpPage();
	}

	@When("user fill all details")
	public void user_fill_all_details() {
		login.fillRequiredDetails();
	}

	@Then("verify sign up successful")
	public void verify_sign_up_successful() {
		login.verifySignUpSuccessful();
	}

	@When("user select country to {string}")
	public void user_select_country_to(String country) {
		login.changeCountry(country);
	}

	@Then("verify country is changed to {string}")
	public void verify_country_is_changed_to(String country) {
		login.verifyCountry(country);
	}
	
	@When("user click on any product")
	public void user_click_on_any_product() {
		login.userSelectAnyProduct();
	}

	@Then("verify currency for {string} is displayed")
	public void verify_currency_for_is_displayed(String country) {
		LoginPage login = new LoginPage();
		login.verifyCurrentcy(country);
	}

}
