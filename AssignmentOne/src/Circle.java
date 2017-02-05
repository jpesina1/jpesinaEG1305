import java.text.DecimalFormat;
public class Circle{
	public static void main(String[]args){
		DecimalFormat formatter = new DecimalFormat("#0.0000");
		int radius = 3;
		int diameter = 2*radius;
		float area =(float)Math.PI *(radius*radius);
		//Use double so you don't have to cast the result
		
		System.out.println("The circle's radius is "+radius);
		System.out.println("The diameter is "+diameter);
		System.out.println("The area is " +formatter.format(area));
	}
}
