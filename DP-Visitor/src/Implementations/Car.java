package Implementations;

import Interfaces.CarElement;
import Interfaces.CarElementVisitor;

public class Car  {

    CarElement [] carElements ;
     public Car(){
         this.carElements= new CarElement[] {
                 new Wheel("front left"),
                 new Wheel("front right"),
                 new Wheel("back left"),
                 new Wheel("back right"),
                 new Body(),
                 new Engine()


         };
     }

    public CarElement []  getCarElements(){
        return  carElements;
    }
}
