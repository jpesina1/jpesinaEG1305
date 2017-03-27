
//I didn't know how to pull the date from the method or if I was supposed to input it into the test file
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("2017/03/26");

		Account a = new Account(1122, 20000, 4.5, null);
		a.getDateCreated();
		a.setDeposit(3000.0);
		a.setWithdraw(2500.0);
		a.setAnnualInterestRate(4.5);
		a.getAnnualInterestRate();
		System.out.println(a.toString());

	}
}
