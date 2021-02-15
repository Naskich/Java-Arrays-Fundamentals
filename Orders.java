

/*5.Orders
Write a method that calculates the total price of an order and prints it on the console.
 The method should receive one of the following products: coffee, water, coke, snacks;
  and a quantity of the product. The prices for a single piece of each product are:
•	coffee – 1.50
•	water – 1.00
•	coke – 1.40
•	snacks – 2.00
Print the result rounded to the second decimal place.
Example
Input	Output
water
5	5.00
coffee
2	3.00
Hint
•	Read the product and the quantity.
•	Create a method the pass the two variables in.
•	Print the result in the method.
 * */
import java.util.Scanner;
public class Orders {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        String typeDrink = scanner.nextLine();
		        int numbersDrink = Integer.parseInt(scanner.nextLine());
		        comparison(typeDrink, numbersDrink);
		    }
		    public static void comparison(String typeDrink, int numbersDrink) {
		        switch (typeDrink) {
		            case "coffee":
		                multiplicationCoffee(numbersDrink);
		                break;
		            case "water":
		                multiplicationWater(numbersDrink);
		                break;
		            case "coke":
		                multiplicationCoke(numbersDrink);
		                break;
		            case "snacks":
		                multiplicationSnack(numbersDrink);
		                break;
		        }
		    }
		    public static void multiplicationCoffee(int numbersDrink) {
		        double sumLast = numbersDrink * 1.50;
		        System.out.printf("%.2f",sumLast);
		    }
		    public static void multiplicationWater(int numbersDrink) {
		        double sumLast = numbersDrink * 1.00;
		        System.out.printf("%.2f", sumLast);
		    }
		    public static void multiplicationCoke(int numbersDrink) {
		        double sumLast = numbersDrink * 1.40;
		        System.out.printf("%.2f", sumLast);
		    }
		    public static void multiplicationSnack(int numbersDrink) {
		        double sumLast = numbersDrink * 2.00;
		        System.out.printf("%.2f", sumLast);
		    }
		}
