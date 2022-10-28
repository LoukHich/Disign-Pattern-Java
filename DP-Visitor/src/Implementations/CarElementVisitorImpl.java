package Implementations;

import Interfaces.CarElement;
import Interfaces.CarElementVisitor;

public class CarElementVisitorImpl implements CarElementVisitor {
    @Override
    public void visit(Wheel wheel) {
        System.out.println("Visiting "+wheel.getName()+"Wheel");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting Engine" );
    }

    @Override
    public void visit(Body body) {
        System.out.println("Visiting Body");
    }

    @Override
    public void visitCar(Car car) {
        System.out.println("Visiting Car");
         for(CarElement elm:car.getCarElements()){
             elm.accept(this);
         }
    }
}
