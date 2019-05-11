package com.demo.soham.selAuto.excelutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.demo.soham.selAuto.model.Step;
import com.demo.soham.selAuto.model.StepResource;

import SeleniumUtility.SeleniumUtil;

public class ExcelInteraction {

	 XSSFWorkbook workbook;
	 XSSFSheet spreadsheet ;
	
	public void addTestCase(List<Step> list, String name){
		this.workbook= new XSSFWorkbook();
		this.spreadsheet = workbook.createSheet("TestCaseSheet");
		int rowIndex=0;
		for (Step step : list) {
			rowIndex= step.addStep(spreadsheet,rowIndex);
		}
		
		 FileOutputStream out;
		try {
			out = new FileOutputStream(new File("S:\\dev files\\selenium excel files\\" + name +".xlsx"));
			 workbook.write(out);
		      out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	      //write operation workbook using file out object 
	     
	      System.out.println("createworkbook.xlsx written successfully");
		
	}
	
	
	public void runTestCase(String name) {
		  FileInputStream fis =null;
		
	      
	     try {
	    	 fis =new FileInputStream(new File("S:\\dev files\\selenium excel files\\" + name +".xlsx"));
			 workbook = new XSSFWorkbook(fis);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      XSSFSheet spreadsheet = workbook.getSheetAt(0);
	      int rowNum = spreadsheet.getPhysicalNumberOfRows();
	      SeleniumUtil su= new SeleniumUtil("webdriver.chrome.driver" ,"O:/codingSoftwares/chromedriver_win32/chromedriver.exe");
	      
	      for (int i = 0; i < rowNum; i++) {
	    	   XSSFRow row = spreadsheet.getRow(i);
	    	   String className =row.getCell(0).getStringCellValue();
	    	   Step step = StepResource.generateChildResource(row,className);
	    	   System.out.println(step);
	    	   step.perform(su);
	      }
	    
	      try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
