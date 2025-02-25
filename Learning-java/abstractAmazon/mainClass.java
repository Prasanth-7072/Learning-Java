package abstractAmazon;
public class mainClass 
{
	public static void main(String[] args)
	{
		System.out.println("Version1");
		System.out.println("-------------");
		amazonV1.login();
		amazonV1.shop();
		amazonV1.prime();
		amazonV1.logout();
		System.out.println("*************");
		System.out.println("Version2");
		System.out.println("-------------");
		amazonV2.login();
		amazonV2.shop();
		amazonV2.prime();
		amazonV2 a2=new amazonV2();
		a2.payBills();
		amazonV2.logout();
	}

}
