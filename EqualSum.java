

/*6.	Equal Sums
Write a program that determines if there exists an element in the
array such that the sum of the elements on its left is equal to
the sum of the elements on its right. If there are no elements to the left / right,
their sum is considered to be 0. Print the index that satisfies the required condition
or “no” if there is no such index.
Examples
Input	Output	Comments
1 2 3 3	2	At a[2] -> left sum = 3, right sum = 3
a[0] + a[1] = a[3]
1 2	no	At a[0] -> left sum = 0, right sum = 2
At a[1] -> left sum = 1, right sum = 0
No such index exists
1	0	At a[0] -> left sum = 0, right sum = 0
1 2 3	no	No such index exists
10 5 5 99 3 4 2 5 1 1 4	3	At a[3] -> left sum = 20, right sum = 20
a[0] + a[1] + a[2] = a[4] + a[5] + a[6] + a[7] + a[8] + a[9] + a[10]

* */
import java.util.Arrays;
import java.util.Scanner;
public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers =  Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        boolean findNumber = false;
        for (int i = 0; i <= numbers.length-1; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int iLeft = 0; iLeft <= i-1; iLeft++) {
                sumLeft += numbers[iLeft];
                }
            for (int iRight = i+1; iRight <= numbers.length-1; iRight++) {
                sumRight+=numbers[iRight];
            }
                if (sumLeft==sumRight){
                    System.out.println(i);
                    findNumber = true;
                }
            }
        if (!findNumber){
            System.out.println("no");
        }
    }
}
