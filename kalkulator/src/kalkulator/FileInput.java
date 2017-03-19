package kalkulator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInput implements Input {

	public static final String PATH = "inputs\\";

	
	public void promptInstructions(){
		System.out.println("============================");
        System.out.println("|       Add your file      |");
        System.out.println("============================");
        System.out.println("|                          |");
        System.out.println("|  Place file in inputs    |");
        System.out.println("|        directory         |");
        System.out.println("|                          |");
        System.out.println("|  And write down its name |");
        System.out.println("|     with extension       |");
        System.out.println("|                          |");
        System.out.println("|                          |");
        System.out.println("============================");	
	}
	
	
	
	public String[] getInput(){
		
		Scanner scanner = new Scanner(System.in);
		String file = scanner.nextLine();
		
		String filename = PATH + file;
		
		
		BufferedReader br = null;
		FileReader fr = null;
		DynamicStringArray result = new DynamicStringArray();
		
		try{
			String sCurrentLine;

			br = new BufferedReader(new FileReader(new File(filename)));
			
			while ((sCurrentLine = br.readLine()) != null) {
				result.add(sCurrentLine);
			}
			
			fr = new FileReader(filename);
			br = new BufferedReader(fr);
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
