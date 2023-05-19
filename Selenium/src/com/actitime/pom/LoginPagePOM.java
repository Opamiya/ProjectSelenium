package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	
@FindBy(name="username")
private WebElement untbx;

@FindBy(name="pwd")                                //declaration
private WebElement pwtbx;

@FindBy(xpath="//div[.='Login ']")
private WebElement lgbtn;

public LoginPagePOM(WebDriver driver) {           //CONSTRUCTER
	PageFactory.initElements(driver, this);      //initialization   [pagefactory.initelements(driver, this)]
}
//business logic method
public void setLogin(String un, String pw) {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);                          //utilization
	lgbtn.click();
}

}
