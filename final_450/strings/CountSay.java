package final_450.strings;

import java.util.Scanner;

public class CountSay 
{
	
	private static String cAndSay(int n)
	{
		if(n==1)
			return "1";
		return added(cAndSay(n-1));
	}
	private static String added(String str)
	{
		StringBuffer sb = new StringBuffer();
		var i = 0;
		
		while(i<str.length())
		{
			int count = 0;
			char ch = str.charAt(i);
			while(i<str.length() && str.charAt(i)==ch)
			{
				count++;
				i++;
			}
			sb.append(count+""+ch);
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		System.out.println(cAndSay(n));
	}

}
