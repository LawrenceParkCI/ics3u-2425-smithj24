package unit1;

import java.util.Scanner;

public class StringManipulation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.println("Type in a sentence, and press enter>");
		s = sc.nextLine();
		System.out.println("This is the string normally");
		System.out.println(s);
		System.out.println("This is the string in uppercase letters");
		System.out.println((s.toUpperCase()));
		System.out.println("This is the string in lowercase letters");
		System.out.println((s.toLowerCase()));
		System.out.println("This is the length of the string");
		System.out.println((s.length()));
		System.out.println("This is the character at index 5");
		System.out.println(s.charAt(5));
		sc.close();
		
		
		
		//getting the first and last space
		int firstSpace = s.indexOf(" ");
		int lastSpace = s.lastIndexOf(" ");
		//first and last word
		System.out.println("Type in a letter, and press enter>");
		s = sc.nextLine();
		System.out.println("This is the first word of the output");
		firstSpace=sc.nextInt();
		System.out.println("This is the last letter of the output");
	    lastSpace=sc.nextInt();
		sc.close();
		
	}

}
