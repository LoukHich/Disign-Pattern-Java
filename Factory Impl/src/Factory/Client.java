package Factory;

public class Client{
	Fabrique pVehicule;
	public Client() {
		pVehicule = new VehiculeFactoryBMW();
	}
	public void setpVehicule(Fabrique pVehicule) {
		this.pVehicule = pVehicule;
	}
	public Vehicule formerVehicule(VehiculeType type) {
		return pVehicule.createVehicule(type);
	}
}
