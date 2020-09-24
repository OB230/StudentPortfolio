import java.util.Scanner;
public class Interest {
	double amount, interest, rate, monthly, dividend, income;
	int term;
	Scanner keyboard = new Scanner(System.in);
	public void compoundInterest()
	{


		System.out.println("Please enter amount to invest");
		amount = keyboard.nextDouble();
		System.out.println("Please enter annual return");
		interest = keyboard.nextDouble();
		System.out.println("For how many years would you like to invest?");
		term = keyboard.nextInt();
		System.out.println("Enter anticipated dividend");
		dividend = keyboard.nextDouble();
		rate = (1 + ((interest/100)/12));
		
		
		for (int i = 1; i <= term; i++) {
			for (int j = 1; j <=12; j++)
			{
				amount = amount * rate;
			}
			
			income = amount * (dividend / 100);
			amount = amount + income;
			System.out.println("Year " + i + ": " + amount);
			System.out.println("Year " + i + " dividend: " + income);
		}
	}
	
	public void monthlySavings()
	{
		System.out.println("Enter starting balance");
		amount = keyboard.nextDouble();
		System.out.println("Please enter annual return");
		interest = keyboard.nextDouble();
		System.out.println("Enter monthly investment");
		monthly = keyboard.nextDouble();
		System.out.println("For how many years would you like to invest?");
		term = keyboard.nextInt();
		System.out.println("Enter anticipated dividend");
		dividend = keyboard.nextDouble();
		rate = (1 + ((interest/100)/12));
		
		for (int i = 1; i <= term; i++) {
			for (int j = 1; j <=12; j++)
			{
				amount = (amount * rate) + monthly;
			}
			
			income = amount * (dividend / 100);
			amount = amount + income;
			System.out.println("Year " + i + ": " + amount);
			System.out.println("Year " + i + " dividend: " + income);
		}
		
	}
	
	public void growthAndIncome()
	{
		System.out.println("Enter starting balance");
		amount = keyboard.nextDouble();
		System.out.println("Please enter annual return");
		interest = keyboard.nextDouble();
		System.out.println("For how many years would you like to invest?");
		term = keyboard.nextInt();
		System.out.println("Enter anticipated dividend");
		dividend = keyboard.nextDouble();
		rate = (1 + ((interest/100)/12));
		
		for (int i = 1; i <= term; i++) 
		{
			for (int j = 1; j <=12; j++)
			{
				amount = (amount * rate) + monthly;
				
			}
			income = amount * (dividend / 100);
			System.out.println("Year " + i + " capital: " + amount); 
			System.out.println("Year " + i + " income: " + income);
		}
		
	}
	
	public void halfAndHalf()
	{
		monthlySavings();
		System.out.println("Please enter annual return");
		interest = keyboard.nextDouble();
		System.out.println("For how many years would you like to invest?");
		term = keyboard.nextInt();
		System.out.println("Enter anticipated dividend");
		dividend = keyboard.nextDouble();
		rate = (1 + ((interest/100)/12));
		
		for (int i = 1; i <= term; i++) 
		{
			for (int j = 1; j <=12; j++)
			{
				amount = (amount * rate) + monthly;
				
			}
			income = amount * (dividend / 100);
			System.out.println("Year " + i + " capital: " + amount); 
			System.out.println("Year " + i + " income: " + income);
		}
		
	}
	
	public void choice()
	{
		char answer;
		int i = 0;
		while (i <1) {
			
		
			System.out.println("Please Select An Option");
			System.out.println("A: Calculate return on single investment");
			System.out.println("B: Calculate return on monthly investment");
			System.out.println("C: Calculate return on single investment with income");
			System.out.println("D: Exit");
			
			answer = keyboard.next().charAt(0);
			
			if (answer == 'a' || answer == 'A') {
				compoundInterest();
			}
			else if (answer == 'b' || answer == 'B') {
				monthlySavings();
			}
			else if (answer == 'c' || answer == 'C') {
				growthAndIncome();
			}
			else if (answer =='d' || answer == 'D')
			{
				i++;
			}
				
			} 
		

	
	}
	

	public static void main(String [] args)
	{
		Interest a = new Interest();
		a.choice();
	}
}
