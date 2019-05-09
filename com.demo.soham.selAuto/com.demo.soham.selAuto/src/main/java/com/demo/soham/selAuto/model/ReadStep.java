package com.demo.soham.selAuto.model;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ReadStep implements Step {
	
	String xpath;
	String expectedValue;
	

	public String getXpath() {
		return xpath;
	}

	public void setXpath(String xpath) {
		this.xpath = xpath;
	}

	public String getExpectedValue() {
		return expectedValue;
	}

	public void setExpectedValue(String expectedValue) {
		this.expectedValue = expectedValue;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub

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
