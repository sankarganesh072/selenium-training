package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonsigninpojo extends BaseClass {
public Amazonsigninpojo () {
	PageFactory.initElements(driver, this);
}
@FindBy(id="ap_email")
private WebElement email;
@FindBy(id="continue")
private WebElement continuebutton;
public WebElement getEmail() {
	return email;
}
public WebElement getContinuebutton() {
	return continuebutton;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSigninbutton() {
	return signinbutton;
}
@FindBy(xpath="//input[@type='password']")
private WebElement password;
@FindBy(id="signInSubmit")
private WebElement signinbutton;

}
