package FBOverriding;

public class mainOfFacebookV 
{
	public static void main(String[] args)
	{
		facebookV1 fv1=new facebookV1();
		fv1.login();
		fv1.message();
		fv1.like();
		fv1.login();
		System.out.println("----------------------------");
		facebookV2 fv2=new facebookV2();
		fv2.login();
		fv2.message();
		fv2.like();
		fv2.reels();
		fv2.logout();
	}
	

}
