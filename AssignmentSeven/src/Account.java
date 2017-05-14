import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private double deposit;
	private double withdraw;
	Scanner keyboard = new Scanner(System.in);

	public Account() {
		super();
	}

	public Account(int id, double balance, double annualInterestRate, Date dateCreated) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = dateCreated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		annualInterestRate = 4.5;
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		DateFormat dateFormat = new SimpleDateFormat("2017/03/26");
		Date dateCreated = new Date();
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public double getDeposit() {

		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
		balance += deposit;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
		balance -= withdraw;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", dateCreated=" + dateCreated
				+ ", getMonthlyInterestRate()=" + getMonthlyInterestRate() + "]";
	}

}
