package InterfaceDatabase;
public class MsSQL implements Databade
{

	@Override
	public void connect() {
		System.out.println("MsSQL database is connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("MsSQL database is disconnected");
		
	}

}