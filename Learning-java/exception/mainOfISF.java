package exception;
import java.util.Scanner;
public class mainOfISF 
{
	static double balance=50000.0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the PIN:");
		int pin=sc.nextInt();
		
		
		if(pin==12345)
		{
			System.out.print("Enter the Amount:");
			double amount=sc.nextDouble();
			if(amount>balance)
			{
				System.out.println("Available Balance:"+balance+" Rs")
				throw new InSufficientFund("Insufficient Balance!!!");
			}
			
			else
			{
				System.out.println("Withdraw Amount:"+amount+" Rs");
				balance=balance-amount;
				System.out.println("Available Balance:"+balance+" Rs");
			}
		}
		else
		{
			throw new WrongPinException("Invalid PIN!!!");
		}
		
		
		
	}

}
