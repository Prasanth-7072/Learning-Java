package bankGeneralization;
import java.util.Scanner;
public class MainClass 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		BankFactory bf=new BankFactory();
		System.out.println("1.MdfcBank\n2.IndianBank\n3.IciciBank\n4.IdfcBank");
		System.out.println("Enter your Choice");
		int choice=scn.nextInt();
		switch(choice)
		{
		case 1:bf.get(new MdfcBank());
		       break;
		case 2:bf.get(new IndianBank());
	           break;
		case 3:bf.get(new IciciBank());
	           break;
		case 4:bf.get(new IdfcBank());
	           break;
	    default:System.out.println("Invalid Choice");
		}
		
	}

}
