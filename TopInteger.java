
/*5.	Top Integers
Write a program to find all the top integers in an array.
 A top integer is an integer which is bigger than all the elements to its right.
Examples
Input	Output
1 4 3 2	4 3 2
14 24 3 19 15 17	24 19 17
27 19 42 2 13 45 48	48
* */
import java.util.Scanner;
public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] numberArray = scanner.nextLine().split(" ");
        int [] numbers = new int [numberArray.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = Integer.parseInt(numberArray[i]);
        }
        for (int i = 0; i < numbers.length-1; i++) {
            boolean isBigNumber = true;
            int arrNumber = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                int number = numbers[j];
                if (arrNumber<=number) {
                    isBigNumber=false;
                }
            }
            if (isBigNumber) {
                System.out.print(arrNumber + " ");
            }
        }
        System.out.print(numbers[numbers.length-1]);
    }
}