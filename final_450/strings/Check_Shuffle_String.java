package final_450.strings;

public class Check_Shuffle_String {

	public static void main(String[] args) 
	{
		String str1 = "XY";
		String str2 = "12";
		String res = "X1Y2";
		
		if(str1.length()+str1.length() != res.length())
			System.out.println("NO");
		
		else
		{
			int i = 0,j = 0,k = 0;
			
			while(k<res.length())
			{
				if(i<str1.length() && str1.charAt(i) == res.charAt(k))
					i++;
				else if(j<str1.length() && str2.charAt(j) == res.charAt(k))
					j++;
				else
					break;
				k++;
			}
			
			if(i<str1.length() || j<str2.length())
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		

	}

}
