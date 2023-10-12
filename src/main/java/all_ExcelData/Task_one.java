package all_ExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task_one {
	

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\91909\\\\Desktop\\\\Excel_files\\\\Book1.xlsx");
		Workbook wb=new XSSFWorkbook(fis);
		
		int rows = wb.getSheet("Stud_Details").getPhysicalNumberOfRows();
		System.out.println("Number of Rows :"+ rows);

				
				
		System.out.println("===========Table Content=========");
		
		
		for (int i = 0; i < rows; i++) {
			Row row = wb.getSheet("Stud_Details").getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j <cells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}else {
					double numericCellValue = cell.getNumericCellValue();
					System.out.println(numericCellValue);
				}
				
				
				
				  
			}
			
		}
		
	
		
		
		
	}
	

}
