package ClassCastException1;
public class CCE1 
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		Object obj=new CCE1();
		CCE1 c2=(CCE1) obj;
		try
		{
			CCE1 c1=(CCE1)new Object();
		}
		catch(ClassCastException c)
		{
			System.out.println("ClassCastException Handled");
		}
		System.out.println("Main Ends");
		
		
	}

}
