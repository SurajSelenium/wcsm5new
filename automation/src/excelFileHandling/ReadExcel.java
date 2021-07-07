package excelFileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//How to read the excel file
public class ReadExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");// location where the file is stored
		Workbook wb = WorkbookFactory.create(fis);//create method is used to make the file ready for the read operation
		Sheet sh = wb.getSheet("ValidCredentials");//the sheet in which data is present
		Row row = sh.getRow(1);//the row in which data is present
		Cell cell = row.getCell(0);// the cell in which data is present
		String data = cell.getStringCellValue();//to get the string present in the specified cell
		System.out.println(data);//print the data in the console
	}

}
