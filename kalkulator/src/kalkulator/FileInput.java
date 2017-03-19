package kalkulator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileInput implements Input {

	public static final String FILENAME = "C:\\Users\\Tomasz\\workspace\\kalkulator\\inputs\\test.txt.txt";

	
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
		
		
		BufferedReader br = null;
		FileReader fr = null;
		DynamicStringArray result = new DynamicStringArray();
		
		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILENAME));

			while ((sCurrentLine = br.readLine()) != null) {
				result.add(sCurrentLine);
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		
		
		return result.toArray();

	}
}
