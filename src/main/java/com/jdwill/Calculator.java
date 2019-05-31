package com.jdwill;

public class Calculator {
	
	public int calculate(Command command) {
		return command.execute();
	}

}
