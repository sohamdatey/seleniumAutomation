package com.demo.soham.selAuto.model;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleStep implements Step {

	
	String xpath;
	String expectedValue;
	String textSample;
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
	public String getTextSample() {
		return textSample;
	}
	public void setTextSample(String textSample) {
		this.textSample = textSample;
	}
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int addStep(XSSFSheet spreadsheet,int rowIndex) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
