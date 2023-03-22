package org.stepdefinition4;
import io.cucumber.datatable.*;

import java.util.List;

import org.base.BaseClass;
import org.pojo.Amazonsigninpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonlogin extends BaseClass {
	Amazonsigninpojo a;
	@Given("To launch the browser and maximize window")
	public void to_launch_the_browser_and_maximize_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch the url of the amazon signin page")
	public void to_launch_the_url_of_the_amazon_signin_page() {
	   launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}

	@When("To pass the valid email or mobileno in email field")
	public void to_pass_the_valid_email_or_mobileno_in_email_field(DataTable d) {
	    List<String> l = d.asList();
		a = new Amazonsigninpojo();
	    passText(l.get(1), a.getEmail());
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		 a = new Amazonsigninpojo();
		clickBtn(a.getContinuebutton());
	}
	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field(DataTable d) {
		List<List<String>> l = d.asLists();
		a = new Amazonsigninpojo();
		passText(l.get(0).get(1), a.getPassword());
	}


	@When("To click the sign in button")
	public void to_click_the_sign_in_button() {
		clickBtn(a.getSigninbutton());
	}
	@Then("To close browser")
	public void to_close_browser() {
	    closeEntireBrowser();
	}

}

