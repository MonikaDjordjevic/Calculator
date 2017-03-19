package kalkulator;

public class Add extends Equotation implements Evaluable{

	Add(Evaluable left, Evaluable right){ super(left, right, Operations.ADD); }
	Add(int left, int right){ super(left, right, Operations.ADD); }
	Add(int left, Evaluable right){ super(left, right, Operations.ADD); }
	Add(Evaluable left, int right){ super(left, right, Operations.ADD); }

	@Override
	public int evaluate(){
		return this.left.evaluate() + this.right.evaluate();
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