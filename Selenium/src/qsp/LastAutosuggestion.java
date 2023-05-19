package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LastAutosuggestion {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		//open browser
WebDriver driver=new ChromeDriver();
//navigate to google
driver.get("https://www.google.co.in/");
//type selenium in search text box
driver.findElement(By.name("q")).sendKeys("selenium");
Thread.sleep(3000);
//capture all the auto suggestion 
List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
int count=allSugg.size();
System.out.println(" counts of sugg="+count);
//print on console
for(int i=0;i<count;i++) {
	String allSuggestions = allSugg.get(i).getText();
	System.out.println(allSuggestions);
}
//select the last suggestion
allSugg.get(count-1).click();
Thread.sleep(3000);
driver.close();

	}

}
