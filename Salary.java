//2. WAC to take salary , bonus and deduction and find the final credited salary

public class Salary
	{
		public static void main(String args[])
		{
		int sal = 25000;
		int bonus = 5000;
		int deduction = 2500;
		int tsal = (sal + bonus) - deduction;
		System.out.print(tsal);
		}
	
	}