package final_450.strings;

import java.util.Scanner;

public class Longest_Palindrome_String 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.println(longPalindrome(str));

	}

	private static String longPalindrome(String str) 
	{
		if(str.length()==1)	return str;
		
		if(reverse(str))	return str;	
		
		return null;
	}

	private static boolean reverse(String str) 
	{	
		String reverse = "";
		boolean flag = true;
		int i = 0 , j = str.length()-1;
		while(i<j)
		{
			if(str.charAt(i) == str.charAt(j))
			{
				i++;
				j--;
			}
			else	flag=false;
		}
		return flag;
	}

}
