
public class Phone {
	private final String os;
	private final String name ;
	private final double price ;
	private  final String memory;
	public Phone(String os, String name, double price, String memory) {
		super();
		this.os = os;
		this.name = name;
		this.price = price;
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", name=" + name + ", price=" + price + ", memory=" + memory + "]";
	}
	
	
}
