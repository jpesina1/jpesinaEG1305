import java.util.Scanner;

public class testScores {
	private double testScore1;
	private double testScore2;
	private double testScore3;
	private double average;
	Scanner keyboard = new Scanner(System.in);

	public testScores(double testScore1, double testScore2, double testScore3) {
		super();
		this.testScore1 = testScore1;
		this.testScore2 = testScore2;
		this.testScore3 = testScore3;
	}

	public double getTestScore1() {
		System.out.println("Enter first test score:");
		testScore1 = keyboard.nextDouble();
		return testScore1;
	}

	public void setTestScore1(double testScore1) {
		this.testScore1 = testScore1;
	}

	public double getTestScore2() {
		System.out.println("Enter second test score:");
		testScore2 = keyboard.nextDouble();
		return testScore2;
	}

	public void setTestScore2(double testScore2) {
		this.testScore2 = testScore2;
	}

	public double getTestScore3() {
		System.out.println("Enter third test score:");
		testScore3 = keyboard.nextDouble();
		return testScore3;
	}

	public void setTestScore3(double testScore3) {
		this.testScore3 = testScore3;
	}

	public double getAverage() {
		average = (testScore1 + testScore2 + testScore3) / 3;
		return average;
	}

	@Override
	public String toString() {
		return "testScores [testScore1=" + testScore1 + ", testScore2=" + testScore2 + ", testScore3=" + testScore3
				+ ", average=" + average + "]";
	}

}
