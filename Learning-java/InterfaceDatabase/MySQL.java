package InterfaceDatabase;
public class MySQL implements Databade
{

	@Override
	public void connect() {
		System.out.println("MySQL database is connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("MySQL database is disconnected");
		
	}

}

