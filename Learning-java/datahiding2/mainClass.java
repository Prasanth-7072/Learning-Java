package datahiding2;
public class mainClass 
{
	public static void main(String[] args)
	{
		Mobile m1=new Mobile("Oppo",15999,"Red",2006);
		Mobile m2=new Mobile("Redmi",16599,"Blue",2005);
		Mobile m3=new Mobile("Vivo",17699,"Black",2010);
		Mobile m4=new Mobile("Realme",13000,"White",2011);
		Mobile m5=new Mobile("Iqoo",12599,"Grey",2015);
		Mobile m6=new Mobile("Iphone",30000,"Blue",2020);
		System.out.println("Name\t\tPrice\t\tColor\t\tYOM");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(m1.getName()+"\t\t"+m1.getPrice()+"\t\t"+m1.getColor()+"\t\t"+m1.getYom());
		System.out.println(m2.getName()+"\t\t"+m2.getPrice()+"\t\t"+m2.getColor()+"\t\t"+m2.getYom());
		System.out.println(m3.getName()+"\t\t"+m3.getPrice()+"\t\t"+m3.getColor()+"\t\t"+m3.getYom());
		System.out.println(m4.getName()+"\t\t"+m4.getPrice()+"\t\t"+m4.getColor()+"\t\t"+m4.getYom());
		System.out.println(m5.getName()+"\t\t"+m5.getPrice()+"\t\t"+m5.getColor()+"\t\t"+m5.getYom());
		System.out.println(m6.getName()+"\t\t"+m6.getPrice()+"\t\t"+m6.getColor()+"\t\t"+m6.getYom());
		System.out.println();
		System.out.println("Old price");
		System.out.println("-------------");
		System.out.println(m1.getPrice());
		System.out.println(m2.getPrice());
		System.out.println(m3.getPrice());
		System.out.println(m4.getPrice());
		System.out.println(m5.getPrice());
		System.out.println(m6.getPrice());
		System.out.println();
		m1.setPrice(m1.getPrice()+5000);
		m2.setPrice(m2.getPrice()+5000);
		m3.setPrice(m3.getPrice()+5000);
		m4.setPrice(m4.getPrice()+5000);
		m5.setPrice(m5.getPrice()+5000);
		m6.setPrice(m6.getPrice()+5000);
		
		System.out.println();
		System.out.println("New price");
		System.out.println("-------------");
		System.out.println(m1.getPrice());
		System.out.println(m2.getPrice());
		System.out.println(m3.getPrice());
		System.out.println(m4.getPrice());
		System.out.println(m5.getPrice());
		System.out.println(m6.getPrice());
		
		
	}

}
