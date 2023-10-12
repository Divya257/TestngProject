package all_ExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Swag_Data {
	
		Workbook wb;
		
		public void loadExcel() throws IOException {
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\91909\\\\Desktop\\\\Excel files\\\\Book1.xlsx");
			wb= new XSSFWorkbook(fis);
			
		}
		                                                                                                                      
		public String getUsername() {
			String user = wb.getSheet("SwagData").getRow(1).getCell(2).getStringCellValue();
			return user;
		}
		
		public String getPassword() {
			String pass = wb.getSheet("SwagData").getRow(1).getCell(3).getStringCellValue();
			return pass;
		}
		
		public String geturl() {
			String url = wb.getSheet("SwagData").getRow(1).getCell(1).getStringCellValue();
			return url;
		}
		
		public String getExpected() {
			String exp = wb.getSheet("SwagData").getRow(1).getCell(4).getStringCellValue();
			return exp;
		}
		
		//public String getActual() {
			//String act = wb.getSheet("SwagData").getRow(1).getCell(5).getStringCellValue();
			//return act;
		//}
		public void writeResults(boolean f,String act) throws IOException {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\91909\\Desktop\\Excel files\\Book1.xlsx");
			wb.getSheet("SwagData").getRow(1).createCell(5).setCellValue(act);
			String s="";
			
			if(f == true) {
				s="PASS";
			}else {
				s="FAIL";
			}
			wb.getSheet("SwagData").getRow(1).createCell(6).setCellValue(s);
			wb.write(fos);
			wb.close();
			
		}
		
		
		
		
		
		
		
	}


