import java.text.DecimalFormat;
import java.util.Scanner;

public class CompareNumbers {
	public static void main(String[]args){
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int sum;
		int product;
		float average;
		
		Scanner keyboard= new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		System.out.println("Enter first integer: ");
		firstNumber = keyboard.nextInt();
		System.out.println("Enter second integer: ");
		secondNumber = keyboard.nextInt();
		System.out.println("Enter third integer: ");
		thirdNumber = keyboard.nextInt();
		

		//Finding the smallest number
		if(firstNumber < secondNumber){
			if(firstNumber < thirdNumber){
				System.out.println("The smallest number is " + firstNumber);
			}
			else{
				System.out.println("The smallest number is " + thirdNumber);
			}
		}
		else{
			if(secondNumber < thirdNumber){
				System.out.println("The smallest number is " + secondNumber);	
			}
			else{
				System.out.println("The smallest number is " + thirdNumber);
			}
		}
		//Finding the largest number
		if(firstNumber > secondNumber){
			if(firstNumber > thirdNumber){
				System.out.println("The largest number is " + firstNumber);
			}
			else{
				System.out.println("The largest number is " + thirdNumber);
			}
		}
		else{
			if(secondNumber > thirdNumber){
				System.out.println("The largest number is " + secondNumber);	
			}
			else{
				System.out.println("The largest number is " + thirdNumber);
			}
		}
		
		sum = firstNumber + secondNumber + thirdNumber;
		product = firstNumber * secondNumber * thirdNumber;
		average = (float)sum/3;
	
		System.out.println("The sum is " + sum);
		System.out.println("The product is " + product);
		System.out.println("The average is " + formatter.format(average));
	
	
	
	}
}
