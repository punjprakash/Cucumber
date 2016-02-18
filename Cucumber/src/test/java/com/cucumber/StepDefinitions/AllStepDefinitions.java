package com.cucumber.StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import com.cucumber.Selenium.SeleniumFunctions;

public class AllStepDefinitions {
	SeleniumFunctions sf = new SeleniumFunctions();
		@Given("^user is on github homepage$")
	    public void user_is_on_githubdsgasdgsd_homepage() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
		 	//sf.createDriver();
	        //sf.ishomepageDisplayed();
			System.out.println("****user is on github homepage");
			
			
	    }

	    @When("^user clicks on Sign in button$")
	    public void user_clicks_on_Sign_in_button() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	//sf.clickSigninLink();
	    	//throw new PendingException();
	    	System.out.println("****user clicks on Sign in button");
	    }

	    @Then("^user is displayed login screen$")
	    public void user_is_displayed_login_screen() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	//sf.isloginsectionDisplayed();
	        //sf.teardown();
	    	System.out.println("****user is displayed login screen");
	    }
	    
	    ///New test case
	    
	    @Given("^user is on Application landing page$")
	    public void user_is_on_Application_landing_page() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println("****User is on landing page");
	    }

	    @When("^user enters \"(.*?)\" in username field$")
	    public void user_enters_in_username_field(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println("****User Name is"+ arg1);
	    }

	    @When("^user enters \"(.*?)\" in password field$")
	    public void user_enters_in_password_field(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	        System.out.println("****password Name is"+ arg1);
	    }

	    @When("^user clicks Sign in button$")
	    public void user_clicks_Sign_in_button() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	System.out.println("****Sign out button has been clicked");
	    }

	    @Then("^user gets login failed error message$")
	    public void user_gets_login_failed_error_message() throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	    	System.out.println("****user gets login failed error message");
	    }
	    
	    @Then("^we verify following user exists$")
	    public void we_verify_following_user_exists(DataTable userDetails) {

	      List<List<String>> details = userDetails.raw();

	      for (int i = 0; i < details.size(); i++) {
	        for (int j = 0; j < details.get(i).size(); j++) {
	        System.out.println(details.get(i).get(j));
	        }
	      }
	    }


}
