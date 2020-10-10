package com.automation.stepdef;

import com.automation.pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

	HomePage homePage = new HomePage();

	@Then("verify user is on home page")
	public void verify_user_is_on_home_page() {
		homePage.verifyHomePage();
	}

	@When("user select admin menu")
	public void user_select_admin_menu() {
		homePage.selectAdminMenu();
	}

	@When("select user management menu")
	public void select_user_management_menu() {
		homePage.selectUserManagementMenu();
	}

	@When("click on users tab")
	public void click_on_users_tab() {
		homePage.selectUserTab();
	}

}
