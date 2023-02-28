
public class Exersice2 {


	public static void main(String args[])
	{
		System.out.println(reverse("delzoobmab"));
		System.out.println(reverse("naMnorImaI"));
		
	}

	public static String reverse(String ipx)
	{
		StringBuilder reversed = new StringBuilder();

		for (int i = ipx.length()-1 ; i >= 0 ; i--)
		{
			reversed.append(ipx.charAt(i));

		}
		return reversed.toString();
	}
}

//String reversedword = "";
//for (int i = x.length()-1 ; i >= 0 ; i--)
//{ 
//	reversedword = reversedword + x.charAt(i);                                   // or you use this
//	System.out.println(reversedword);
//}