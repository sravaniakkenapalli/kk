package javaproject;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		
String Excelpath = ("C:\\Users\\srika\\Documents\\second.xlsx");
FileInputStream fis = new FileInputStream(Excelpath);
@SuppressWarnings("resource")
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet Sheet = workbook.getSheet("Details2");
int rows = Sheet.getLastRowNum();
int cols =Sheet.getRow(1).getLastCellNum();
for( int r=0; r<=rows; r++)
{

XSSFRow a= Sheet.getRow(r);

for(int c=0;c<cols;c++)
{
	XSSFCell b = a.getCell(c);
	
switch(b.getCellType())
{
	case NUMERIC:
	System.out.println(b.getNumericCellValue());
	break;
	
	case STRING:
	System.out.println(b.getStringCellValue());
	break;
default:
	break;
}
	}
}
	
}

	
}








	


