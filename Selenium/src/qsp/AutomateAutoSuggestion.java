package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAutoSuggestion {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
        //open the browser
		WebDriver driver=new ChromeDriver();
		//go to google.com
		driver.get("https://www.google.co.in/");
		//type java in the search text box
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		//find all the auto suggestion
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		//print the count of suggestions
		int count=allSugg.size();
		System.out.println("suggestions= "+count);
		//print the autoSuggestions
		for(int i=0;i<count;i++) {
			String allSuggestions = allSugg.get(i).getText();
			System.out.println(allSuggestions);
		}
		//select the 1st auto suggestion
		allSugg.get(0).click();
		Thread.sleep(3000);
		driver.close();
	}

}
