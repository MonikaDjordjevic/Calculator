package kalkulator;

public class Singleton implements Evaluable{
	private int value;

	Singleton(int value){
		this.value = value;
	}
	
	Singleton(String value){
		this.value = Integer.valueOf(value);
	}


	@Override
	public int evaluate(){
		return this.value;
	}
	
	@Override
	public Evaluable addRightOperation(Operations op, int number){
		return Factory.createEquotation(op, this, number);
	}
}