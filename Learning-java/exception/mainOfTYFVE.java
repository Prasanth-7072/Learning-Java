package exception;
import java.util.Scanner;
public class mainOfTYFVE 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the person age:");
		int age=scn.nextInt();
		if(age<18)
		{
			try 
			{
				throw new ToYoungForVoting("to young for voting because age is below 18");
				
			}
			catch(ToYoungForVoting e)
			{
			      e.printStackTrace();	
			}
		}
		else
		{
			System.out.println("Eligible for voting!!!");
		}
	}

}