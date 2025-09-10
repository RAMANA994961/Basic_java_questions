package java1;
import java.util.Scanner;
public class leap_year {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if((a%400==0)|| (a%4==0 && a%100 !=0)){
			System.out.println(a + "leap year");
		}else {
			System.out.println(a + "not leap year");
		}
	}

}
