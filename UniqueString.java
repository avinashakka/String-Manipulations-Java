import java.io.*;
import java.util.*;
//Program to check if a string has all unique character literals
public class UniqueString 
{
	public static void main(String[] args)
	{
		System.out.println("Please enter a STRING");
		String x = System.console().readLine();
		
		boolean[] chars = new boolean[256];
		//takes O(n)
		for(int i=0;i<x.length();i++)
		{
			int asciiValue = x.charAt(i);
			if(!chars[asciiValue])
			{
				chars[asciiValue] = true;
			}
			else
			{
				System.out.println("String does not contai unique characters");
				System.exit(0);
			}
		}
		
		/*
		//takes O(n2)
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
		*/
		
		System.out.println("All characters unique in the String");
		
	}
}
