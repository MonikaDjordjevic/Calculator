package kalkulator;

import java.lang.String;

public class Parser{
	public static Evaluable parse(String napis){
		napis = napis.replaceAll("\\s+", "");
		napis = napis.replaceAll("\\s+", "");
		String[] parts = napis.split("(?<=\\+)|(?=\\+)|(?<=-)|(?=-)|(?<=\\*)|(?=\\*)|(?<=/)|(?=/)");
		
		
		if(parts.length == 1) return new Singleton(parts[0]);
		
		Evaluable result = Factory.createEquotation(parts[1], parts[0], parts[2]);
		
		for(int i = 3; i < parts.length; i+=2){
			String op = parts[i];
			String number = parts[i+1];
			
			result = result.addRightOperation(op, number);
			
		}
		
		return result;
	}
	
	public static Problem[] parseArray(String[] arr){
		Problem[] result = new Problem[arr.length];
		
		for(int i = 0; i < arr.length; i++){
			result[i] = new Problem(arr[i]);
		}
		
		return result;
	}
}