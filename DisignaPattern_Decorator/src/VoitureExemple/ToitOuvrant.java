package VoitureExemple;

public class ToitOuvrant extends DecorateurVoiture{

	/*public ToitOuvrant(Voiture v) {
		this.voiture=v;
	}*/
	
	public ToitOuvrant(Voiture voiture) {
		//super(voiture);
		// TODO Auto-generated constructor stub
		this.voiture=voiture;
	}


	@Override
	public String getLibelle() {
		
		return voiture.getLibelle()+" + " + " Toit Ouvrant "; 
	}

	
	public int getPrix() {
		
		 //return super.getPrix() + 2000;
		return voiture.getPrix()+300;
	}

	@Override
	public int getPoids() {
		
		return voiture.getPoids()+ 30;
	}

}
