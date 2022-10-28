
public class MonstrFlying extends MonsterDecorator{

	public MonstrFlying(Monster monster) {
		this.monster = monster;
	}
	
	@Override
	public String getPower() {
		
		return monster.getPower()+" Flying";
	}
	
	/*@Override
	public String getName() {
		
		return monster.getName();
	}*/

}
