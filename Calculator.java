
/*4.	Calculations
Write a program that receives a string on the first line
 ("add", "multiply", "subtract", "divide") and on the next two lines receives two numbers.
  Create four methods (for each calculation) and invoke the right one depending on the command.
   The method should also print the result (needs to be void).
Example
Input	Output
subtract
5
4	1
divide
8
4	2

 * */
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String process = scanner.nextLine();
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        if (process.equals("add")){
            add(process, numberOne, numberTwo);
        }
        if (process.equals("multiply")){
            multiply(process, numberOne, numberTwo);
        }
        if (process.equals("subtract")){
            subtract(process,numberOne, numberTwo);
        }
        if (process.equals("divide")){
            divide(process,numberOne, numberTwo);
        }
    }
    public static void add( String process, int numberOne, int numberTow) {
       int sumAdd=numberOne+numberTow;
       System.out.println(sumAdd);
    }
    public static void multiply(String multiply, int numberOne, int numberTow) {
       int sumMultiply=numberOne*numberTow;
        System.out.println(sumMultiply);
    }
    public static void subtract(String subtract, int numberOne, int numberTow) {
        int sumSubtract=numberOne-numberTow;
        System.out.println(sumSubtract);
    }
    public static void divide(String divide, int numberOne, int numberTow) {
        int sumSubtract=numberOne/numberTow;
        System.out.println(sumSubtract);
    }
}