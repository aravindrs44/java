package com.aravind.calculator;

public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operation;
	
	public Calculator(double operandOne, double operandTwo, String operation) {
		this.setOperandOne(operandOne);
		this.setOperandTwo(operandTwo);
		this.setOperation(operation);
	}

	public double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}

	public double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	private double performOperation() {
		double temp = Double.NaN;
		if(this.operation == "+") {
			temp = this.getOperandOne() + this.getOperandTwo();
		} else if(this.operation == "-") {
			temp = this.getOperandOne() - this.getOperandTwo();
		}
		return temp;
	}
	
	public void getResults() {
		System.out.println(this.performOperation());
	}
	
}
