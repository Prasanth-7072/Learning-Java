package package1;
public class MainofDemo1 
{
	public static void main(String[] args)
	{
		demo1 de1=new demo1("vivo y40",15000,"red");
		demo1 de2=new demo1("vivo s21 pro",12000,"blue");
		demo1 de3=new demo1("vivi z9 pro",18500,"black");
		demo1 de4=new demo1("vivo v3",20000,"white");
		System.out.println("Name\t\tPrice\tColor\tBrand");
		System.out.println("----------------------------------------------------------------");
		System.out.println(de1.name+"\t"+de1.price+"\t"+de1.color+"\t"+demo1.brand);
		System.out.println(de2.name+"\t"+de2.price+"\t"+de2.color+"\t"+demo1.brand);
		System.out.println(de3.name+"\t"+de3.price+"\t"+de3.color+"\t"+demo1.brand);
		System.out.println(de4.name+"\t\t"+de4.price+"\t"+de4.color+"\t"+demo1.brand);
	}

}
