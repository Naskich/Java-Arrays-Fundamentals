
/*10.	Multiply Evens by Odds
Create a program that reads an integer number and multiplies 
the sum of all its even digits by the sum of all its odd digits:
Examples
Input	Output	Comments
12345	54	12345 has 2 even digits - 2 and 4. Even digits have sum of 6.
Also it has 3 odd digits - 1, 3 and 5. Odd digits have sum of 9.
Multiply 6 by 9 and you get 54.
-12345	54	
 * */
import java.util.Scanner;
public class MultiplyEvensOdds {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        String simbolNumbers = scanner.nextLine();
	        if (simbolNumbers.contains("-")) {
	            simbolNumbers = simbolNumbers.replaceFirst("-", "");
	        } else {
	             simbolNumbers=simbolNumbers;
	        }
	        int sumEvens = 0;
	        int sumOdds = 0;
	        int[] num = new int[simbolNumbers.length()];
	        declareNumbersEventOdd(simbolNumbers, num);
	        numbersEventOdd(sumEvens, sumOdds, num);
	    }
	    public static void declareNumbersEventOdd(String simbolNumbers,int[]num) {
	        char[] numbers = new char[simbolNumbers.length()];
	        numbers = simbolNumbers.toCharArray();
	        for (int i = 0; i < simbolNumbers.length(); i++) {
	            num[i] = Integer.parseInt(String.valueOf(numbers[i]));
	        }
	    }
	    public static void numbersEventOdd(int sumEvens, int sumOdds,int[]num){
	        for (int i = 0; i < num.length; i++) {
	            if (num[i]%2==0){
	                sumEvens += num[i];
	            } else {
	                sumOdds += num[i];
	            }
	        }
	        int lastSumEvensOdd = sumEvens * sumOdds;
	        System.out.println(lastSumEvensOdd);
	    }
	}