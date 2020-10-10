package com.automation.stepdef;

import com.automation.pages.UserListingPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserListingSteps {

	UserListingPage userListingPage = new UserListingPage();

	@Then("verify user is on user listing page")
	public void verify_user_is_on_user_listing_page() {
		userListingPage.verifyUserListingPage();
	}

	@When("user click on Add button")
	public void user_click_on_Add_button() {
		userListingPage.clickOnAddBtn();
	}

}
