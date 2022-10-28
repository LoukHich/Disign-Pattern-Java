package VoitureExemple;

public class Regulateur extends DecorateurVoiture{
	
	
	/*public Regulateur(Voiture v) {
		voiture=v;
	}*/
	
	public Regulateur(Voiture voiture) {
		//super(voiture);
		// TODO Auto-generated constructor stub
		this.voiture=voiture;
	}
	
	public String getLibelle() { return voiture.getLibelle()+" + " + " Regulateur "; }
	public int getPrix() {return voiture.getPrix() + 200;}
	public int getPoids() {return voiture.getPoids() + 20;}	
}
