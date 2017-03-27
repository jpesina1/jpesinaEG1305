import java.util.Scanner;

public class Fan {
	private int speed;
	private boolean fanStatus = false;
	private double radius = 5;
	private String color = "blue";
	Scanner keyboard = new Scanner(System.in);
	
	public Fan() {
		super();
	}
	
	public Fan(int speed, boolean fanStatus, double radius, String color) {
		super();
		this.speed = speed;
		this.fanStatus = fanStatus;
		this.radius = radius;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fan [speed=" + speed + ", fanStatus=" + fanStatus + ", radius=" + radius + ", color=" + color + "]";
	}

	public int getSpeed() {
		System.out.println("Please enter speed of fan:");
		speed = keyboard.nextInt();
		return speed;
	}

	public boolean isFanStatus() {
		if(speed > 0){
			fanStatus = true;
		}
		else{
			fanStatus = false;
		}
		
		return fanStatus;
	}
	public double getRadius() {
		System.out.println("Please enter radius of fan: ");
		radius = keyboard.nextDouble();
		return radius;
	}

	public String getColor() {
		System.out.println("Plese enter the color of the fan: ");
		color = keyboard.next();
		return color;
	}
	
	
	
	
}
