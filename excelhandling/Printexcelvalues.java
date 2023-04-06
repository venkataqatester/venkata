package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Printexcelvalues {

	

	public static void main(String[] args) {
File src =new  File("./test data/test data.xlsx");
try {
	FileInputStream fis = new FileInputStream(src);
try {
	XSSFWorkbook xl = new XSSFWorkbook(fis);
	int count= xl.getSheetAt(0).getLastRowNum()+1;
	for(int i=0;i<count;i++)
	{
	String row=	xl.getSheetAt(0).getRow(i).getCell(0).toString();
	String col=xl.getSheetAt(0).getRow(i).getCell(1).toString();
	System.out.println(row+" "+col);
	}
	xl.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

	
		
	}

	
	


