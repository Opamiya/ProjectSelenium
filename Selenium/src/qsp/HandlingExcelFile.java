package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingExcelFile {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
Workbook wb = WorkbookFactory.create(fis);
String url = wb.getSheet("ActiTime").getRow(1).getCell(1).getStringCellValue();
String un = wb.getSheet("ActiTime").getRow(1).getCell(2).getStringCellValue();
String pw = wb.getSheet("ActiTime").getRow(1).getCell(3).getStringCellValue();
System.out.println("url = "+url);
System.out.println("username = "+un);
System.out.println("password = "+pw);
driver.get(url);
driver.findElement(By.id("username")).sendKeys(un);
driver.findElement(By.name("pwd")).sendKeys(pw);
driver.findElement(By.xpath("//div[text()='Login ']")).click();
Thread.sleep(4000);
driver.close();
	}

}
