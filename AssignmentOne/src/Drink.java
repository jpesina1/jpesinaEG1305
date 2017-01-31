
public class Drink {

	public static void main(String[] args) {
		int TotalCustomers = 12467;
		int EnergyDrinkCustomers = (int)(TotalCustomers * .14);
		int CitrusDrinkCustomers = (int)(EnergyDrinkCustomers * .64);
		
		
		System.out.print(" "+EnergyDrinkCustomers);
		System.out.print(" customers purchased energy drinks. \n");
		System.out.print(" "+CitrusDrinkCustomers);
		System.out.print(" customers preferred citrus energy drinks.");
		}
	}