
package com.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Utils {
	
	    //Store all commonly used methods for method reusablity purpose 
		static String filepath="./src/main/java/testdata/Book2.xlsx";
		public static String[][] setdata(String sheetName) throws Throwable{
			
			File file=new File(filepath);
			FileInputStream fin=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(fin);
			XSSFSheet sheet=workbook.getSheet(sheetName);
			
			int rows=sheet.getPhysicalNumberOfRows();
			System.out.println(rows);
			int cols=sheet.getRow(1).getLastCellNum();
			String[][] data=new String[rows-1][cols];
			
			for(int i=0;i<rows-1;i++) {
				for(int j=0;j<cols;j++) {
					DataFormatter df=new DataFormatter();
					data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
					System.out.println(data[i][j]);
				}
			}
			
			fin.close();
			workbook.close();
			return data;
		}	
	}
			
		