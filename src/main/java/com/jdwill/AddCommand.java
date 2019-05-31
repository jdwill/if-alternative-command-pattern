package com.jdwill;

public class AddCommand implements Command {
	
	private int firstAddend;
	
	private int secondAddend;
	
	private static final String SYMBOL = "+";
	
	public AddCommand(int firstAddend, int secondAddend) {
		this.firstAddend = firstAddend;
		this.secondAddend = secondAddend;
	}

	public Integer execute() {
		return firstAddend + secondAddend;
	}
	
	public String getSymbol() {
		return SYMBOL;
	}

}
