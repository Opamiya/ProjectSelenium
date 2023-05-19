package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateScenario1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
// open the browser
		WebDriver driver = new ChromeDriver();
//go to actiTIME(demo.actiTIME.com)
		driver.get("https://demo.actitime.com/login.do");
//enter the username as "Admin" and password as"manager"
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
//click on login button
		driver.findElement(By.id("loginButton")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();

	}

}
