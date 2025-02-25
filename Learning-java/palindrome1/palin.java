package palindrome1;

public class palin 
{
	public static void print(String s1)
{
	char c=' ';
	String s2="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		c=s1.charAt(i);
		s2=s2+c;
	}
	System.out.println(s1);
	System.out.println(s2);
	if(s1.equals(s2))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("notpalindrome");
	}
}

}
