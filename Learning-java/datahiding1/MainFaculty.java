package datahiding1;
public class MainFaculty 
{
	public static void main(String[] args)
	{
		Faculty f1=new Faculty("A",25,15000);
		Faculty f2=new Faculty("B",31,16000);
		Faculty f3=new Faculty("C",24,17000);
		Faculty f4=new Faculty("D",28,14000);
		Faculty f5=new Faculty("E",26,13000);
		System.out.println("Name\t\tAge\t\tSalary");
		System.out.println("------------------------------------------------------------------------");
		System.out.println(f1.getName()+"\t\t"+f1.getAge()+"\t\t"+f1.getSal());
		System.out.println(f2.getName()+"\t\t"+f2.getAge()+"\t\t"+f2.getSal());
		System.out.println(f3.getName()+"\t\t"+f3.getAge()+"\t\t"+f3.getSal());
		System.out.println(f4.getName()+"\t\t"+f4.getAge()+"\t\t"+f4.getSal());
		System.out.println(f5.getName()+"\t\t"+f5.getAge()+"\t\t"+f5.getSal());
		System.out.println();
		System.out.println("Old Salary");
		System.out.println("-----------");
		System.out.println(f1.getSal());
		System.out.println(f2.getSal());
		System.out.println(f3.getSal());
		System.out.println(f4.getSal());
		System.out.println(f5.getSal());
		
		System.out.println();
		

		f1.setSal(f1.getSal()+2000);
		f2.setSal(f2.getSal()+2000);
		f3.setSal(f3.getSal()+2000);
		f4.setSal(f4.getSal()+2000);
		f5.setSal(f5.getSal()+2000);
		
		System.out.println("New Salary");
		System.out.println("-----------");
		System.out.println(f1.getSal());
		System.out.println(f2.getSal());
		System.out.println(f3.getSal());
		System.out.println(f4.getSal());
		System.out.println(f5.getSal());
		
		

	}
}
