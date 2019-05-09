package com.demo.soham.selAuto.model;

public class StepResource {

	Step step;
	String occurence;
	public Step getStep() {
		return step;
	}
	public void setStep(Step step) {
		this.step = step;
	}
	public String getOccurence() {
		return occurence;
	}
	public void setOccurence(String occurence) {
		this.occurence = occurence;
	}
	@Override
	public String toString() {
		return "StepResource [step=" + step + ", occurence=" + occurence + "]";
	}
	
	
	
	
}
