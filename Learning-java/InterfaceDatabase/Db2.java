package InterfaceDatabase;
public class Db2 implements Databade
{

	@Override
	public void connect() {
		System.out.println("Db2 database is connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Db2 database is disconnected");
		
	}
}
