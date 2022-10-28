package Observables;

import java.util.ArrayList;
import java.util.List;

import Observers.Observer;

public class ObservableImpl implements Observable{
     private int etat ;
     private List<Observer> observers = new ArrayList<Observer>();
     
	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void usubscribe(Observer observer) {
		observers.remove(observer);
		
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
		notifyObserver();
	}

	@Override
	public void notifyObserver() {
		for(Observer obs :observers) {
			obs.next(this);
		}
		
	}

}
