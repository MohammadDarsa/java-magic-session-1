package web.gdsc.jmlibrary;

import web.gdsc.jmlibrary.car.Car;
import web.gdsc.jmlibrary.car.Chevrolet;
import web.gdsc.jmlibrary.car.Ford;

public class CarFactory {
    public Car getCar(String carType) {
        if(carType.equalsIgnoreCase("ford")) return new Ford();
        else if(carType.equalsIgnoreCase("chevrolet")) return new Chevrolet();
        else return null;
    }
}
