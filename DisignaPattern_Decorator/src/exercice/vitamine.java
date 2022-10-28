package exercice;

public class vitamine extends PersonnageDecorator{

	public vitamine(Personnage p) {
           per=p;
           force =10;
	}
	
	@Override
	public int getForce() {
		  
		return per.getForce()+force;
	}
   @Override
public String getDescription() {
	// TODO Auto-generated method stub
	return per.getDescription()+" vitamin";
}
}
