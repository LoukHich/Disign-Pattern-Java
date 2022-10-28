
public abstract class Monster {
    protected String name ;
    protected String power;
    
    
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

   public String getPower() {
		return power;
	}


	public void setPower(String power) {
		this.power = power;
	}


public String Power() {
	   return  getPower();
   }


@Override
public String toString() {
	return "Monster [name=" + getName() + ", power=" + getPower() + "]";
}
	
}
