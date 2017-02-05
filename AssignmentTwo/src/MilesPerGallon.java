import java.util.Scanner;
import java.text.DecimalFormat;
public class MilesPerGallon {

	public static void main(String[] args) {

		int MilesDriven;
		int GallonsUsed;
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#0.0000");
		
		System.out.println("Enter the miles driven: ");
		MilesDriven = keyboard.nextInt();
		System.out.println("Enter the gallons of fuel used:  ");
		GallonsUsed = keyboard.nextInt();
		double MPG = (double)MilesDriven / GallonsUsed;
		System.out.println("The miles-per-gallon is " + formatter.format(MPG));
	}

}
