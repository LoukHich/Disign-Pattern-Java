
public class Client {
	
	Standard standar ;
	 public Client(Standard standar) {
		this.standar =  standar;
	}
	 
	 public void process (double a ,double b) {
		 standar.operation(a, b);
	 }
	 
	 public static void main(String[] args) {
		Client cl = new  Client(new StandardImp());
		cl.process(7, 5);
		Client cl2 = new Client(new AdapterImpl());
		cl2.process(7, 5);
	}

}
