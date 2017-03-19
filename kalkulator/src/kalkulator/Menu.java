package kalkulator;
import java.util.Scanner;


public class Menu {
	public void printMenu(){
		
		System.out.println("============================");
        System.out.println("|     MENU Calculator      |");
        System.out.println("============================");
        System.out.println("| Choose wisely:           |");
        System.out.println("|        0. For tryhards   |");
        System.out.println("|        pass data yourself|");
        System.out.println("|                          |");
        System.out.println("|        1. For lazy       |");
        System.out.println("|        pass a file       |");
        System.out.println("|                          |");
        System.out.println("|        2. Quit           |");
        System.out.println("|        Already going? :( |");
        System.out.println("============================");		
        
	}
	
	public String[] scanInput(){
		Scanner scanner = new Scanner(System.in);
		int inputFromUser = scanner.nextInt();
		
		Input input = null;
		
		switch(inputFromUser){
			case 0:
				input = new ConsoleInput();
				break;
			case 1:
				input = new FileInput();
				break;
			case 2:
			default: 
				System.out.println("I finish program, bye bye.");
				System.exit(0);
				break;
		}
		
		
		input.promptInstructions();
		return input.getInput();
	}
	
	public void writeSolutions(Problem[] probs){
		System.out.println("============================");
        System.out.println("|          Wyniki          |");
        System.out.println("============================");
		for(int i = 0; i < probs.length; i++){
			System.out.println(probs[i]);
		}		
	}
	
}
