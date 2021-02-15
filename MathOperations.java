
/*Math Operations
Write a method that receives two numbers and an operator,
 calculates the result and returns it. You will be given three lines of input.
 The first will be the first number, the second one will be the operator and
 the last one will be the second number. The possible operators are: / * + -
Print the result rounded up to the second decimal point.
Example
Input	Output
5
*
5	25
4
+
8	12

 * */
import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int numberFirst = Integer.parseInt(scanner.nextLine());
	        String simbolOperations = scanner.nextLine();
	        int numberSecond = Integer.parseInt(scanner.nextLine());
	        int sum = operationsNumbers(numberFirst,simbolOperations,numberSecond);
	        System.out.println(sum);
	    }
	    public static int operationsNumbers(int numberFirst, String simbolOperations, int numberSecond){
	        int sum = 0;
	        switch (simbolOperations) {
	            case "*":
	                 sum = numberFirst*numberSecond;
	                break;
	            case "+":
	                sum = numberFirst+numberSecond;
	                break;
	            case "-":
	                sum = numberFirst-numberSecond;
	                break;
	            case "/":
	                sum = numberFirst/numberSecond;
	                break;
	        }
	        return sum;
	    }
	}
