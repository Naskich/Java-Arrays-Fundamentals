
/*2.	Grades
Write a method that receives a grade between 2.00 and 6.00 and prints
 the corresponding grade in words:
•	2.00 – 2.99 - "Fail"
•	3.00 – 3.49 - "Poor"
•	3.50 – 4.49 - "Good"
•	4.50 – 5.49 - "Very good"
•	5.50 – 6.00 - "Excellent"
Examples
Input	Output
3.33	Poor
4.50	Very good
2.99	Fail
 * */

import java.util.Scanner;
public class Grades {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        double gradeValue = Double.parseDouble(scanner.nextLine());
	        compareGradeValue(gradeValue);
	    }
	    public static void compareGradeValue(double gradeValue){
	        if (gradeValue>=2 && gradeValue<=2.99){
	            System.out.println("Fail");
	        }
	        if (gradeValue>=3 && gradeValue<=3.49){
	            System.out.println("Poor");
	        }
	        if (gradeValue>=3.5 && gradeValue<=4.49){
	            System.out.println("Good");
	        }
	        if (gradeValue>=4.5 && gradeValue<=5.49){
	            System.out.println("Very good");
	        }
	        if (gradeValue>=5.5 && gradeValue<=6){
	            System.out.println("Excellent");
	        }
	    }
	}
