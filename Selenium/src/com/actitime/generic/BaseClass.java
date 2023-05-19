package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
/**
 * this is a base class
 * @author OP_amiya
 *
 */
import org.testng.annotations.BeforeMethod;
public class BaseClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static WebDriver driver;

@BeforeClass
public void openBrowser(){
	Reporter.log("open browser",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterClass
public void closeBrowser() {
	Reporter.log("close browser",true);
	driver.close();
}
@BeforeMethod
public void login() {
Reporter.log("Login",true);
driver.get("https://demo.actitime.com/");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);
}
@AfterMethod
public void logout() {
	Reporter.log("logout",true);
	driver.findElement(By.id("logoutLink")).click();
}
}
