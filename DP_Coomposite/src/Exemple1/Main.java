package Exemple1;

public class Main {
    
	
	public static void main(String[] args) {
		Composite root = new Composite("Root");
		Composite composite1 = new Composite("Composite1");
		root.addElement(composite1);
		root.addElement(new Element("11"));
		root.addElement(new Element("12"));
		root.addElement(new Element("13"));
		composite1.addElement(new Element("21"));
		composite1.addElement(new Element("22"));
		composite1.addElement(new Element("23"));
		root.afficher();
		
		Integer a = 100;
		Integer b=100;
		Integer c=128;
		Integer d=128;
		System.out.println(a==b);
		System.out.println(c==d);
		//Composite Linux = new Composite("Linux");
		/*Composite POI  = new Composite("POI");
		Composite Excel =new Composite("Style");
		Element truque = new Element("truque");
		
		Composite JEE  = new Composite("JEE");
		root.addElement(POI);
		POI.addElement(new Element("Excel"));
		POI.addElement(Excel);
		Excel.addElement(truque);
		
		//root.addElement(Excel);
		root.addElement(JEE);
		root.addElement(Linux);
		root.afficher();*/
		//POI.getElements().forEach(elm->System.out.println(elm.level));
	}
}
