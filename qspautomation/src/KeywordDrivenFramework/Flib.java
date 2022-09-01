package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	//generic reusable method to read the Excel Data
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}
	
	 // Generic reusable method to get the Row count
     public int getRowCount (String excelPath,String sheetName) throws EncryptedDocumentException, IOException {
		
    	FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		
		int gl = sheet.getLastRowNum();
		return gl; 
     }

     // Generic reusable method to write the data in excel file 
     public void writeDataExcel(String excelPath,String sheetName,int rowCount,int cellCount, Date data) throws EncryptedDocumentException, IOException {
    	 
    	 FileInputStream fis = new FileInputStream(excelPath);
    	 Workbook wb = WorkbookFactory.create(fis); //make file ready for read operation
    	 Sheet sheet = wb.getSheet(sheetName); //go to the specified sheet
    	 Row row = sheet.getRow(rowCount); //go to the specified row
    	 
    	 Cell cell = row.createCell(cellCount); //create cell
    	 cell.setCellValue(data); // send the data
    	 
    	 FileOutputStream fos = new FileOutputStream(excelPath); // Specified path of excel
    	 wb.write(fos); //write the data
     }
     
     // read the Data from properties
     public String ReadpropertiesData(String propPath, String key) throws IOException {
		
    	FileInputStream fis = new FileInputStream(propPath);
    	
    	Properties prop = new Properties();
    	           prop.load(fis);
    	String value = prop.getProperty(key);
    	return value;
    	
	}
}
    	 
    	 
    	
    	 
    	 
    	 
        
     
    
  
  
 
  
  
  
  
  
  
  
  
  
  
  
  
  
