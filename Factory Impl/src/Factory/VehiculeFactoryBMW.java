package Factory;

public class VehiculeFactoryBMW implements Fabrique{
	
	
public Vehicule createVehicule(VehiculeType type) {
Vehicule vh = null;
if(type==VehiculeType.VT_DeuxRoue)
	vh= new DeuxRoux();
else if(type==VehiculeType.VT_QuatreRoue)
	vh= new QutreRoue();
return vh;

}

  }
