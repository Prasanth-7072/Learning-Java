package bankGeneralization;

public class IciciBank implements Bank 
{

	@Override
	public void amount() 
	{
		System.out.println("Icici Bank will offer loan of amount 25l");
	}

	@Override
	public void roi() 
	{
		System.out.println("Icici Bank roi is 20%");
		
		
	}

	@Override
	public void tenure() 
	{
		System.out.println("Icici Bank Tenure is 2.5 Years");
		
	}

}