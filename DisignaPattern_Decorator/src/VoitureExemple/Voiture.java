package VoitureExemple;

public  abstract class Voiture {
	String libelle="";
	int prix;
	int poids;
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public  int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public int getPoids() {
		return poids;
	}
	
	public String toString() { return "Voiture : " + getLibelle() + ", Prix : " + getPrix() + ", Poids : " + getPoids(); }
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	 
}
