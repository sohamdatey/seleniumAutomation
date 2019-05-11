package com.demo.soham.selAuto.model;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import SeleniumUtility.SeleniumUtil;

public class ReadStep extends Step {
	
	String xpath;
	String expectedValue;
	

	public String getXpath() {
		return xpath;
	}

	public ReadStep setXpath(String xpath) {
		this.xpath = xpath;
		return this;
	}

	public String getExpectedValue() {
		return expectedValue;
	}

	public ReadStep setExpectedValue(String expectedValue) {
		this.expectedValue = expectedValue;
		return this;
	}

	@Override
	public void perform(SeleniumUtil su) {
		su.openUrl("https://angular.io/");
        
        if(su.readTest(xpath, expectedValue)) {
        	System.out.println("true");
        }

	}

	@Override
	public int addStep(XSSFSheet spreadsheet,int rowIndex) {
	  
		XSSFRow row=spreadsheet.createRow(rowIndex++);
		row.createCell(0).setCellValue(this.getClass().getName());
		row.createCell(1).setCellValue(this.getXpath());
		row.createCell(2).setCellValue(this.getExpectedValue());
        return rowIndex;
	}

	@Override
	public String toString() {
		return "ReadStep [xpath=" + xpath + ", expectedValue=" + expectedValue + "]";
	}
	
	
	

}
