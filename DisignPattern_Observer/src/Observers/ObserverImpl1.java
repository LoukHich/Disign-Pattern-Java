package Observers;

import Observables.Observable;
import Observables.ObservableImpl;

public class ObserverImpl1 implements Observer{
    double somme ;
 // ***  Methode "POP" ***
	@Override
	public void next(Observable obs) {
		somme+=  ((ObservableImpl) obs).getEtat();
		System.out.println("Observer1 "+somme);
	}
    
    
    //// ***  Methode "PUSH" ***
	/*@Override
	public void update(int etat) {
		somme+=etat;
		
		System.out.println("Observer1 "+somme);
		
	}*/

}
