package Factory;

public class Test {
public static void main(String[] args) {
	Client c1= new Client();
	c1.formerVehicule(VehiculeType.VT_DeuxRoue).afficherVehicule();
	c1.formerVehicule(VehiculeType.VT_QuatreRoue).afficherVehicule();
	c1.setpVehicule(new VehiculeFactoryMercedes());
	c1.formerVehicule(VehiculeType.VT_DeuxRoue).afficherVehicule();
}
}
