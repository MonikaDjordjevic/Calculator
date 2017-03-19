package kalkulator;

public interface Evaluable{
	int evaluate();
	Evaluable addRightOperation(Operations op, int number);
	default Evaluable addRightOperation(String op, String number){
		return addRightOperation(Operations.parse(op), Integer.valueOf(number));
	};
	default Evaluable addRightOperation(Operations op, String number){
		return addRightOperation(op, Integer.valueOf(number));
	};
	default Evaluable addRightOperation(String op, int number){
		return addRightOperation(Operations.parse(op), number);
	};
}