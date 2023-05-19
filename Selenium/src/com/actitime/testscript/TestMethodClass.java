package com.actitime.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPagePOM;

public class TestMethodClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void validLogin() throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	LoginPagePOM l=new LoginPagePOM(driver);
	HomePage h=new HomePage(driver);                     //for logout HomePage class to be call
	l.setLogin("admin1", "manager1");                   //1st try with wrong data
	Thread.sleep(4000);
	l.setLogin("admin", "manager");                   //2nd time with correct data
	h.setLogout();                                      //logout
	Thread.sleep(4000);
	driver.close();
}
}
