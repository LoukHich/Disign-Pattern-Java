package Implementations;

import Interfaces.CarElement;
import Interfaces.CarElementVisitor;

public class Engine implements CarElement {
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
