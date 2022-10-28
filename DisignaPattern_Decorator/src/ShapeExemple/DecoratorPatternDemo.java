package ShapeExemple;


public class DecoratorPatternDemo {

	public static void main(String[] args) {
		  Shape cercle = new Cercle();

		  Shape redCercle = new RedDecorator(cercle);

	     // Shape redRectangle = new RedDecorator(new Rectangle());
          
	     // cercle.draw();
	      redCercle.draw();
	      redCercle= new RedDecorator(redCercle);
	      redCercle.draw();
	    //  redRectangle.draw();
	}

}
