import java.util.*;

public class Calculator {
	Scanner sc = new Scanner (System.in);
	
	
	public double BMI(double heightCM, double weightLB)
	{

		double weightKG = weightLB / 2.2046226218;
		double heightM = heightCM /100;
		double heightSQ = Math.pow(heightM, 2);
		double BMI = weightKG / heightSQ;
		double BMIDisplay = (double)Math.round(BMI * 100d) / 100d;
		
		
		return BMIDisplay;
		
	}
	
	public double bodyFat(double weightLB, double waist)
	
	{

		double weightKG = weightLB / 2.2046226218;
		double bodyFat = (-0.082 * weightLB + 4.15 * waist - 94.42) / weightLB * 100;
		double bodyFatDisplay = (double)Math.round(bodyFat * 100d) / 100d;
		
		return bodyFatDisplay;
	}
	
	public double targetWeight(double weightLB, double bodyFat)
	{
		double weightKG = weightLB / 2.2046226218;
		double LBM = weightLB - (weightLB * (bodyFat/100));
		double targetLB = LBM * 1.12;
		double targetKG = targetLB / 2.2046226218;
		double targetLBDisplay = (double)Math.round(targetLB * 100d) / 100d;
		double targetKGDisplay = (double)Math.round(targetKG * 100d) / 100d;
		
		
		return targetLBDisplay;
		
	}
	
	
	
}
