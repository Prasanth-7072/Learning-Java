package exception;
public class WrongPinException extends RuntimeException
{
	public WrongPinException(String msg)
	{
		super(msg);
	}

}
