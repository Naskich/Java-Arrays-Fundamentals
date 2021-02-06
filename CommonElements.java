
/*2.	Common Elements
Write a program, which prints common elements in two arrays.
You have to compare the elements of the second array to the elements of the first.
Examples
Input	Output
Hey hello 2 4
10 hey 4 hello	4 hello
S of t un i
of i 10 un	of i un
i love to code
code i love to	code i love to
* */
import java.util.Scanner;
public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] simbolsNumberString1 = scanner.nextLine().split(" ");
        String [] simbolsNumberString2 = scanner.nextLine().split(" ");

        for (String simbolNum1 : simbolsNumberString2) {
            for (String simbolNum2 : simbolsNumberString1) {
                if (simbolNum1.equals(simbolNum2)) {
                    System.out.printf(simbolNum1+" ");
                }
            }
        }
    }
}
