package qsp;

import java.util.concurrent.TimeUnit; 


////////////////////////////////////////////////////////////// NOT WORKINGGGG///////////////////////////////////////////////////


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("file:///C:/Users/Admin/Desktop/page1.html");
WebElement third = driver.findElement(By.xpath("//iframe[@id='f2']"));
driver.switchTo().frame(third);
driver.findElement(By.id("t3")).sendKeys("Third text");
}
}
