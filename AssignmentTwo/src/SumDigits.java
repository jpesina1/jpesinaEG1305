//User Input is used to add  

import java.util.Scanner;
public class SumDigits {

	public static void main(String[] args) {
		int user; 
		int sumTotal, sumOne, sumTen, sumHundred, sumThousand;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter an integer between 0 and 1000: ");
		user = keyboard.nextInt();
		sumThousand = user / 1000      ;
		sumHundred  = user % 1000 / 100;
		sumTen      = user % 100  /10  ;
		sumOne      = user % 10   / 1  ; 
		sumTotal    = sumThousand + sumHundred + sumTen + sumOne;
		
		System.out.println("The sum of your number is " + sumTotal);
		
	
	
	
	}

}
