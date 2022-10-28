
public class AdapterImpl extends AncienImpl implements Standard {

	@Override
	public void operation(double a, double b) {
	
		double res = multiple((int)a, (int)b);
		 print((int) res);
		
	}

}
