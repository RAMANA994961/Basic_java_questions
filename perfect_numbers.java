package java1;
import java.util.Scanner;
public class perfect_numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a = sc.nextInt();
		int sum=0;
		for(int i=1;i<=a/2;i++) {
			if(a%i==0) {
				sum += i;
			}
		}
		if(sum==a && a!=0) {
			System.out.println("perfect number");
		}else {
			System.out.println("not perfect");
		}
	}

}
