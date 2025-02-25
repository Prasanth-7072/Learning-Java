package FBOverloading;
import java .util.Scanner;
public class MainOfFacebook 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		faceBook fb=new faceBook();
		System.out.println("1.Login via phone number\t2.Login via emailid");
		System.out.println("Enter your choice");
		int choice=scn.nextInt();
		switch(choice)
		{
		case 1:System.out.println("enter phoneno");
		       long phno=scn.nextLong();
		       System.out.println("enter pwd1");
		       String pwd1=scn.next();
		       fb.login(phno, pwd1);
		       break;
		case 2:System.out.println("enter emailid");
		       String email=scn.next();
		       System.out.println("enter pwd22");
		       String pwd2=scn.next();
		       fb.login(email, pwd2);
		       break;
		default:System.out.println("Invalid choice");
		       
		
		}
	}

}
