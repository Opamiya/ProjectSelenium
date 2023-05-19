package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDOBdropDown {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(3000);
WebElement daylist = driver.findElement(By.id("day"));
Select s=new Select(daylist);
s.selectByValue("9");
WebElement monthlist = driver.findElement(By.id("month"));
Select s1=new Select(monthlist);
s1.selectByIndex(3);
WebElement yearlist = driver.findElement(By.id("year"));
Select s2=new Select(yearlist);
s2.selectByVisibleText("1998");
Thread.sleep(3000);
driver.close();
	}

}
