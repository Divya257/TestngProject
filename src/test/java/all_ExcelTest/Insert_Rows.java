package all_ExcelTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Insert_Rows {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\91909\\Desktop\\Excel_files\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Stud_Details").createRow(11).createCell(0).setCellValue("adam");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("end");
	}
	
	}


