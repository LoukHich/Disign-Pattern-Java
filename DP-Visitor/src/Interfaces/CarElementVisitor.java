package Interfaces;

import Implementations.Body;
import Implementations.Car;
import Implementations.Engine;
import Implementations.Wheel;

public interface CarElementVisitor {

    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visitCar(Car car);
}
