package VoitureExemple;

public class GPS extends DecorateurVoiture{
    public GPS(Voiture voiture) {
	//	super(voiture);
    	//System.out.println(super.getPrix());
		this.voiture =voiture;
		
	}
	/* Voiture voiture;
	public GPS(Voiture v) {
	 voiture=v;
	}*/
	public String getLibelle() { return /*super.getLibelle()*/voiture.getLibelle() +" + " + " GPS "; }
	public int getPrix() {return  voiture.getPrix()+ 100;}
	public int getPoids() {return  voiture.getPoids()+ 10;}	
	
}
