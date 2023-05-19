package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginLogout {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.findElement(By.id("email")).sendKeys("amiyap99@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Amiya@12345");
driver.findElement(By.name("login")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//span[@class='x4k7w5x x1h91t0o x1h9r5lt xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j x1jfb8zj'])[7]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("(//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xahkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xudqn12 x3x7a5m x6prxxf xvq8zen xk50ysn xzsf02u x1yc453h'])[1]")).click();
Thread.sleep(3000);
driver.close();
	}

}
