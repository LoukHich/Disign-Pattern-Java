package Exemple1;

public abstract class Composant {
  
	 
	protected String name;
	protected int level;
    public Composant(String name) {
		this.name=name;
	}
	
	public String identation() {
		String tab = "--";
		for(int i =0 ;i<level ;i++) {
			tab+="--";
		}
		return tab;
	}
	public abstract void afficher();
}
