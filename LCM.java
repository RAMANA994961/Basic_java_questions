package java1;
import java.util.Scanner;;
public class LCM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter anumber");
		int a= sc.nextInt();
		System.out.println("enter 2nd number");
		int b= sc.nextInt();
		int num1 =a ,num2 = b;
		while(b!=0) {
			int temp = b;
			b=a%b;
			a=temp;
			
		}
		int gcd=a;
		int lcm=(num1*num2)/gcd;
		System.out.println(lcm);
	}
}
