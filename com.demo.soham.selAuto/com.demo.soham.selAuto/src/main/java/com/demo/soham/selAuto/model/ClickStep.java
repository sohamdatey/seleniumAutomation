package com.demo.soham.selAuto.model;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import SeleniumUtility.SeleniumUtil;

public class ClickStep extends  Step{

	String xpath;
	
	public String getXpath() {
		return xpath;
	}

	public ClickStep setXpath(String xpath) {
		this.xpath = xpath;
		return this;
	}

	@Override
	public void perform(SeleniumUtil su) {
		su.clickTest(xpath);
		
	}

	@Override
	public int addStep(XSSFSheet spreadsheet,int rowIndex) {
		
		XSSFRow row=spreadsheet.createRow(rowIndex++);
		row.createCell(0).setCellValue(this.getClass().getName());
		row.createCell(1).setCellValue(this.getXpath());
        return rowIndex;
	}

	@Override
	public String toString() {
		return "ClickStep [xpath=" + xpath + "]";
	}
	
	
	
	
	
	
	

}
