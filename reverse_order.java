package java1;
import java.util.Scanner;
public class reverse_order {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for( int i=n ; i>=1;i--) {
			System.out.print(i);
		}
	}

}
