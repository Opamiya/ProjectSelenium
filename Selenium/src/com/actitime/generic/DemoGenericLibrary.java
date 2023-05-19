package com.actitime.generic;

public class DemoGenericLibrary {

	public static void main(String[] args) throws Exception {
FileLib f=new FileLib();
//reading data from property file
String url=f.getPropertyData("url");
System.out.println("url= "+url);
//reading data from excel file
String actitimeUrl = f.getExceldata("ActiTime", 1, 1);
System.out.println("URL= "+actitimeUrl);
//updating data in excel file
f.setExcelData("ActiTime", 1, 4, "pass");
	}

}
