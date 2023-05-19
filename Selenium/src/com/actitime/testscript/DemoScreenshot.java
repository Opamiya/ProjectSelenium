package com.actitime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoScreenshot {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void screenshot() throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	TakesScreenshot t=(TakesScreenshot) driver;
	//pressing the prtScrn button
	File src = t.getScreenshotAs(OutputType.FILE);
	//create a empty file in below path
	File dest=new File("./Screenshot/ss.png");
	//copy and paste the screenshot from src to dest
	FileUtils.copyFile(src, dest);
	driver.close();
}
}
