package com.IBA;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Logindata_Excel {
	static String projectpath;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	public static void main(String[] args) {
		//getRowCount();
		gectcelldata();
	}

	public static void getRowCount() {
		
		try {
			projectpath =  System.getProperty("user.dir");
			wb = new XSSFWorkbook(projectpath+"/Excel/data.xlsx");
			sheet = wb.getSheetAt(0); 
			int rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("No. of rows:"+rowcount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println();
		}
		
		
		
			
		}
		
	public static void gectcelldata() {
		projectpath =  System.getProperty("user.dir");
		try {
			wb = new XSSFWorkbook(projectpath+"/Excel/data.xlsx");
			sheet = wb.getSheetAt(0); 
			String cellData=sheet.getRow(1).getCell(0).getStringCellValue();
			System.out.println(cellData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
}
