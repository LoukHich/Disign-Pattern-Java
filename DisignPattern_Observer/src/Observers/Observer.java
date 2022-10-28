package Observers;

import Observables.Observable;

public interface Observer {
	// ***  Methode "PUSH" ***
//  public void update(int etat);  
	// ***  Methode "POP" ***
	public void next(Observable obs);
}
