
public class MonsterSwiming extends MonsterDecorator{

	public MonsterSwiming(Monster monster) {
		this.monster = monster;
	}
	
	@Override
	public String getPower() {


		return monster.getPower()+" Swiming";
	}
/*	@Override
    public String getName() {
	
	 return monster.getName();
   }*/
}
