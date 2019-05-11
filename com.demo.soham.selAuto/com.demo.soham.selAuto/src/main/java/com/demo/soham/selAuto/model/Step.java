package com.demo.soham.selAuto.model;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import SeleniumUtility.SeleniumUtil;

@JsonTypeInfo(
		  use = JsonTypeInfo.Id.NAME, 
		  include = JsonTypeInfo.As.PROPERTY, 
		  property = "type")
		@JsonSubTypes({ 
		  @Type(value = ReadStep.class, name = "ReadStep"), 
		  @Type(value = ClickStep.class, name = "ClickStep"),
		  @Type(value = SampleStep.class, name = "SampleStep") 
		})
public abstract  class Step {

	abstract public void perform(SeleniumUtil su);
	abstract public int addStep(XSSFSheet spreadsheet,int rowIndex);
}
