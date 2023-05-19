package qsp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickjavaWithoutFE {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.switchTo().activeElement().sendKeys("java"+Keys.ENTER);
Thread.sleep(3000);
driver.close();

	}

}
