package org.stepdefinition5;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooksclass extends BaseClass {
@Before(order=1)
private void Precondition1() 
{
	launchBrowser();
	launchUrl("https://www.facebook.com/");
System.out.println("precondition1");

}
@Before(order=2)
private void Precondition2() {
	System.out.println("precondition2");
}
@Before(order=3)
private void Precondition3() {
	System.out.println("precondition3");
}
@After
private void postcondition3() {
	// TODO Auto-generated method stub
	System.out.println("postcondition1");
}
@After
private void postcondition2() {
	System.out.println("precondition2");

}
@After
private void postcondition1() {
	System.out.println("precondition3");

}
}
