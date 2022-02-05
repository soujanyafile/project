package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;

public class ToReadExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream fis=new FileInputStream("./TestResource/Testdata.xls");
	 Workbook workbook=WorkbookFactory.create(fis);
	 boolean data = workbook.getSheet("sheet1").getRow(1).getCell(1).getBooleanCellValue();
	System.out.println(data);
	if(data) {
		
	}
	
	}

}
