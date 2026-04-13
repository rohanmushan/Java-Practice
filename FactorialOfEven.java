//Find the Factorial of Even numbers till N
import java.util.Scanner;

public class FactorialOfEven{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");	
		int n = sc.nextInt();
		int product = 1;
		
		for(int i = 2; i <= n; i += 2) {
            	product = product * i;
        	}
		System.out.println("Product of even numbers till " + n + " = " + product);

	}
}