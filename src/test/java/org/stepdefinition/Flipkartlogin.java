package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.Fbloginpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkartlogin extends BaseClass
{

Fbloginpojo f;
	@Given("User has to launch the window and maximize")
	public void user_has_to_launch_the_window_and_maximize() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
	   launchUrl("https://en-gb.facebook.com/login/");
	}

	@When("User has to pass the data in {string}email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		
	f=new Fbloginpojo();
	    passText(em, f.getVarRef());
	}

	@When("User has to pass the data in{string} password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
		f=new Fbloginpojo();
	    passText(pass, f.getPassword());
	}

	@When("user has to click login button")
	public void user_has_to_click_login_button() {
		f=new Fbloginpojo();
		clickBtn(f.getLoginBtn());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	    closeEntireBrowser();
	}}

