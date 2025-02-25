package datahiding1;
public class Faculty 
{
	private String name;
	private int age;
	private int sal;
	public Faculty(String name,int age,int sal)
	{
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public int getSal()
	{
		return this.sal;
	}
	public void setSal(int sal)
	{
		this.sal=sal;
	}

}
