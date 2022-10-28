package exercice;

public class Main {

	public static void main(String[] args) {
		System.out.println("******************Nadori*******************");
		
		Personnage cal = new Clavier();
		System.out.println(cal.getDescription());
	    System.out.println(cal.getForce());	
	    cal= new vitamine(new vitamine(cal));
	    System.out.println(cal.getDescription());
	    System.out.println(cal.getForce());	
	    cal = new vitamine(cal);
	    System.out.println(cal.getDescription());
	    System.out.println(cal.getForce());	
		//cal = new vitamine(cal);
		
	}
	
}
