package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouse {
/*AUTOMATE THE FOLLOWING SCENARIO
 go to vtiger.com
 mouse hover to resources tab
 click on "contact us"
 capture begaluru,India phone no. and
 print it on the console*/

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://www.vtiger.com/");
WebElement resources = driver.findElement(By.partialLinkText("Resources"));
Actions a=new Actions(driver);
a.moveToElement(resources).perform();
driver.findElement(By.partialLinkText("Contact Us")).click();
String phno = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
System.out.println("Phone no.= "+phno);
driver.close();
	}

}
