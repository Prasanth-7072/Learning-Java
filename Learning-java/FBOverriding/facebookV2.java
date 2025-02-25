package FBOverriding;

public class facebookV2 extends facebookV1
{
	public void reels()
	{
		System.out.println("reels uploaded");
	}
	@Override
	public void like()
	{
		System.out.println("1.thumbsup\n2.heart\n3.smile");
	}
	

}
