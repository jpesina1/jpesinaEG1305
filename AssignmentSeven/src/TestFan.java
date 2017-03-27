//I didn't know how to set the boolean fanStatus
//to a string ON or OFF
import java.util.Scanner;

public class TestFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fan f = new Fan();
		
		f.getSpeed();
		f.getColor();
		f.getRadius();
		f.isFanStatus();
	System.out.println(f.toString());
	
	}
	
}
