package org.stepdefinition3;
import io.cucumber.datatable.*;

import java.util.List;

import org.base.BaseClass;
import org.pojo.Signinpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbreg extends BaseClass {
	Signinpojo s;
	@Given("To launch Browser")
	public void to_launch_Browser() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch FB url")
	public void to_launch_FB_url() {
	   launchUrl("https://www.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
	    s=new Signinpojo();
	    clickBtn(s.getCreateaccount());
	}

	@When("To pass the first name in first name text box")
	public void to_pass_the_first_name_in_first_name_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l = d.asList();
		s=new Signinpojo();
		passText(l.get(2), s.getFirstname());
	}

	@When("To pass second name in second name text box")
	public void to_pass_second_name_in_second_name_text_box() {
		s=new Signinpojo();
		passText("ganesh", s.getLastname());
	}

	@When("To pass mobile number or email in email text box")
	public void to_pass_mobile_number_or_email_in_email_text_box(DataTable d) {
	  List<List<String>> l = d.asLists();
		s = new Signinpojo();
	    		passText(l.get(0).get(1), s.getEmailormob());
	}

	@When("To create new password")
	public void to_create_new_password() {
		 s = new Signinpojo();
		 passText("ganesh", s.getPassword());
	}

	@Then("To close the entire browser")
	public void to_close_the_entire_browser() {
	   //closeEntireBrowser();
	}


}
