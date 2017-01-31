import java.text.DecimalFormat;
public class StockTransaction {

	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		final double COMMISION_RATE = 0.02;
		int Stock = 1000;
		double StockPurchasePrice = 32.87;
		double StockSalePrice = 33.92;
		double JoePurchase = (Stock * StockPurchasePrice);
		double JoeSale = Stock * StockSalePrice;
		double BrokerShare1 = JoePurchase * COMMISION_RATE;
		double BrokerShare2 = JoeSale * COMMISION_RATE;
		double BrokerTotalShare = BrokerShare1 + BrokerShare2;
		double JoeTotalSpent = JoePurchase + BrokerTotalShare;
		double JoeOutcome =  JoeSale - JoeTotalSpent;
		
		System.out.print("Joe bought "+Stock );
		System.out.print(" stocks and paid $" +formatter.format(JoePurchase) );
		System.out.print(".\nHe paid his broker $" +formatter.format(BrokerShare1));
		System.out.print(".\nJoe then sold his stocks for $" +formatter.format(JoeSale));
		System.out.print(".\nHe paid his broker $"+formatter.format(BrokerShare2) );
		System.out.println(" again for selling the stocks" );
		System.out.println("In the end Joe's total was "+formatter.format(JoeOutcome));
		
		if (JoeSale > JoeTotalSpent){
			System.out.println("Therefore, Joe made a profit!");
		} 
		else{
			System.out.println("Therefore, Joe lost money!");
		}
	}
}
