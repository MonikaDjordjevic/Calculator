package kalkulator;
import java.util.Scanner;
import java.util.*;


public class ConsoleInput implements Input {
	
	public void promptInstructions(){
		System.out.println("============================");
        System.out.println("|  Write your equotations  |");
        System.out.println("============================");
        System.out.println("|                          |");
        System.out.println("|  Use only numbers and    |");
        System.out.println("|        symbols + - * /   |");
        System.out.println("|                          |");
        System.out.println("|  When you want to finish |");
        System.out.println("|     write  koniec        |");
        System.out.println("|                          |");
        System.out.println("|                          |");
        System.out.println("============================");		
	}
	
	public String[] getInput(){
		Scanner scanner = new Scanner(System.in);
		String inputFromUser = scanner.nextLine();
		DynamicStringArray result = new DynamicStringArray();
		String[] resultArray = null;
		
		result.add(inputFromUser);
		int i = 1;
		
		while(!inputFromUser.endsWith("koniec")){
			inputFromUser = scanner.nextLine();
			result.add(inputFromUser);
			i++;
		}
		i--;
		if(result.get(i).equals("koniec")){
			result.remove(i);
		} else {
			result.set(i, result.get(i).replaceAll("koniec", ""));	
		}
		resultArray = result.toArray();
		
		scanner.close();
		return resultArray;		
	}
}
