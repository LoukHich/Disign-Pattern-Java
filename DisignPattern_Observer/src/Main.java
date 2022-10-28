import java.util.ArrayList;
import java.util.List;

public class Main {
	
	/*public static class Etudiant {
		private String nom;
		@Override
		public String toString() {
			return "Etudiant [nom=" + nom + ", ID=" + ID + "]";
		}

		private int ID;
		
		public Etudiant(String nom , int ID) {
			this.ID=ID;
			this.nom=nom;
		}
	}*/
	public static void main(String[] args) {
		//Observable
	     Observable obs = new ObservableImp("Tulusko");
	    //Observers 
	     Observer sb1 = new ObserverImp("Hicham");
	     Observer sb2 = new ObserverImp("Kennouf");
	     Observer sb3 = new ObserverImp("Routaibe");
	     Observer sb4 = new ObserverImp("Boudaa");
	    
	     obs.subscribe(sb1);
	     obs.subscribe(sb1);
	     obs.subscribe(sb3);
	     obs.subscribe(sb4);
	    
	     obs.notifySub("Fadihat bnt Stati ");
		/*List<Etudiant> list = new ArrayList<Etudiant>();
		Etudiant etd1 = new Etudiant("Nadori", 1);
		Etudiant etd2 = new Etudiant("Loukili", 2);
		Etudiant etd3 = new Etudiant("Hicham", 3);
		list.add(etd1);
		list.add(etd2);
		list.add(etd3);
	    list.remove(etd2);
		System.out.println(list);*/
	}

}
