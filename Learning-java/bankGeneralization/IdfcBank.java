package bankGeneralization;

public class IdfcBank implements Bank 
{

	@Override
	public void amount() 
	{
		System.out.println("Idfc Bank will offer loan of amount 22l");
	}

	@Override
	public void roi() 
	{
		System.out.println("Idfc Bank roi is 17%");
		
		
	}

	@Override
	public void tenure() 
	{
		System.out.println("Idfc Bank Tenure is 2 Years");
		
	}

}