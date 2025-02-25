package bankGeneralization;
public class MdfcBank implements Bank 
{

	@Override
	public void amount() 
	{
		System.out.println("Mdfc Bank will offer loan of amount 20l");
	}

	@Override
	public void roi() 
	{
		System.out.println("Mdfc Bank roi is 20%");
		
		
	}

	@Override
	public void tenure() 
	{
		System.out.println("Mdfc Bank Tenure is 3 Years");
		
	}

}
