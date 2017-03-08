import java.util.Scanner;

public class FindPI {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int iteration = 0;
		double pi = 0.0;
		System.out.println("How many iterations would you like to use to find PI?");
		iteration = keyboard.nextInt();
		long startTime = System.nanoTime();
		for (int i = 0; i < iteration; i++) {
			pi += Math.pow(-1, i) / (2 * i + 1);
		}
		long finishTime = System.nanoTime();
		pi *= 4.0;
		long difference = finishTime - startTime;
		double seconds = difference / 1000000000.0;

		System.out.println(pi);
		System.out.println(seconds);
	}

}
