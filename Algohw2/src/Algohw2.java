/**
 * @author Antonio Munoz
 * @version 01242017
 */

import java.util.Scanner;

public class Algohw2 {

	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String currentString = "";
		
		
		while(!currentString.equals("end")){
			System.out.println("\nPlease enter a String to reverse with recursion (type end to go to next step) :");	
			currentString = scan.nextLine().trim();
			
			if(!currentString.equals("end"))// "end" is my keyword sentinel I dont want it reversed
			recursive(currentString);
		}
		
		currentString = "";//reset the sentinel condition
		while(!currentString.equals("end")){
			System.out.println("\nPlease enter a String to reverse with iteratively (type end to go to next step) :");	
			currentString = scan.nextLine().trim();
			if(!currentString.equals("end"))// "end" is my keyword sentinel I dont want it reversed
			recursive(currentString);
		}
		
		System.out.println("Goodbye!"); // program ended message
		
	}
	/**
	 * recursively reverses a string
	 * @param currentString
	 * @return
	 */
	private static String recursive(String currentString){
		if(currentString.length() > 0){
			System.out.print(currentString.charAt(currentString.length() -1));
			recursive(currentString.substring(0, currentString.length()-1));
		}
		
		return null;		
		
	}
	/**
	 * iteratively reverses a String
	 * @param currentString
	 */
	private static void iterative(String currentString){
		
		for(int i = currentString.length(); i > 0; i--){
			
			System.out.print(currentString.charAt(i));
		}
		System.out.println(""); //print a new line for sake of formatting
		
	}
}
