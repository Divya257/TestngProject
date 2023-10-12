package all_ExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_ReadOperation {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\91909\\Desktop\\Excel files\\Book1.xlsx");
		Workbook wb=new XSSFWorkbook(fis);
		
		Row row1 = wb.getSheet("write").createRow(0);
		Row row2 = wb.getSheet("write").createRow(1);
		Row row3 = wb.getSheet("write").createRow(2);
		row1.createCell(0).setCellValue("Name");
		row1.createCell(1).setCellValue("Class");
		row1.createCell(2).setCellValue("City");
		row2.createCell(0).setCellValue("Divya");
		row2.createCell(1).setCellValue("Java");
		row2.createCell(2).setCellValue("Chennai");
		
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\91909\\Desktop\\Excel files\\Book1.xlsx");
		
		wb.write(fos);
		wb.close();
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
