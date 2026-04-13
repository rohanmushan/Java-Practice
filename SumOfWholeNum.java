//find the sum of all the given whole numbers till n
import java.util.Scanner;
public class SumOfWholeNum
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum = sum + i;
        }
	System.out.println("Sum of whole numbers till " + n + " is: " + sum);
    }
}