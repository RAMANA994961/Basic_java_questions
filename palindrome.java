package java1;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int  a = sc.nextInt();
		int original = a;
		int reverse=0;
		while(a!=0) {
			int digit=a%10;
			reverse=reverse*10+digit;
			a=a/10;
		}
		if(original == reverse) {
			System.out.println("is palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
	
}
