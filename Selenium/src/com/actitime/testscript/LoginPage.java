package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
private WebElement untbx;
private WebElement pwtbx;          //declaration
private WebElement lgbtn;
public LoginPage(WebDriver driver) {
	untbx=driver.findElement(By.id("username"));
	pwtbx=driver.findElement(By.name("pwd"));
	lgbtn=driver.findElement(By.xpath("//div[.='Login ']"));
}
//business logic method
public void setLogin(String un, String pw) {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgbtn.click();
}
}
