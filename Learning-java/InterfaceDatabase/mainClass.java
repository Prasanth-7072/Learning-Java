package InterfaceDatabase;
import java.util.Scanner;
public class mainClass 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("1.Oracle\n2.MySQL\n3.MsSQL\n4.Db2");
		System.out.println("Enter your choice");
		int choice=scn.nextInt();
		switch(choice)
		{
		case 1:Oracle o=new Oracle();
		       o.connect();
		       o.disconnect();
		       break;
		case 2:MySQL my=new MySQL();
	           my.connect();
	           my.disconnect();
	           break;
		case 3:MsSQL ms=new MsSQL();
	           ms.connect();
	           ms.disconnect();
	           break;
		case 4:Db2 d=new Db2();
	           d.connect();
	           d.disconnect();
	           break;
	    default:System.out.println("INVALID CHOICE");
		}
	}

}
