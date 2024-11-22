package unit1;
import java.util.Scanner;

public class IntegerVariable {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner (System.in);
		
         //decalre variables
         int length, width; 
         
         //get the user input
         System.out.println ("AREA PROGRAM");
         System.out.println ("Type in the length of the rectangle and <Enter>: ");
	     length = sc.nextInt ();
	     
	     System.out.println ("Type in the width of the rectangle and <Enter>: ");
	     width = sc.nextInt ();
	
	     //calculate the area
	     int area = length * width;
	     
	     //print the output
	     System.out.println ("The area of your rectangle is" + area);
         sc.close();
	
	}
	

}
