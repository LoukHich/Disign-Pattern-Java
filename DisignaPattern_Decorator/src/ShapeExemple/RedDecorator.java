package ShapeExemple;

public class RedDecorator extends ShapeDecorator{

	public RedDecorator(Shape decoratedShape) {
		super(decoratedShape);
		
	}

	@Override
	public void draw() {
	
	    super.draw();
		setRedBorder(decoratedShape);
	}
    
	private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
}
