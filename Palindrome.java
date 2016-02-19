import java.io.*;
import java.util.*;

public class Palindrome
{
	//using O(logN)
	static boolean checkpal(String x)
	{
		if(x.length() == 1 ||x.length() == 0)
			return true;
		if(x.charAt(0) == x.charAt(x.length() - 1))
			return checkpal(x.substring(1,x.length()-1));			
		return false;
	}
	
	// using O(n)
	static boolean checkp(String x)
	{
		int front = 0;
		int back = x.length()-1;
		while(back > front)
		{
			if(x.charAt(front) != x.charAt(back))
				return false;
			
			front++;
			back--;			
		}
		return true;	
	}
	
	public static void main(String[] args)
	{
		Scanner S = new Scanner(System.in);
		System.out.println("Enter String");
		String s = S.nextLine();
		boolean result = checkp(s);
		System.out.println("Reversed String is " + result);		
	}
}