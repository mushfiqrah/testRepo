package com.tt.stepDef;

import com.tt.common.LoginBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPOM extends LoginBase{
	
	@Given("^I am navigate to Yahoo home page$")
	public void i_am_navigate_to_Yahoo_home_page() throws Throwable {
	launchBrowser();
	}
	@When("^I put my email ID, password, select sign in, choose Inbox$")
	public void i_put_my_email_ID_password_select_sign_in_choose_Inbox() throws Throwable {
	}
	
	@Then("^I can see my new and undeleted emails$")
	public void i_can_see_my_new_and_undeleted_emails() throws Throwable {
	    
	}
}
