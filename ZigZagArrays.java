
/*3.	Zig-Zag Arrays
Write a program which creates 2 arrays. You will be given an integer n. On the next n lines,
you get 2 integers. Form 2 arrays as shown below.
 
Examples – 1
Input	Output
4
1 5
9 10
31 81
41 20	1 10 31 20
5 9 81 41
 2
80 23
31 19	80 19
23 31

* */
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberArr = Integer.parseInt(scanner.nextLine());
        
        String [] firstNumArr = new String[numberArr];
        String [] secondNumArr = new String[numberArr];

            for (int i = 0; i < numberArr ; i++) {
                String [] numberAray = scanner.nextLine().split(" ");
                if (i % 2 == 0){
                    firstNumArr[i] = numberAray[0];
                    secondNumArr[i] = numberAray[1];
                } else {
                    firstNumArr[i] = numberAray[1];
                    secondNumArr[i] = numberAray[0];
                }
            }
            System.out.println(String.join(" ",firstNumArr));
            System.out.println(String.join(" ",secondNumArr));
    }
}
