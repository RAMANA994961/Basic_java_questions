package java1;
import java.util.Scanner;
public class N_natural_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:");
		int a = sc.nextInt();
		int sum = a*(a+1)/2;
		System.out.println("natural numbers:" +sum);
	}

}
