package DatadrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	//generic reusable method
	public String ReadExelData(String exelPath,String sheetname,int rowCount,int cellCount) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(exelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet Sheet = wb.getSheet(sheetname);
		Row row = Sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
			
		
	}

}
