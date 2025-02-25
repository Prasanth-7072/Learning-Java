package ObjectClass1;
public class mainClass 
{
	public static void main(String[] args)
	{
		Bike b1=new Bike("splender","blue",85000,2020);
		Bike b2=new Bike("RoyalEnfield","black",200000,2021);
		Bike b3=new Bike("mt15","orange",85000,2020);
		Bike b4=new Bike("splender","blue",85000,2022);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		System.out.println(b4.hashCode());
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b1.equals(b4));
		System.out.println(b2.equals(b3  ));
		
		
		
	}

}
