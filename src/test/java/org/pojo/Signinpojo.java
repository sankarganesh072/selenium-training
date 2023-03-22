package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpojo extends BaseClass {
public Signinpojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Create new account']")
private WebElement createaccount;
@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement firstname;
@FindBy(name = "lastname")
private WebElement lastname;
@FindBy(name="reg_email__")
private WebElement emailormob;
@FindBy(name="reg_passwd__")
private WebElement password;
public WebElement getCreateaccount() {
	return createaccount;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getEmailormob() {
	return emailormob;
}
public WebElement getPassword() {
	return password;
}


}
