package VoitureExemple;

public class Main {
 
	public static void main(String[] args) {
		// System.out.println(new Voiture().getPrix()); 
		Voiture v1 = new Coursa();
        System.out.println(v1);
        
        Voiture v2 = new C2();
        System.out.println(v2);
        
       
        
        v2=new Regulateur(v2);
        System.out.println(v2);
        v2 = new GPS(v2);
        System.out.println(v2);
        v2= new ToitOuvrant(v2);
        System.out.println(v2);
      
       // v2.getLibelle()
	}
}
