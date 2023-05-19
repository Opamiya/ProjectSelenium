package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableLoginButton {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
boolean button = driver.findElement(By.name("login")).isEnabled();
if(button==true) {
	System.out.println("login enabled and pass");
}
else {
	System.out.println("Login disabled");
}
driver.close();
	}

}
