package com.demo.soham.selAuto.model;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClickStep implements Step{

	String xpath;
	
	public String getXpath() {
		return xpath;
	}

	public void setXpath(String xpath) {
		this.xpath = xpath;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int addStep(XSSFSheet spreadsheet,int rowIndex) {
		
		
		return 0;
	}

	@Override
	public String toString() {
		return "ClickStep [xpath=" + xpath + "]";
	}
	
	
	
	
	
	
	

}
