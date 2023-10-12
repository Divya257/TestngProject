package all_ExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\91909\\\\Desktop\\\\Excel files\\\\Book1.xlsx");
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(1);
		String stringCellValue = sheetAt.getRow(0).getCell(0).getStringCellValue();
		System.out.println(stringCellValue);
		wb.close();
	}

}
