package java1;
import java.util.Scanner;
public class addition_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("enter another number");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("addition of a number:"+ c);
	}

}
