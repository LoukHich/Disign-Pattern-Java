import Implementations.Car;
import Implementations.CarElementVisitorImpl;
import Interfaces.CarElementVisitor;

public class Main {

    public static void main(String[] args) {



        Car car = new Car();
        CarElementVisitor carElementVisitor = new CarElementVisitorImpl();
        carElementVisitor.visitCar(car);
    }
}



