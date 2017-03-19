package kalkulator;

public class Multiply extends Equotation implements Evaluable{

	Multiply(Evaluable left, Evaluable right){ super(left, right, Operations.MULTIPLY); }
	Multiply(int left, int right){ super(left, right, Operations.MULTIPLY); }
	Multiply(int left, Evaluable right){ super(left, right, Operations.MULTIPLY); }
	Multiply(Evaluable left, int right){ super(left, right, Operations.MULTIPLY); }

	@Override 
	public int evaluate(){
		return this.left.evaluate() * this.right.evaluate();
	}
	
	@Override
	public Evaluable addRightOperation(Operations op, int number){
		if(op == Operations.ADD || op == Operations.SUBTRACT
				|| op == Operations.MULTIPLY || op == Operations.DIVIDE){
			return Factory.createEquotation(op, this, number);
		}
		
		this.right = this.right.addRightOperation(op, number);
		return this;
	}

}