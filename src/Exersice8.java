
public class Exersice8 {

	public static void main(String args[])
	{
		System.out.println(palindrome("anna"));
		System.out.println(palindrome("a toyota"));
		System.out.println(palindrome("qasim"));
		System.out.println(palindrome("bob"));
		
	}

	public static boolean palindrome(String x)
	{
		x = x.replace(" ", "");                         //strings are immautable thats why you cant just change it without an assignment statement.
		String reversed = "";
		boolean result;
		for (int i=x.length()-1;i>=0;i--)
		{
			reversed = reversed + x.charAt(i);
		}
		if (x.equals(reversed))
		{
			result = true;
		}
		else
		{
			result = false;
		}
		if (result == true)
		{
			System.out.println(x + " is a PALINDROME");
		}
		else
		{
			System.out.println(x + " is not a PALINDROME");
		}
		return result;
	}


}
