import java.util.Iterator;
import java.util.Scanner;

public class Exersice6 {

	public static void main(String args[])
	{
		System.out.println(charcount("abracadabra", 'a'));
	}

	//	Your method could be declared as follows:
	public static int charcount(String ipx, char c)
	{
		int count =0;
		for (int i = 0; i<ipx.length(); i++) {
			if (ipx.charAt(i) == c)
			{
				count++;
			}

		}
		return count;

	}

}

