package Observers;

import Observables.Observable;
import Observables.ObservableImpl;

public class ObserverImpl2 implements Observer{
	double lastState;

	@Override
	public void next(Observable obs) {
		int state = ((ObservableImpl)obs).getEtat();
		if(lastState>state) {
			System.out.println("Observateur2 ===> depression...");
		}
		else if(lastState < state) {
			System.out.println("Observateur2 ===> Augmentaion de la pression...");
		}
		else {
			System.out.println("Observateur2 ===> Statbilité...");
		}
		lastState=state;
	}
	
	
	
	// ***  Methode "PUSH" ***
	/*@Override
	public void update(int etat) {
		
		if(lastState>etat) {
			System.out.println("Observateur2 ===> depression...");
		}
		else if(lastState < etat) {
			System.out.println("Observateur2 ===> Augmentaion de la pression...");
		}
		else {
			System.out.println("Observateur2 ===> Statbilité...");
		}
		lastState=etat;
	}*/
     
}
