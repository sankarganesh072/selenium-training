package org.stepdefinition4;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksclass extends BaseClass{
@Before
private void precondition() {
	launchBrowser();
	windowMaximize();

}
@After
private void postcondition() {
	closeEntireBrowser();
}
}
