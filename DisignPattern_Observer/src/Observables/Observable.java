package Observables;

import Observers.Observer;

public interface Observable {
  public void subscribe(Observer observer);
  public void usubscribe(Observer observer);
  public void notifyObserver ();
}
