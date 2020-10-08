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

}
