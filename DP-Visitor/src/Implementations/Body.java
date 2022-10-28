package Implementations;

import Interfaces.CarElement;
import Interfaces.CarElementVisitor;

public class Body implements CarElement {
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
