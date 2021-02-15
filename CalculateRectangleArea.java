
/*6.	Calculate Rectangle Area
Create a method that calculates and returns the area
 of a rectangle by given width and length.
Examples
Input	Output
3
4	12
 * */
import java.util.Scanner;
public class CalculateRectangleArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double sideRectangleA = Double.parseDouble(scanner.nextLine());
        double sideRectangleB = Double.parseDouble(scanner.nextLine());  
        double  sumArea =  multiplicationRectangle(sideRectangleA, sideRectangleB);
         System.out.println((int)sumArea);
    
		}
        public static double multiplicationRectangle(double sideRectangleA, double sideRectangleB){
           return  sideRectangleA * sideRectangleB;
        }
}