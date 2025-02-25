package exception;
public class InSufficientFund extends RuntimeException 
{
	public InSufficientFund(String msg)
	{
		super(msg);
	}

}
