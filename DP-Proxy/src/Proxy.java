import java.util.Random;

import javax.management.RuntimeErrorException;

public class Proxy implements Standard{
	
	Standard cible = new StandardImpl1();

	@Override
	public void process() {
		
		boolean d = new Random().nextBoolean();
		if(d) {
			cible.process();
		}else {
			throw new RuntimeException("Forrbidden 403 !!");
		}
		
	}
	

}
