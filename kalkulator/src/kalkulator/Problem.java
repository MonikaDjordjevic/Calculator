package kalkulator;

public class Problem{

	private String equotation;
	private Evaluable solution;


	Problem(String equotation){
		this.equotation = equotation;
		this.solution = Parser.parse(equotation);
	}

	@Override
	public String toString(){
		return this.equotation + " = " + this.solution.evaluate();
	}

}