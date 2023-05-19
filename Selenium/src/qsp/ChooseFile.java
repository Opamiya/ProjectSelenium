package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseFile {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/Admin/Desktop/choose%20file.html");
File f=new File("./data/Amiya freshers Resume.pdf");
String absolutepath = f.getAbsolutePath();
driver.findElement(By.id("cv")).sendKeys(absolutepath);
Thread.sleep(3000);
System.out.println(absolutepath);
driver.close();
	}

}
