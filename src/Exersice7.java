
public class Exersice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("factorial of given number is " + factorial(40));    
	}
	public static long factorial(int n)
	{
		if (n==1)
		{
			System.out.println("Done");
		return 1;
		}
		else
		{
			return n * factorial(n-1);
		}
	}
}
