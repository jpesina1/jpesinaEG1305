import java.util.Random;
import java.util.Scanner;

public class GeneratePassword {

	public static void main(String[] args0) {
		Scanner keyboard = new Scanner(System.in);
		int user = 1;

			System.out.println("How many digits would you like to" + " use for a numeric password?");

			user = keyboard.nextInt();

			System.out.println("Your password is ");

			for (int i = 0; i < user; i++) {
				randomGenerator();
				System.out.print(randomGenerator() + " ");
			}
	}

	public static int randomGenerator() {

		Random number = new Random();
		int random1 = number.nextInt(10);
		return random1;
	}
}
