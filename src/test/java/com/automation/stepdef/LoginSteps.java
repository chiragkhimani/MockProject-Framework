package com.automation.stepdef;

import com.automation.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	LoginPage login = new LoginPage();

	@Given("user open orange hrm website")
	public void user_open_orange_hrm_website() {
		login.openWebsite();
	}

	@When("user login with admin access")
	public void user_login_with_admin_access() {
		login.loginWithAdminAccess();
	}

}
