package org.stepdefinition2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gmaillogin extends BaseClass{
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch the url of gmail application")
	public void to_launch_the_url_of_gmail_application() {
	  launchUrl("https://accounts.google.com/"); 
	}

	@When("To pass the valid username in email field")
	public void to_pass_the_valid_username_in_email_field() {
	    WebElement email = driver.findElement(By.id("identifierId"));
	    email.sendKeys("sankarganesh072");
	}

	@When("To click the next button")
	public void to_click_the_next_button() throws AWTException {
	 Robot r = new Robot(); 
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease((KeyEvent.VK_ENTER));
	}

	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field() {
	    WebElement password = driver.findElement(By.name("pass"));
	    password.sendKeys("2232");
	}

	@When("To click the login button")
	public void to_click_the_login_button() throws AWTException {
		Robot r = new Robot(); 
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease((KeyEvent.VK_ENTER));
	}

	@Then("To Close Browser")
	public void to_Close_Browser() {
	    
	}


}
