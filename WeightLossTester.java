
import javax.swing.*;
public class WeightLossTester {

	public static void main(String[] args) {

		Calculator a = new Calculator();
		String stringHeightCM = JOptionPane.showInputDialog("Please enter your height in CMS:" );
		double heightCM = Double.parseDouble(stringHeightCM);
		String stringWeightLB = JOptionPane.showInputDialog("Please enter your weight in LBs:" );
		double weightLB = Double.parseDouble(stringWeightLB);
		String stringWaist = JOptionPane.showInputDialog("Please enter your waist circumference:" );
		double waist = Double.parseDouble(stringWaist);
		double bmi = a.BMI(heightCM, weightLB);
		double bodyFat = a.bodyFat(weightLB, waist);
		double targetWeight = a.targetWeight(weightLB, bodyFat);
		double targetWeightKG = (double)Math.round((targetWeight / 2.2046226218) * 100d) / 100d;
		double targetBMI = (double)Math.round(a.BMI(heightCM, targetWeight) * 100d) / 100d;
		double lbmLB = (double) Math.round((weightLB - (weightLB * (bodyFat/100))) * 100d) / 100d;
		double lbmKG = (double) Math.round((lbmLB / 2.2046226218) * 100d) / 100d;
		
		JOptionPane.showMessageDialog(null, "BMI: " + bmi + "\nBody fat percentage: " + bodyFat + 
				"\nEstimated LBM in LBS: " + lbmLB +
				"\nEstimated LBM in KGS: " + lbmKG +
				"\nTarget weight in LBS: " + targetWeight + " LBS \n"
						+ "Target Weight in KG: " + targetWeightKG +
						" KGs \nTarget BMI: " + targetBMI);
		double weightIn = weightLB;
		int i = 4;
		double waistIn = waist;
		double weeks = 0;
		while (weightIn > targetWeight)
		{
			double weightI = weightIn - i;
			weightIn = weightI;
			waistIn = waistIn - 1;
			weeks = weeks + 1.5;
			double bodyFatIn = a.bodyFat(weightIn, waistIn);
			System.out.println("At " + weightIn + " lbs, your waist should be " + waistIn + 
					" inches and your \nbodyfat % should be " + bodyFatIn + ". This should take " + weeks + " weeks.");
		
		}
		
		
		
	}

}
