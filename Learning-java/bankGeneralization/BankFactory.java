package bankGeneralization;
public class BankFactory 
{
	public void get(Bank b)
	{
		if(b instanceof MdfcBank)
		{
			MdfcBank mb=(MdfcBank) b;
			mb.amount();
			mb.roi();
			mb.tenure();
		}
		else if(b instanceof IndianBank)
		{
			IndianBank inb=(IndianBank) b;
			inb.amount();
			inb.roi();
			inb.tenure();
		}
		else if(b instanceof IciciBank)
		{
			IciciBank icb=(IciciBank) b;
			icb.amount();
			icb.roi();
			icb.tenure();
		}
		else
		{
			IdfcBank idb=(IdfcBank) b;
			idb.amount();
			idb.roi();
			idb.tenure();
		}
	}

}
