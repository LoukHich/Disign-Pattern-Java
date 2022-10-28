import java.io.Console;

public class PhoneBuilder {
	

	private static String os;
	private static String name ;
	private static double price ;
	private static String memory;
	
	public  PhoneBuilder setOs(String os) {
		this.os=os;
		return this;
	}
    public static String getOs() {
		return os;
	}
	public static String getName() {
		return name;
	}
	public static double getPrice() {
		return price;
	}
	public static String getMemory() {
		return memory;
	}
	public PhoneBuilder setName(String name) {
    	this.name=name;
    	return this;
    }
    
    public PhoneBuilder setMemory(String mem) {
    	this.memory=mem;
    	return this;
    }
    public PhoneBuilder setPrice(double price) {
    	this.price=price;
    	return this;
    }
	
    public Phone build () {
    	
    	return  new Phone( os,  name, price,  memory);
    }
	
	
 
}
