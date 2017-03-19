package kalkulator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Evaluable z = new Singleton(5);
		Evaluable x = new Singleton(3);
		Evaluable c = new Multiply(z, x);
		Evaluable v = new Add(z, c);
		
		System.out.println(v.evaluate());
		
		String test = "2+ 3 *2 -5 +10*2";
		//String test = "2+3*2-5";
		
		Evaluable q = Parser.parse(test);
		System.out.println(q.evaluate());
		
		Menu menu = new Menu();
		
		while(true){
			menu.printMenu();
			String[] input = menu.scanInput();
			Problem[] solvedInput = Parser.parseArray(input);
			menu.writeSolutions(solvedInput);	
		}
		
		
	}

}
