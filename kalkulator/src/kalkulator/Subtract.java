package kalkulator;

public class Subtract extends Equotation implements Evaluable{

	Subtract(Evaluable left, Evaluable right){ super(left, right, Operations.SUBTRACT); }
	Subtract(int left, int right){ super(left, right, Operations.SUBTRACT); }
	Subtract(int left, Evaluable right){ super(left, right, Operations.SUBTRACT); }
	Subtract(Evaluable left, int right){ super(left, right, Operations.SUBTRACT); }

	@Override
	public int evaluate(){
		return this.left.evaluate() - this.right.evaluate();
	}

	@Override
	public Evaluable addRightOperation(Operations op, int number){
		if(op == Operations.ADD || op == Operations.SUBTRACT){
			return Factory.createEquotation(op, this, number);
		}
		
		this.right = this.right.addRightOperation(op, number);
		return this;
	}
}