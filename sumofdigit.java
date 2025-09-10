package java_practice;
import java.util.Scanner;
public class sumofdigit {
public static void main(String[] args) {
	System.out.println("enter number");
	Scanner sc= new Scanner(System.in);
	int a = sc.nextInt();
	int sum = 0;
	while(a!=0) {
		int digit = a%10;
		sum = sum+digit;
		a =a/10;
	}
	System.out.println(sum);
}
}
