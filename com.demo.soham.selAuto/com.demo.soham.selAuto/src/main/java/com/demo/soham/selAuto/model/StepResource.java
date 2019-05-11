package com.demo.soham.selAuto.model;

import org.apache.poi.xssf.usermodel.XSSFRow;

public class StepResource {

	Step step;
	
	public Step getStep() {
		return step;
	}
	public void setStep(Step step) {
		this.step = step;
	}
	
	static public Step generateChildResource(XSSFRow row, String className) {
		
		
		if(ReadStep.class.getName().equals(className)) {
			return new ReadStep().setXpath(row.getCell(1).getStringCellValue()).setExpectedValue(row.getCell(2).getStringCellValue());
		}
		else {
			return new ClickStep().setXpath(row.getCell(1).getStringCellValue());
		}
		
		
	}
	
	
}
