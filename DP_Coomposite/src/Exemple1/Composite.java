package Exemple1;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Composant{
 
    private List<Composant>	 elements  = new ArrayList<Composant>();
    
	public Composite(String name) {
		super(name);
		
	}

	@Override
	public void afficher() {
		String tab = "--";
		for(int i =0 ;i<this.level ;i++) {
			tab+="--";
		}
	    System.out.println(tab+" "+name);
		//elements.forEach((elm)->elm.afficher());
		for(Composant elm :this.elements) {
			elm.afficher();
		}
	}

	public void addElement(Composant cmp) {
		cmp.level= this.level+1;
		System.out.println(cmp.name+" "+cmp.level);
		this.elements.add(cmp);
	}
	
	public ArrayList<Composant> getElements (){
		return (ArrayList<Composant>) elements;
	}
	

}
