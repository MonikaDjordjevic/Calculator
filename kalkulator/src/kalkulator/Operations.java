package kalkulator;

public enum Operations {
	ADD, MULTIPLY, SUBTRACT, DIVIDE, SINGLETON;
	
	public static Operations parse(String op){
		switch(op){
			case "+":
				return Operations.ADD;
			case "-":
				return Operations.SUBTRACT;
			case "*":
				return Operations.MULTIPLY;
			case "/":
				return Operations.DIVIDE;
			default:
				return Operations.SINGLETON;
		}
	}
}
