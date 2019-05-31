package com.jdwill;

public class MultiplyCommand implements Command {
	
	private int multiplicand;
	
	private int multiplicator;
	
	private static final String SYMBOL = "*";
	
	public MultiplyCommand (int multiplicand, int multiplicator) {
		this.multiplicand = multiplicand;
		this.multiplicator = multiplicator;
	}
	
	public Integer execute() {
		return multiplicand * multiplicator;
	}
	
	public String getSymbol() {
		return SYMBOL;
	}
	
	

}
