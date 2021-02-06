
/*4.	Array Rotation
Write a program that receives an array and number of rotations you
 have to perform (first element goes at the end) Print the resulting array.
Examples
Input	Output
51 47 32 61 21
2	32 61 21 51 47
32 21 61 1
4	32 21 61 1
2 4 15 31
5	4 15 31 2
* */
import java.util.Scanner;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberSimbol = scanner.nextLine();
        String [] numbersArray = numberSimbol.split(" ");
        int numberRotation = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberRotation; i++) {
            String numberPosition = numbersArray[0];
            for (int j = 0; j < numbersArray.length-1; j++) {
                numbersArray[j] = numbersArray[j+1];
            }
            numbersArray[numbersArray.length-1]=numberPosition;
        }
        System.out.print(String.join(" ", numbersArray));
    }
}
