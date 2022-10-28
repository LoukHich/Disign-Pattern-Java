package Factory;

public class VehiculeFactoryMercedes implements Fabrique{

	
		public Vehicule createVehicule(VehiculeType type) {
			Vehicule vh = null;
			if(type==VehiculeType.VT_DeuxRoue)
				vh= new MercedesDeuxRoue();
			else if(type==VehiculeType.VT_QuatreRoue)
				vh= new QutreRoue();
			return vh;

			}
	

}
