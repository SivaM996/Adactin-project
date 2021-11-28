package com.createData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\91733\\Desktop\\Write_project.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet createSheet = wb.createSheet("credentials");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Email");
		wb.getSheet("credentials").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("credentials").createRow(1).createCell(0).setCellValue("Ganesh@123");
		wb.getSheet("credentials").getRow(1).createCell(1).setCellValue("serty@12");
		wb.getSheet("credentials").createRow(2).createCell(0).setCellValue("bhagath@123");
		wb.getSheet("credentials").getRow(2).createCell(1).setCellValue("bagathkmycu");
		wb.getSheet("credentials").createRow(3).createCell(0).setCellValue("kamesh@12346gu");
		wb.getSheet("credentials").getRow(3).createCell(1).setCellValue("kames12345");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("-----------success-----------");
	}

}
