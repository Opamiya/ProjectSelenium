package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebElements {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Selenium/traversexpath.html");
		List<WebElement> allTexts = driver.findElements(By.xpath("//td"));
		int count = allTexts.size();
		System.out.println("no of contents= " + count);
		for (int i = 0; i < count; i++) {
			String texts = allTexts.get(i).getText();
			System.out.println(texts);
		}
		driver.close();

	}

}
