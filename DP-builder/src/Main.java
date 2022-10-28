
public class Main {
	
	public static void main(String[] args) {
		
		Phone ph =  new PhoneBuilder().setName("APPLE")
				                      .build();
		
		System.out.println(ph);
		
	}

}
