package ArithmeticException1;
public class AE1 
{
	public static void main(String[] args)
	{
		int x=10,y=0;
		System.out.println("Main Starts");
		try
		{
			System.out.println(x/y);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("ArithmeticException Handled");
		}
		System.out.println("Main Ends");
	}

}
