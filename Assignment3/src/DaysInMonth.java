import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		int userYear;
		int userMonth;
		String months[] = {"0", "31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Select a year: ");
		userYear = keyboard.nextInt();
			switch(userYear % 4){ //This is not accurate. There are exceptions, for example year 1800 is not a leap year
					      // year is a leap-year if it is evenly divisible by 4 unless it is evenly divisible by 100, 
					      //UNLESS it is evenly divisible by 400
				case 0:
				{
				months[2] = "29";
				break;
				} 
				default:
				{
					
				}
			}
			
			System.out.println("Select a month: ");
			userMonth = keyboard.nextInt();
			System.out.printf("There are %s days in %d / %d", months[userMonth] ,userMonth ,userYear );
	}
	
}
