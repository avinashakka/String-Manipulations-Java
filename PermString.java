import java.io.*;
import java.util.*;

public class PermString 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the First String");
		String X = System.console().readLine();
		System.out.println("Enter the Second String");
		String Y = System.console().readLine();
		if(X.length()!= Y.length())
		{
			System.out.println("Not a Permutation");
		}
		
	for(int i=0;i<X.length();i++)
	{
		boolean found = false;
		for(int j=0;j<Y.length();j++)
		{
			if(X.charAt(i) == Y.charAt(j))
			{
				found = true;
				break;
			}
		}
		if(found==false)
		{
			System.out.println("Not a permutation");
			System.exit(0);
		}
		
	}
		
		System.out.println("Strings are permutations of eachother");
		
	}
}

