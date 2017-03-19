package kalkulator;

public class Main {

	public static void main(String[] args) {		
		Menu menu = new Menu();
		
		while(true){
			menu.printMenu();
			String[] input = menu.scanInput();
			Problem[] solvedInput = Parser.parseArray(input);
			menu.writeSolutions(solvedInput);	
		}
		
		
	}

}
