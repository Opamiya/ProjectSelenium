package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightWidthOfLoginButton {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement lgnbtn = driver.findElement(By.id("loginButton"));
		int height = lgnbtn.getSize().getHeight();
		int width = lgnbtn.getSize().getWidth();
		System.out.println("height= " + height + "px and width= " + width + "px");
		driver.close();

	}

}
