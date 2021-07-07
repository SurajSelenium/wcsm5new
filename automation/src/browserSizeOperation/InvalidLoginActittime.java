package browserSizeOperation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFramework.Flib;

public class InvalidLoginActittime {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("InvalidCredentials");
		
		Flib flib = new Flib();
		int rc = flib.getRowCount("./data/Testdata.xlsx", "InvalidCredentials");
		
		for(int i=0;i<=rc;i++)
		{
			Row row = sh.getRow(i);
			for(int j=0;j<=1;j++)
			{
				Cell cell = row.getCell(j);
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
		

		
		

	}

}