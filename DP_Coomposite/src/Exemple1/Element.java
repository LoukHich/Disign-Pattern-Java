package Exemple1;

public class Element extends Composant{

	
	public Element(String name) {
		super(name);
		
	}

	@Override
	public void afficher() {
		String tab = "--";
		for(int i =0 ;i<this.level ;i++) {
			tab+="--";
		}
	    System.out.println(tab+" "+name);
		
	}

}
