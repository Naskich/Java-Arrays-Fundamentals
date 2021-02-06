
/*1.	Train
You will be given a count of wagons in a train n.
 On the next n lines, you will receive how many
  people are going to get on that wagon. At the 
  end print the whole train and after that the sum of the people in the train.
Examples
Input	Output
3
13
24
8	13 24 8
45
6
3
52
71
13
65
4	3 52 71 13 65 4
208
1
100	100
100

 * */

import java.util.Scanner;
public class Train {	
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int number = Integer.parseInt(scanner.nextLine());
	 int [] numberVagons = new int [number];
	 int sumVagons = 0;
	 	for (int i = 0; i < numberVagons.length; i++) {
	 		numberVagons [i] = scanner.nextInt();
	 		sumVagons += numberVagons[i];	 	
	 	}
	 	for (int j = 0; j < numberVagons.length; j++) {
	 		System.out.printf("%d ",numberVagons[j]);
		}
	 	System.out.printf("%n %d",sumVagons);
	}
}
