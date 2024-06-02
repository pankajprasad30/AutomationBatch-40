package selenium.program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\Pankaj Prasad\\eclipse-workspace\\Selenium_Maven\\Excel_Sheet\\excel.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String un=w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(un);
		String pwd=w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(pwd);
		String password=NumberToTextConverter.toText(w1.getSheet("login").getRow(2).getCell(1).getNumericCellValue());
		System.out.println(password);
		     

	}

}
