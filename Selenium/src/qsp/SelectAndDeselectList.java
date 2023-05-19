package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselectList {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Admin/Desktop/Hotel.html");
WebElement mtrListBox = driver.findElement(By.id("mtr"));
Select s=new Select(mtrListBox);
List<WebElement> allOptions = s.getOptions();
int count = allOptions.size();
for(int i=0;i<count;i++) {
	s.selectByIndex(i);	
	Thread.sleep(500);
}

for(int i=count-1;i>=0;i--) {
	s.deselectByIndex(i);
	Thread.sleep(500);
}
driver.close();                                                                                                 
//String text = s.getWrappedElement().getText();
//System.out.println(text);
driver.quit();
	}

}
