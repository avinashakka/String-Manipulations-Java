import java.io.*;
import java.util.*;

public class UniqueString 
{
	public static void main(String[] args)
	{
		System.out.println("Please enter a STRING");
		String x = System.console().readLine();
		
		for(int i=0;i<x.length();i++)
		{
			for(int j=i+1;j<x.length();j++)
			{
				if(Character.toLowerCase(x.charAt(i))== Character.toLowerCase(x.charAt(j)))
				{
					System.out.println("All characters in the String are not Unique");
					System.exit(0);
					
				}
			}
		}
		
		System.out.println("All characters unique in the String");
		
	}
}
