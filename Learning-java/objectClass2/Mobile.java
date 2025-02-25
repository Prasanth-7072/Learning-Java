package objectClass2;
public class Mobile 
{
	String name;
	int price;
	String color;
	int imei;
    String brand;
    
    public Mobile(String name,int price,String color,int imei,String brand)
    {
    	this.name=name;
    	this.price=price;
    	this.color=color;
    	this.imei=imei;
    	this.brand=brand;
    	
    }
    
    @Override
    public int hashCode() 
    {
    	return this.imei;
    }
    @Override
    public String toString() 
    {
    	return this.imei+" "+this.name+" "+this.price+" "+this.color+" "+this.brand;
    }
    @Override
    public boolean equals(Object obj) 
    {
    	Mobile m=(Mobile) obj;
    	return this.price==m.price;
    }

}
