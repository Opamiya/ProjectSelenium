package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this is a generic class for data driven testing
 * @author Amiya Pradhan
 *
 */
public class FileLib {
	/**
	 * this is a generic method for reading the data from property file
	 * @param key
	 * @return
	 * @throws Exception
	 */
public String getPropertyData(String key) throws Exception {
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String data=p.getProperty(key);
	return data;
}
/**
 * this is generic method for reading data from excelFile
 * @param sheetName
 * @param row
 * @param cell
 * @return
 * @throws Exception
 */
public String getExceldata(String sheetName, int row, int cell) throws Exception {
	FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data=wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
/**
 * this is a generic method for writing the data to ExcelFile
 * @param sheetName
 * @param row
 * @param cell
 * @param value
 * @throws Exception
 */
public void setExcelData(String sheetName, int row, int cell, String value) throws Exception {
	FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos=new FileOutputStream("./data/testScript.xlsx");
	wb.write(fos);
	wb.close();
	
}
}
