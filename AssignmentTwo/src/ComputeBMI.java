import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class ComputeBMI {

	public static void main(String[] args) {
		String WeightPounds;
		double WeightKiloGram;
		String HeightInches;
		double HeightMeters;
		double BodyMass;
		DecimalFormat formatter = new DecimalFormat("#0.0000");
		
		WeightPounds = JOptionPane.showInputDialog("Enter your weight in pounds: ");
		WeightKiloGram = Double.parseDouble(WeightPounds);
		WeightKiloGram *= .45359237;
		
		HeightInches = JOptionPane.showInputDialog("Enter your height in inches: ");
		HeightMeters = Double.parseDouble(HeightInches);
		HeightMeters *= .0254;
		
		BodyMass = WeightKiloGram / (HeightMeters * HeightMeters);

		JOptionPane.showMessageDialog(null, "Your BMI is " + formatter.format(BodyMass));
		
		System.exit(0);
	}

}
