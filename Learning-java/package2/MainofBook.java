package package2;
public class MainofBook 
{
	public static void main(String[] args)
	{
		Book b1=new Book("Thirukural",100,1330,"Thiruvalluvar");
		Book b2=new Book("Silapathigaram",250,300,"Ilangoadigal");
		Book b3=new Book("Kambaramayanam",500,2500,"Kambar");
		Book b4=new Book("Athichudi",300,50,"Avvaiyar");
		Book b5=new Book("Seerapuranam",500,400,"Umarupulavar");
		System.out.println("Name\t\tPrice\tNop\tBrand");
		System.out.println("----------------------------------------------------");
		System.out.println(b1.name+"\t"+b1.price+"\t"+b1.nop+"\t"+b1.author);
		System.out.println(b2.name+"\t"+b2.price+"\t"+b2.nop+"\t"+b2.author);
		System.out.println(b3.name+"\t"+b3.price+"\t"+b3.nop+"\t"+b3.author);
		System.out.println(b4.name+"\t"+b4.price+"\t"+b4.nop+"\t"+b4.author);
		System.out.println(b5.name+"\t"+b5.price+"\t"+b5.nop+"\t"+b5.author);
	}

}
