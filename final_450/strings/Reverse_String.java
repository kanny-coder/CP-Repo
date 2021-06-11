package final_450.strings;

public class Reverse_String {

	public static void main(String[] args) 
	{
		String to_be_rev = "Hello";
		StringBuffer new2 = new StringBuffer(to_be_rev);
		new2.reverse();
//		char rev[] = to_be_rev.toCharArray();
//		for (int i = 0; i < rev.length; i++) 
//		{
//			System.out.print(rev[rev.length-i-1]);
//		}
		
		
		System.out.println(new2);
		
	}

}
