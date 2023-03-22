package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipsrch extends BaseClass{
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch url of flipkart apllication")
	public void to_launch_url_of_flipkart_apllication() {
	   launchUrl("https://www.flipkart.com/");
	}

	@When("To pass the product name in search field'")
	public void to_pass_the_product_name_in_search_field() {
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	    search.sendKeys("football");
	}

	@When("to click the login button")
	public void to_click_the_login_button() throws AWTException {
		 Robot r = new Robot();
		   r.keyPress(KeyEvent.VK_ENTER);
		   r.keyRelease(KeyEvent.VK_ENTER);
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}



}
