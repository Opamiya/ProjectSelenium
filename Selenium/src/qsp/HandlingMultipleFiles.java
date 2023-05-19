package qsp;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingMultipleFiles {

	public static void main(String[] args) throws Exception {
FileInputStream fis=new FileInputStream("./data/testScript.xlsx");
Workbook wb = WorkbookFactory.create(fis);
int rowcount = wb.getSheet("InvalidLogin").getLastRowNum();
int cellcount=wb.getSheet("InvalidLogin").getRow(0).getLastCellNum();
for(int i=1;i<=rowcount;i++) {
	for(int j=1;j<=cellcount;j++) {
		String data = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
		System.out.println(data);
	}
}
	}

}
