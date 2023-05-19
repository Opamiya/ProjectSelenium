package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//open the browser
WebDriver driver=new ChromeDriver();
//enter the url
driver.get("https://demo.automationtesting.in/Alerts.html");
//click on alert with ok cancel button
driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//click on confirm box
driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
//click on confirmbox
Alert a = driver.switchTo().alert();
a.dismiss();
//click on cancel
boolean cancel = driver.findElement(By.xpath("//p[text()='You Pressed Cancel']")).isDisplayed();
//verify isDisplayed
if(cancel) {
	System.out.println("You Pressed Cancel is displayed and pass");
}
else {
	System.out.println("You Pressed Cancel is not displayed and fail");
}
driver.close();

	}

}
