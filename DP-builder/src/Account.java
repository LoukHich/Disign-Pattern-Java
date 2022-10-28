import java.util.Random;

public class Account {
	
	
	private final  Long  id ;
	private final String name ;
	private final String tel ;
	
	
	
	private Account(Builder builder) {
		this.id= builder.id;
		this.name = builder.name;
		this.tel = builder.tel;
	
	}
	
	
	
	public static class Builder{
		private Long id ;
		private String name ;
		private String tel ;
		
		public Builder() {
			
		}
		public Builder id  ( final Long i) {
			
			this.id=i;
			return this;
		}
		
		public Builder name(String name){
			this.name=name;
			return this;
		}
		
		public Builder tel (String tel) {
			this.tel=tel;
			return this;
		}
		
		public Account build() {
			
			return new Account(this);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Long x = new Random().nextLong();
		
		Account acc =  new Account.Builder().id(x)
				                             .name("Nadori")
				                             .tel("0678807430")
				                             .build();
		System.out.println(acc);
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", tel=" + tel + "]";
	}

}
