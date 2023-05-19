package qsp;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFileLoginActiTime {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws Exception {
WebDriver driver=new ChromeDriver();
FileInputStream fis=new FileInputStream("./data/commondata.property");
Properties p=new Properties();
p.load(fis);
String url = p.getProperty("url");
String un = p.getProperty("username");
String pw = p.getProperty("password");
driver.get(url);
driver.findElement(By.id("username")).sendKeys(un);
driver.findElement(By.name("pwd")).sendKeys(pw);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
driver.close();
	}

}
