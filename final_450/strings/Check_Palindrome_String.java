package final_450.strings;

public class Check_Palindrome_String 
{

	public static void main (String []args)
    {
        String input = "aba";

        StringBuffer new2 = new StringBuffer(input);
        StringBuffer x=new2.reverse();
        String z = new String(new2);
        if(input.equals(z))
        {
            System.out.println("yes");
        }
        else 
        {
            System.out.println("no");
        }
    }
}