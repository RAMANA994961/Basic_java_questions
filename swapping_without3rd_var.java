package java1;
import java.util.Scanner;
public class swapping_without3rd_var {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int a = sc.nextInt();
	System.out.println("enter another number");
	int b= sc.nextInt();
	System.out.println("before swap: a ="+a+",b = "+b);
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("after swap: a ="+a+",b = "+b);
}
}
