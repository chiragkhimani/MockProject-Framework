package com.automation.stepdef;

import com.automation.pages.HomePage;

import io.cucumber.datatable.DataTable;
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
	
	@When("hover mouse on job menu")
	public void hover_mouse_on_job_menu() {
	    homePage.hoverMouseOnJobMenu();
	    
	}

	@Then("validate list of dropdown is present in below order")
	public void validate_list_of_dropdown_is_present_in_below_order(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		
		
	  homePage.verifyJobDropdownValues(dataTable);
}


	@When("hover mouse on job menu")
	public void hover_mouse_on_job_menu() {
		homePage.hoverMouseOnJobMenu();
	}

	@Then("validate list of dropdown is displayed in below order")
	public void validate_list_of_dropdown_is_displayed_in_below_order(DataTable dataTable) {
		homePage.verifyJobDropdownValues(dataTable);
	}
	
	@Then("user open wix website")
	public void userOpenWixWebsite() {
		homePage.userOpenWixWebsite();
	}

}
