package com.automation.stepdef;

import com.automation.pages.AddUserPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUserSteps {
	
	AddUserPage addUserPage = new AddUserPage();

	@Then("verify user is on add user page")
	public void verify_user_is_on_add_user_page() {
		addUserPage.verifyAddUserPage();
	}

	@When("user fills required details on add user page")
	public void user_fills_required_details_on_add_user_page() {
		addUserPage.fillRequiredDetails();
	}

	@When("click on save button")
	public void click_on_save_button() {
		addUserPage.clickOnSaveBtn();
	}
	
	@Then("verify add user success message is dispalyed")
	public void verify_add_user_success_message_is_dispalyed() {
		addUserPage.verifyAddUserSuccessMsg();
	}
}
