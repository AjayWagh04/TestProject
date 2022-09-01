package HandleExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {
	
	public void WriteExcelData(String excelPath, String sheetName, int rowCount, int cellCount, Date data) throws EncryptedDocumentException, IOException {
		
	FileInputStream fis = new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	Row row = sheet.getRow(rowCount);
	
	Cell cell = row.createCell(cellCount);
	cell.setCellValue(data);
	
	FileOutputStream fos = new FileOutputStream(excelPath);
	wb.write(fos);
	
	
	
	
		
	}

}
