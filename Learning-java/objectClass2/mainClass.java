package objectClass2;
public class mainClass 
{
	public static void main(String[] args) 
	{
		Mobile m1=new Mobile("A",15999,"blue ",12345678,"vivo");
		Mobile m2=new Mobile("B",16999,"red  ",87654321,"mi");
		Mobile m3=new Mobile("C",15999,"black",12345689,"iqoo");
		Mobile m4=new Mobile("D",17999,"white",12348778,"xiomi");
		System.out.println("m1="+m1.hashCode());
		System.out.println("m2="+m2.hashCode());
		System.out.println("m3="+m3.hashCode());
		System.out.println("m4="+m4.hashCode());
		System.out.println("---------------------");
		System.out.println("m1="+m1.toString());
		System.out.println("m2="+m2);
		System.out.println("m3="+m3);
		System.out.println("m4="+m4);
		System.out.println("---------------------");
		System.out.println(m2.equals(m4));
		System.out.println(m1.equals(m3));
	}
}
