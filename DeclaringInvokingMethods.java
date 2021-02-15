
/*Declaring and Invoking Methods
1.	Sign of Integer
Create a method that prints the sign of an integer number.
Example
Input	Output
2	The number 2 is positive.
-5	The number -5 is negative.
0	The number 0 is zero.
 * */

import java.util.Scanner;
public class DeclaringInvokingMethods {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	     
		 int numberPositiveNegativ = Integer.parseInt(scanner.nextLine());
	        System.out.print("The number ");

	        printPositiveNumber(numberPositiveNegativ);
    
	    }
	    private static void printPositiveNumber(int numberPositiveNegativ) {
	        	   if (numberPositiveNegativ>0){
	            System.out.print(numberPositiveNegativ+" is positive.");
	        } else if (numberPositiveNegativ<0) {
	        	System.out.print(numberPositiveNegativ+" is positive.");
			} else {
				System.out.print(numberPositiveNegativ+" is zero.");
			}

	    }
}
