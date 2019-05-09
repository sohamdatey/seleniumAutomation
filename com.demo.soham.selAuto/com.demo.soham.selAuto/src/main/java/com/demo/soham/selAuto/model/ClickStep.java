package com.demo.soham.selAuto.model;

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
	public void addStep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "ClickStep [xpath=" + xpath + "]";
	}
	
	
	
	
	
	
	

}
