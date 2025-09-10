package java1;
import java.util.Scanner;
public class prime__check {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
			int count =0;
			for(int i =1;i<=a;i++) {
				if(a%i==0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(a+"prime");
			}else {
				System.out.println(a+"not prime");
			}
		}
	}



