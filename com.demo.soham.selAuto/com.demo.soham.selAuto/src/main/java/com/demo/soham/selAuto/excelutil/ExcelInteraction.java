package com.demo.soham.selAuto.excelutil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.demo.soham.selAuto.model.Step;

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
			out = new FileOutputStream(new File("S:\\dev files\\selenium excel files\\" + name));
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
	
	
}
