package bankGeneralization;
public class IndianBank implements Bank 
{

	@Override
	public void amount() 
	{
		System.out.println("Indian Bank will offer loan of amount 30l");
	}

	@Override
	public void roi() 
	{
		System.out.println("Indian Bank roi is 14.5%");
		
		
	}

	@Override
	public void tenure() 
	{
		System.out.println("Indian Bank Tenure is 5 Years");
		
	}

}