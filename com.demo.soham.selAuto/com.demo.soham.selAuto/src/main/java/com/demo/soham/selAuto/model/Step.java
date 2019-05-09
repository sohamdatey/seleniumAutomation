package com.demo.soham.selAuto.model;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
		  use = JsonTypeInfo.Id.NAME, 
		  include = JsonTypeInfo.As.PROPERTY, 
		  property = "type")
		@JsonSubTypes({ 
		  @Type(value = ReadStep.class, name = "ReadStep"), 
		  @Type(value = ClickStep.class, name = "ClickStep"),
		  @Type(value = SampleStep.class, name = "SampleStep") 
		})
public interface Step {

	void perform();
	 int addStep(XSSFSheet spreadsheet,int rowIndex);
}
