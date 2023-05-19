package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTagnameValue {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
  WebDriver driver=new ChromeDriver();
  driver.get("https://demo.actitime.com/login.do");
 String tagname = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
 String attr = driver.findElement(By.tagName("a")).getAttribute("href");
   System.out.println("attribute value = "+attr);
   
  System.out.println("tagname = "+tagname);
  driver.close();
	}

}
