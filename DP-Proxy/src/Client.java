
public class Client {
	Standard standard ;
	public Client(Standard standard ) {
		this.standard =standard;
		// TODO Auto-generated constructor stub
	}
	   
	
	public void operation() {
		standard.process();
	}
	public static void main(String[] args) {
		//Client client = new Client(new StandardImpl1());
	Client client = new Client(new Proxy());
	   client.operation();
		
		
	}
	
}
