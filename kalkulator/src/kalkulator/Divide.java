package kalkulator;

public class Divide extends Equotation implements Evaluable{

	Divide(Evaluable left, Evaluable right){ super(left, right, Operations.DIVIDE); }
	Divide(int left, int right){ super(left, right, Operations.DIVIDE); }
	Divide(int left, Evaluable right){ super(left, right, Operations.DIVIDE); }
	Divide(Evaluable left, int right){ super(left, right, Operations.DIVIDE); }

	@Override 
	public int evaluate(){
		return (int)(this.left.evaluate() / this.right.evaluate());
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