import java.util.Scanner;
public class CountMoney {
	
	public static void main(String[] args) {
	int UserMoney; //Declare variables in all lower case letters, only the first letter of the second or third word in caps: userMoney
	int Dollar; //dollar
	int Quarter;
	int Dime;
	int Nickel;
	int Penny;
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter an amount as an integer, for example 1234 for twelve dollars and thirty-four cents: ");
	
	UserMoney = keyboard.nextInt();
	Dollar =   UserMoney / 100;
	Quarter=  (UserMoney % 100)       / 25;
	Dime   =  (UserMoney % 100) % 25  / 10;
	Nickel =  (UserMoney % 100) % 25  % 10 / 5;
	Penny  =  (UserMoney % 100) % 10  %  5;
	
	System.out.println(" Your amount " + UserMoney + " consists of \n");
	System.out.println("  " + Dollar + " Dollars \n  " + Quarter + "  Quarters\n  " + Dime + "  Dimes\n  "+ Nickel + "  Nickels\n  "+ Penny + "  Pennies");
	
	}
}
