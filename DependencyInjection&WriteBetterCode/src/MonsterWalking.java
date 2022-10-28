
public class MonsterWalking extends MonsterDecorator{
	
	public MonsterWalking(Monster monster) {
		this.monster=monster;
	}

	@Override
	public String getPower() {
		
		return this.monster.getPower()+" Walking ";
	}

	/*@Override
public String getName() {

	return monster.getName();
}*/
	
}
