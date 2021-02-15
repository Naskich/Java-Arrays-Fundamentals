
/*7.	Repeat String
Write a method that receives a string and a repeat count n (integer). 
The method should return a new string (the old one repeated n times).
Example
Input	Output
abc
3	abcabcabc
String
2	StringString
 * */
import java.util.Scanner;
public class RepeatString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String simbols = scanner.nextLine();
        int numbersSimbols = Integer.parseInt(scanner.nextLine());

        printSimbols(simbols, numbersSimbols);
    }
    public static void printSimbols(String simbols, int numbersSimbols){
        for (int i = 0; i < numbersSimbols; i++) {
            System.out.print(simbols);
        }
    }
}