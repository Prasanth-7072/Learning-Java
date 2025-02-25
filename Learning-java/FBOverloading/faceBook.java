package FBOverloading;
public class faceBook 
{
	public void login(long phno,String pwd1)
	{
		System.out.println("Login done via phone number");
	}
	public void login(String email,String pwd2)
	{
		System.out.println("Login done via emailid");
	}

}

