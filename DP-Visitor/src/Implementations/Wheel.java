package Implementations;

import Interfaces.CarElement;
import Interfaces.CarElementVisitor;

public class Wheel implements CarElement {

    private String name ;

    Wheel(String name ){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
    /*interface CarElementVisitor {

}*/

    @Override
    public void accept(CarElementVisitor visitor) {
      visitor.visit(this);
    }
}
