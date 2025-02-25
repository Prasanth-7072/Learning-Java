package datahiding2;
public class Mobile 
{
	private String name;
	private int price;
	private String color;
	private int yom;
	public Mobile(String name,int price,String color,int yom)
	{
		this.name=name;
		this.price=price;
		this.color=color;
		this.yom=yom;
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getPrice()
	{
		return this.price;
	}
	public String getColor()
	{
		return this.color;
	}
	public int getYom()
	{
		return this.yom;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}

}
