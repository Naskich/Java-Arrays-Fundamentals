/*8.Magic Sum
Write a program, which prints all unique pairs in an array
 of integers whose sum is equal to a given number.
Examples
Input	Output
1 7 6 2 19 23
8	1 7
6 2
14 20 60 13 7 19 8
27	14 13
20 7
19 8
* */
import java.util.Scanner;
public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] indexNumber = scanner.nextLine().split(" ");
        int [] numbersArr = new int [indexNumber.length];
        int numberSum = Integer.parseInt(scanner.nextLine());
        int sumArr = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr [i] = Integer.parseInt(indexNumber[i]);
        }
        for (int i = 0; i < numbersArr.length; i++) {
            for (int j = i+1; j < numbersArr.length; j++) {
               sumArr +=numbersArr[i]+numbersArr[j];
               if (sumArr==numberSum){
                   System.out.print(numbersArr[i]+" ");
                   System.out.print(numbersArr[j]+" ");
                   System.out.println(" ");
                   sumArr = 0;
                   break;
               }
              sumArr = 0;
            }
        }
    }
}