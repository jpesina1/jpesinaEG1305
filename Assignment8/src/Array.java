import java.text.DecimalFormat;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int selection;
		DecimalFormat formatter = new DecimalFormat("#0.00");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program will find the highest, lowest,"
				+ " average and the sum of the numbers that you will enter");

		System.out.println("How many numbers do you want to enter?");
		selection = keyboard.nextInt();
		int[] array = new int[selection];
		getValues(array);
		
		
		System.out.println("Highest element is " + showHighest(array));
		System.out.println("Lowest element is " + showLowest(array));
		System.out.println("The sum of the elements is " + showTotal(array));
		System.out.println("The average of the elements is " + formatter.format(showAverage(showTotal(array), array)));
	}

	public static void getValues(int[] array) {
		Scanner keyboard = new Scanner(System.in);
		int number;
		System.out.println("Please enter your " + array.length + "numbers: ");
		for (int i = 1; i < array.length + 1; i++) {
			System.out.println("Enter number " + i);
			number = keyboard.nextInt();
			array[i - 1] = number;
		}
	}

	public static int showHighest(int[] array){	
		int highest = array[0];
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] > highest)
				highest = array[i];
		}

		return highest;
	}
	public static int showLowest(int[] array){	
		int lowest = array[0];
		for (int i = 1; i < array.length; i++){
			if (array[i] < lowest){
				lowest = array[i];
			}
		}
		return lowest;
	
	}

	public static int showTotal(int[] array){	
	
		int total = 0; 
		for (int i = 0; i < array.length; i++){
		  total += array[i];
		}
		  return total;
	}

	public static double showAverage(double total, int[] array){	
		double average; // Will hold the average
		average = (total) / (array.length);
		return average;
	}
}
