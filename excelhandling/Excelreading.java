package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreading {

	public static void main(String[] args) {
		//using file class we need to define the source data
File src = new File("./test data/test data.xlsx");
try {
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook excel = new XSSFWorkbook(fis);
String row = excel.getSheetAt(0).getRow(0).getCell(0).toString();
System.out.println(row);
  String  col=    excel.getSheetAt(0).getRow(0).getCell(1).toString();
  System.out.println(col);


} catch (IOException e) {
	
	e.printStackTrace();
}





	}

}
