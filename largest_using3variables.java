package java1;
import java.util.Scanner;
public class largest_using3variables {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int a = sc.nextInt();
	System.out.println("enter 2nd number");
	int b = sc.nextInt();
	System.out.println("enter 3rd number");
	int c = sc.nextInt();
	if(a>b) {
		System.out.println(a+ "is largest");
	}
	else if(b>c) {
		System.out.println(b+ "is largest");
	}
	else if(c>a) {
		System.out.println(c+ "is largest");
		
		
	}else {
		System.out.println("equal");
	}
	
}
}
