package qsp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
WebDriver driver=new ChromeDriver();
//go to demo.actitime
driver.get("https://demo.actitime.com/login.do");
//login to actitime as admin
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);
Thread.sleep(4000);
//click on about your actitime present under help drop down
driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
Thread.sleep(4000);
driver.findElement(By.linkText("About your actiTIME")).click();
Thread.sleep(4000);
//click on read service agreement and click present in popup
driver.findElement(By.linkText("Read Service Agreement")).click();
Thread.sleep(4000);
//capture all the headings present in new tab
Set<String> alwh = driver.getWindowHandles();
 String s = "actiTIME Online Terms of Service";
 String s2 = "actiTIME - Enter Time-Track";
for(String wh:alwh) {
	driver.switchTo().window(wh);
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals(s)) {
		Thread.sleep(4000);
		 List<WebElement> allHead = driver.findElements(By.xpath("//h2"));
		 int count = allHead.size();
		System.out.println("total headings = "+count);
		for(int i = 1;i<count;i++) {
			String text = allHead.get(i).getText();
			//print all the headings on console
			System.out.println(text);	   
			}
	}
driver.close();	
}


	}
}
