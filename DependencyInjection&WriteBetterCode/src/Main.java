
public class Main {
	
	
	public static void main(String[] args) {
		System.out.println("************ Teste ***************");
	      Monster  halloufa = new Monster1();
	      System.out.println(halloufa );
	      halloufa = new MonsterSwiming(halloufa);
	      System.out.println(halloufa );
		  halloufa = new MonsterAtcked(halloufa);
	      System.out.println(halloufa );
	      halloufa= new MonstrFlying(halloufa);
	      System.out.println(halloufa);
	}

}
