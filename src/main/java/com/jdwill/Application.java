package com.jdwill;

public class Application {
	
	public static void main(String[] args) {
		int firstAddend = 3;
		int secondAddend = 2;
		Command command = new MultiplyCommand(firstAddend, secondAddend);
		
		Calculator calculator = new Calculator();
		int result = calculator.calculate(command);
		
		System.out.println(firstAddend + " " + command.getSymbol() + " " + secondAddend + " = " + result);
	}

}
