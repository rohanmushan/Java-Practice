//Find the product of all the given whole numbers till n (Factorial)
import java.util.Scanner;

public class Factorial{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        long product = 1;

        for(int i = 1; i <= n; i++) {
            product = product * i;
        }

        System.out.println("Product of numbers till " + n + " is: " + product);
    }
}