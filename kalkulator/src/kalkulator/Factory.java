package kalkulator;

public class Factory {
	public static Evaluable createEquotation(Operations op, Evaluable x1, Evaluable x2){
		Evaluable result = null;
		switch(op){
			case ADD:
				result = new Add(x1, x2);
				break;
			case SUBTRACT:
				result = new Subtract(x1, x2);
				break;
			case MULTIPLY:
				result = new Multiply(x1, x2);
				break;
			case DIVIDE:
				result = new Divide(x1, x2);
				break;
		}
		
		return result;
	}
	
	public static Evaluable createEquotation(Operations op, String x1, String x2){
		return Factory.createEquotation(op, new Singleton(x1), new Singleton(x2));
	}
	public static Evaluable createEquotation(String op, String x1, String x2){
		return Factory.createEquotation(Operations.parse(op), new Singleton(x1), new Singleton(x2));
	}
	public static Evaluable createEquotation(Operations op, int x1, int x2){
		return Factory.createEquotation(op, new Singleton(x1), new Singleton(x2));
	}
	public static Evaluable createEquotation(Operations op, Evaluable x1, int x2){
		return Factory.createEquotation(op, x1, new Singleton(x2));
	}
	public static Evaluable createEquotation(Operations op, int x1, Evaluable x2){
		return Factory.createEquotation(op, new Singleton(x1), x2);
	}
	
}
