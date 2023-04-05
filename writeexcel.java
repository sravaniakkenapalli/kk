package javaproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcel {

	public static void main(String[] args) throws IOException {
		
		File Excel= new File("C:\\Users\\srika\\Documents\\Downloads\\first.xlsx");
				
		XSSFWorkbook WorkBook = new XSSFWorkbook();
		XSSFSheet Sheet= WorkBook.createSheet("Details1");
		
		Sheet.createRow(0);
		
		Sheet.getRow(0).createCell(0).setCellValue("Name");
		Sheet.getRow(0).createCell(1).setCellValue("designation");
		Sheet.getRow(0).createCell(2).setCellValue("salary");
		
		Sheet.createRow(1);
		
		Sheet.getRow(1).createCell(0).setCellValue("harithe");
		Sheet.getRow(1).createCell(1).setCellValue("abcd");
		Sheet.getRow(1).createCell(2).setCellValue("16000");
		
		Sheet.createRow(2);
		
		Sheet.getRow(2).createCell(0).setCellValue("shalini");
		Sheet.getRow(2).createCell(1).setCellValue("xyre");
		Sheet.getRow(2).createCell(2).setCellValue("12000");
		FileOutputStream fos = new FileOutputStream(Excel);
		WorkBook.write(fos);
		WorkBook.close();
	
	}



	}


