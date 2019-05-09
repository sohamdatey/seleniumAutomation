package com.demo.soham.selAuto.model;

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
	public void addStep() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "ReadStep [xpath=" + xpath + ", expectedValue=" + expectedValue + "]";
	}
	
	
	

}
