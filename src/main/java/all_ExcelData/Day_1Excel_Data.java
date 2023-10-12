package all_ExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day_1Excel_Data {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91909\\Desktop\\001.xlsx");
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int rows = sheetAt.getPhysicalNumberOfRows();
		//int lastRowNum = sheetAt.getLastRowNum();
		for (int i = 0; i <rows; i++) {
			Row row = sheetAt.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cells; j++) {
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
