package all_ExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Automationsite_Data {
		Workbook wb;
		
		public void loadExcels() throws IOException {
			FileInputStream fis = new FileInputStream("‪‪‪‪C:\\Users\\91909\\Desktop\\001.xlsx");
			wb= new XSSFWorkbook(fis);
			
		}
	
		public String getFirstname() {
			String first = wb.getSheet("AutoForm").getRow(0).getCell(1).getStringCellValue();
			return first;
		}
	
		public String getLastname() {
			String last = wb.getSheet("AutoForm").getRow(1).getCell(1).getStringCellValue();
			return last;
		}
		
		public String getEmail() {
			String Email = wb.getSheet("AutoForm").getRow(2).getCell(1).getStringCellValue();
			return Email;
		}
	
	
		public String getAddress() {
			String Address = wb.getSheet("AutoForm").getRow(3).getCell(1).getStringCellValue();
			return Address;
		}
	
	
		public String getPhoneno() {
			String phone = wb.getSheet("AutoForm").getRow(4).getCell(1).getStringCellValue();
			return phone;
		}
		
		public String getGender() {
			String Gender = wb.getSheet("AutoForm").getRow(5).getCell(1).getStringCellValue();
			return Gender;
		}
		
		public String getHobbies() {
			String Hobbies = wb.getSheet("AutoForm").getRow(6).getCell(1).getStringCellValue();
			return Hobbies;
		}
		
			
		public String getLanguages() {
			String Languages = wb.getSheet("AutoForm").getRow(7).getCell(1).getStringCellValue();
			return Languages;
		}
		
				
		public String getSkills() {
			String Skill = wb.getSheet("AutoForm").getRow(8).getCell(1).getStringCellValue();
			return Skill;
		}
		
		
		public String getCountry() {
			String Country = wb.getSheet("AutoForm").getRow(9).getCell(1).getStringCellValue();
			return Country;
		}
		
		public String getSelectCountry() {
			String SelectCountry = wb.getSheet("AutoForm").getRow(10).getCell(1).getStringCellValue();
			return SelectCountry;
		}
		

		public String getDOB() {
			String DOB = wb.getSheet("AutoForm").getRow(11).getCell(1).getStringCellValue();
			return DOB;
		}
		

		public String getPassword() {
			String Password = wb.getSheet("AutoForm").getRow(12).getCell(1).getStringCellValue();
			return Password;
		}
		

		public String getConfirmPassword() {
			String ConPass = wb.getSheet("AutoForm").getRow(13).getCell(1).getStringCellValue();
			return ConPass;
		}
		
		
	
}
		

		
		
		