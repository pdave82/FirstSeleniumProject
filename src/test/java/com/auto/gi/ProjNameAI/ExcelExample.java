package com.auto.gi.ProjNameAI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateMyExcel();
		
	}
	
		public static void CreateMyExcel()
		{
			Workbook oldExcel = new HSSFWorkbook();
			//Workbook oldExcel = new XSSFWorkbook();
			
			Sheet firstSheet = oldExcel.createSheet("FirstSheet");
			
			Row myRow = firstSheet.createRow(0);
			
			Cell myCell = myRow.createCell(0);
			
			myCell.setCellValue("My name is Pranav");
			
			try {
				OutputStream fileOut = new FileOutputStream("oldExcel.xls");
				oldExcel.write(fileOut);
				oldExcel.close();
				fileOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}	
		
		public static void ReadmyExcel()
		{
			try {
				InputStream fileIn = new FileInputStream("oldExcel.xls");
			
				Workbook myExcel = new XSSFWorkbook(fileIn);
						
				System.out.println(myExcel.getSheetName(0));
				
				Sheet mySheet = myExcel.getSheet("FirstSheet");
				
				System.out.println("getLastRownum =" + mySheet.getLastRowNum());
				
				System.out.println("getLastRownum =" + mySheet.getPhysicalNumberOfRows());
				
				System.out.println("getLastRownum =" + mySheet.getRow(0).getPhysicalNumberOfCells());
				
				int rowCount = mySheet.getLastRowNum();
				
				for(int i=0; i<= rowCount; i++)
				{
					int colCount = mySheet.getRow(i).getLastCellNum();
					
					for(int j=0; j<colCount; j++)
					{
						if(mySheet.getRow(i) != null)
							if(mySheet.getRow(i).getCell(j) != null)
								System.out.println("cell (" + i + "," + j + ") :- " + mySheet.getRow(i).getCell(j).getStringCellValue());
					}
				}
				System.out.println(mySheet.getRow(0).getCell(0).getStringCellValue());

			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	

