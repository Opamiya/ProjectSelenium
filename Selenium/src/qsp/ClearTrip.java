package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		//open the browser
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.cleartrip.com/");
driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
driver.findElement(By.xpath("(//button)[4]")).click();
driver.findElement(By.xpath("(//div[contains(@class,' flex-top monthStart')])[2]")).click();
driver.findElement(By.xpath("(//div[contains(@class,'relative pr-4 w-100p')])[1]")).click();
driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
driver.findElement(By.xpath("(//div[contains(@class,'relative pr-4 w-100p')])[2]")).click();
driver.findElement(By.xpath("//div[contains(text(),'GOI')]")).click();
driver.findElement(By.xpath("//span[contains(text(),'Search flights')]")).click();
List<WebElement> flightName = driver.findElements(By.xpath("//p[@class='fw-500 fs-2 c-neutral-900']"));
int count = flightName.size();
List<WebElement> departureTime = driver.findElements(By.xpath("//p[@class='m-0 fs-5 fw-400 c-neutral-900']"));
for(int i=0;i<count;i++) {
	String name = flightName.get(i).getText();
	String time = departureTime.get(i).getText();
	System.out.println(name+" -------> "+time);
}
driver.close();
	}

}
