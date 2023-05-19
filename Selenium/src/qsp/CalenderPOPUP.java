package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderPOPUP {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//open browser
WebDriver driver=new ChromeDriver();
//enter url
driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
//enter policy no
driver.findElement(By.name("policynumber")).sendKeys("123");
//enter dob
driver.findElement(By.name("dob")).click();
WebElement monthlist = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select s1=new Select(monthlist);
	s1.selectByVisibleText("Apr");
	WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s2=new Select(year);
	s2.selectByVisibleText("1998");
	driver.findElement(By.xpath("//a[text()='9']")).click();
	//enter contact no.
	driver.findElement(By.name("alternative_number")).sendKeys("9845098450");
	//click on renew policy
	driver.findElement(By.id("renew_policy_submit")).click();
	//check isDisplayed
	boolean validpolicy = driver.findElement(By.xpath("//span[text()='Please enter valid Policy No.']")).isDisplayed();
	if(validpolicy) {
		System.out.println("Please enter valid Policy No. is displaying and pass");
	}
	else {
		System.out.println("Please enter valid Policy No. is not displaying and fail");
	}
	driver.close();
	}

}
