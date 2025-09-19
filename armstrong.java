package java1;
import java.util.Scanner;
public class armstrong {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        int original = n;
	        int digits = String.valueOf(n).length(); 
	        int sum = 0;

	        
	        while (n > 0) {
	            int digit = n % 10;
	            sum += Math.pow(digit, digits);
	            n /= 10;
	        }

	        
	        if (sum == original) {
	            System.out.println(original + " is an Armstrong Number.");
	        } else {
	            System.out.println(original + " is NOT an Armstrong Number.");
	        }
	    }
}
   

