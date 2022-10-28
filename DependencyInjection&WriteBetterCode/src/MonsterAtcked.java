
public class MonsterAtcked extends MonsterDecorator{

	
	public MonsterAtcked(Monster monster) {
		this.monster = monster;
	}
	@Override
	public String getPower() {
        return this.monster.getPower()+" Attack ";
	}

	/* @Override
	public String getName() {
		
		return monster.getName();
	}*/
	
}
