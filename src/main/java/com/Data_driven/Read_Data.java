package com.Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void Particular_Data() throws IOException {
		System.out.println("--------get induviual data-------");
		File f = new File(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Mini_project_Oct_30_Maven\\Excel_players.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);

		}

	}

	public static void all_data() throws Throwable {
		System.out.println("------get all data-------");

		File f = new File(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Mini_project_Oct_30_Maven\\Excel_players.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);

				} else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int value =  (int) numericCellValue;
					System.out.println(value);

				}
			}
		}

	}

	public static void Induvidual_column() throws Throwable {
		System.out.println("----column-data----");
		File f = new File(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Mini_project_Oct_30_Maven\\Excel_players.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(1);
			CellType cellType = cell.getCellType();
			
			
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);
			}
		}

	}

	public static void Induvidual_row() throws Throwable {
		System.out.println("------row data------");
		File f = new File(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Mini_project_Oct_30_Maven\\Excel_players.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(0);
		int numberOfCells = row.getPhysicalNumberOfCells();

		for (int j = 0; j < numberOfCells; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();

			if (cellType.equals(CellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);

			} else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value = (int) numericCellValue;
				System.out.println(value);

			}
		}
	}

	public static void main(String[] args) throws Throwable {
		Particular_Data();
		all_data();
		Induvidual_row();
		Induvidual_column();
	}

}
