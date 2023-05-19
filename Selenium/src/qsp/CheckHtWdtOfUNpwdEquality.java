package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckHtWdtOfUNpwdEquality {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int h1 = driver.findElement(By.id("username")).getSize().getHeight();
		int w1 = driver.findElement(By.id("username")).getSize().getWidth();
		int h2=driver.findElement(By.name("pwd")).getSize().getHeight();
		int w2=driver.findElement(By.name("pwd")).getSize().getWidth();
		System.out.println("h1= "+h1+"px w1= "+w1+"px");
		if(h1==h2&&w1==w2) {
			System.out.println("Height and width of username and password textfield is equal ");
		}
		else {
			System.out.println("Height and width of username and password textfield is NOT equal ");
		}
		driver.close();
	}

}
