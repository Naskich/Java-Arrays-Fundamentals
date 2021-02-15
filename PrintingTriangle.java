
/*3.	Printing Triangle
Create a method for printing triangles as shown below:
Examples
Input	Output
3	1
    1 2
    1 2 3
    1 2
    1
    
4	1
    1 2
    1 2 3 
    1 2 3 4
    1 2 3
    1 2
    1
 * */
import java.util.Scanner;

public class PrintingTriangle {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int numberTriangle = Integer.parseInt(scanner.nextLine());
	        printNumberTriangleUp(numberTriangle);
	        printNumberTriangleDown(numberTriangle);
	    }
	    public static void printNumberTriangleUp(int numberTriangle) {
	        for (int i = 1; i <= numberTriangle; i++) {
	            for (int h = 1; h <= i; h++) {
	                System.out.printf("%d ",h);
	            }
	            System.out.println();
	        }
	    }
	    public static void printNumberTriangleDown(int numberTriangle) {
	        for (int i = numberTriangle-1; 1 <= i; i--) {
	            printNumberTriangleDownSecond(i);
	        }
	    }
	    public static void printNumberTriangleDownSecond(int numberTriangle) {
	        for (int i = 1; i <= numberTriangle; i++) {
	            System.out.printf("%d ",i);
	        }
	        System.out.println();
	    }
	}