package all_ExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Checking {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\91909\\Desktop\\001.xlsx");
		Workbook wb=new XSSFWorkbook(fis);
		
		System.out.println("======InsertRows===========");
		Row one = wb.getSheet("check").createRow(10);
		one.createCell(0).setCellValue("malar");
		Row two = wb.getSheet("check").createRow(10);
		two.createCell(1).setCellValue("oops");
		
FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\91909\\\\Desktop\\\\001.xlsx");
		
		wb.write(fos);
		wb.close();
		
		
}
}
