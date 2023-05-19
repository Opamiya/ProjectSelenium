package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproJobs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open the browser
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("wipro jobs"+Keys.ENTER);
 List<WebElement> links = driver.findElements(By.xpath("//a"));
 int count = links.size();
 for(int i=0;i<count;i++) {
	 String attr = links.get(i).getAttribute("href");
	 System.out.println(attr);
 }
driver.close();
	}

}
