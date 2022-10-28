
public class Client {
Vehicule pVehicule;

public Vehicule getVehicule() {
	return pVehicule;
}
public Client(int type) {
	if(type==2)
		pVehicule= new DeuxRoue();
	else if (type==4) {
		pVehicule = new QuatreRoue();
	}
	else {
		System.out.println("Erreur");
	}
		
}
}
