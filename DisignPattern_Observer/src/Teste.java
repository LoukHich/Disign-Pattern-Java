import java.awt.Button;

import Observables.Observable;
import Observables.ObservableImpl;
import Observers.Observer;
import Observers.ObserverImpl1;
import Observers.ObserverImpl2;

public class Teste {

	public static void main(String[] args) {
		ObservableImpl observable1 = new ObservableImpl();
		ObserverImpl1 observer1 =  new ObserverImpl1();
		ObserverImpl2 observer2 =  new ObserverImpl2();
		 observable1.subscribe(new Observer() {
             
				private int somme;
				@Override
				public void next(Observable obs) {
					somme+= ((ObservableImpl)obs).getEtat();
					System.out.println("Observer anonyme1 ===> "+somme);
				}
				 
			 });
		 observable1.subscribe( (obs)->{
			 int somme = ((ObservableImpl)obs).getEtat();
				
			 System.out.println("Observer anonyme2 ===> "+somme);
		 });
		observable1.subscribe(observer1);
		observable1.subscribe(observer2);
		observable1.setEtat(5);
	     System.out.println("------------------------");
		observable1.setEtat(50);
		  System.out.println("------------------------");
			observable1.setEtat(30);
			 System.out.println("------------------------");
			
				observable1.setEtat(120);
				  
			//	observable1.usubscribe(observer2);
				System.out.println("------------------------");
				observable1.setEtat(15);
				
				System.out.println("################################");
				Button btn =new Button();
			
	}
	
}
