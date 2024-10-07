package unit1;
import java.util.Scanner;

public class RectangleArea {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner (System.in);
		
         //declare variables
         int length, width, depth;
         
         //get the user input
         System.out.println ("AREA PROGRAM");
         System.out.println ("Type in the length of the cube and <Enter>: ");
	     length = sc.nextInt ();
	     
	     System.out.println ("Type in the width of the cube and <Enter>: ");
	     width = sc.nextInt ();
	
	     System.out.println ("Type in the depth of the cube and <Enter>: ");
	     
	     //calculate the area
	     int volume = length * width * depth;
	     
	     //print the output
	     System.out.println ("The volume of your cube is" + volume);
         sc.close();
	
         
	}
	

}
