package kalkulator;


public class Equotation {

	protected Evaluable left;
	protected Evaluable right;
	protected Operations type;
	
	Equotation(Evaluable left, Evaluable right, Operations type){
		this.left = left;
		this.right = right;
		this.type = type;
	}
	Equotation(int left, int right, Operations type){
		this(new Singleton(left), new Singleton(right), type);
	}
	Equotation(int left, Evaluable right, Operations type){
		this(new Singleton(left), right, type);
	}
	Equotation(Evaluable left, int right, Operations type){
		this(left, new Singleton(right), type);
	}
}