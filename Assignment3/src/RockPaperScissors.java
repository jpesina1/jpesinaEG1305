import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		int rock = 0;
		int paper = 1;
		int scissors = 2;
		int userChoice;
		int cpuChoice;
	
	Scanner keyboard = new Scanner(System.in);
	Random rand = new Random();
	cpuChoice = rand.nextInt(2);
	
	System.out.println("Let's play Rock Paper Scissors! Choose");
	System.out.println(" 0 for Rock \n 1 for Paper \n 2 for Scissors");
	userChoice = keyboard.nextInt();	
		
	switch(cpuChoice) {
	case 0: 
	System.out.println("Computer chose Rock!");	
		if (userChoice == 2){
		System.out.println("You lose!");
		}	
		else if(userChoice == 1){
		System.out.println("You win!");
		}
		else{
		System.out.println("It's a tie!");
		}
		break;
	case 1: 
		System.out.println("Computer chose Paper!");	
		if (userChoice == 0){
		System.out.println("You lose!");
		}	
		else if(userChoice == 2){
		System.out.println("You win!");
		}
		else{
		System.out.println("It's a tie!");
		}
		break;
	case 2: 
	System.out.println("Computer chose Scissors!");
		if (userChoice == 1){
		System.out.println("You lose!");
		}	
		else if(userChoice == 0){
		System.out.println("You win!");
		}
		else{
		System.out.println("It's a tie!");
		}
		break;
	  }
			
	}

}
