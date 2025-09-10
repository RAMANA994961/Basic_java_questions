// 
//package java1;
//import java.util.Scanner;
//public class fibonacci {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter range");
//		int n=sc.nextInt();
//		int fib1=5;
//		int fib2=7;
//		for(int i=1;i<=n;i++) {
//			System.out.println(fib1 + " ");
//			int d = fib1+fib2;
//			fib1=fib2;
//			fib2=d;
//		}
//	}
//}

package java1;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range: ");
        int n = sc.nextInt();

        int fib1 = 5, fib2 = 7;

        for (int i = 1; i <= n; i++) {
            System.out.println(fib1);

            int d = fib1 + fib2;
            fib1 = fib2;
            fib2 = d;
        }
    }
}
