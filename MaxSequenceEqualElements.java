/*7.	Max Sequence of Equal Elements
Write a program that finds the longest sequence of equal elements in an array of integers.
 If several longest sequences exist, print the leftmost one.
Examples
Input	Output
2 1 1 2 3 3 2 2 2 1	2 2 2
1 1 1 2 3 1 3 3	1 1 1
4 4 4 4	4 4 4 4
0 1 1 5 2 2 6 3 3	1 1
 * */
import java.util.Arrays;
import java.util.Scanner;
public class MaxSequenceEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numberArr =Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt)
                .toArray();
        int countNumberArr =1;
        int countMax = 0;
        int countLast = 0;
        for (int i = 1; i < numberArr.length; i++) {
            if (numberArr[i]==numberArr[i - 1]){
                countNumberArr++;
                if (countNumberArr>countMax){
                    countMax=countNumberArr;
                    countLast = numberArr[i];
                }
            } else {
                countNumberArr=1;
            }
        }
        for (int i = 0; i < countMax; i++) {
            System.out.print(countLast+" ");
        }
    }
}
