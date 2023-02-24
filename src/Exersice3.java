import java.util.Scanner;

public class Exersice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		boolean result;
		String s = "";

		Scanner year = new Scanner(System.in);
		System.out.println("Give me a year");
		i = year.nextInt();
		result = LeapYear(i);
		s = result?"a leap year":"not a leap year";
		System.out.println(i + " is " + s);
		
		
	}

	public static boolean LeapYear(int x) {


		if (x % 4 != 0) {
			return false;
		} else if (x % 100 != 0) {
			return true;
		} else if (x % 400 != 0) {
			return false;
		} else {
			return true;
		}
	}
}


