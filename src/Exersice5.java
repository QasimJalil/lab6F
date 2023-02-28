import java.util.Iterator;
import java.util.Scanner;

public class Exersice5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// TODO Auto-generated method stub
//		Scanner myscanner = new Scanner(System.in);
//		System.out.println("input a long");
//		int n = myscanner.nextInt();
//		int  factorial = 1;
//		for (int i =1; i<=n; i++) {
//			factorial = factorial *i;
//		}
//		System.out.println("factorial of " + n + " is " + factorial);
		System.out.println("factorial of given number is " + factorial(15));                       //change 5 to anything
	}

	public static long factorial(int n)
	{
//		Scanner myscanner = new Scanner(System.in);
//		System.out.println("input a long");
//		n = myscanner.nextInt();
		int  factorial = 1;
		for (int i =1; i<=n; i++) {
			factorial = factorial *i;
		}
		return factorial;
	}
}