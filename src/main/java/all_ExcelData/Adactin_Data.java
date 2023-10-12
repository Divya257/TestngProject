package all_ExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Adactin_Data {
	Workbook wb;
	
	public void loadExcel() throws IOException{
		FileInputStream fis=new FileInputStream("‪C:\\Users\\91909\\Desktop\\001.xlsx");
		wb= new XSSFWorkbook(fis);
		wb.getSheet("fis");
	}
	public String getURL() {
		String url = wb.getSheet("Adactin").getRow(1).getCell(1).getStringCellValue();
		return url;
	}
	public String getUsername() {
		String user = wb.getSheet("Adactin").getRow(1).getCell(2).getStringCellValue();
		return user;
	}
	public String getPassword() {
		String pass = wb.getSheet("Adactin").getRow(1).getCell(3).getStringCellValue();
		return pass;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
