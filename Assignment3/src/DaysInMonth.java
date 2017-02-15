import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		int userYear;
		int userMonth;
		String months[] = {"0", "31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"};
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" Select a year: ");
		userYear = keyboard.nextInt();
			switch(userYear % 4){
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
