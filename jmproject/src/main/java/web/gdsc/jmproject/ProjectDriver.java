package web.gdsc.jmproject;

import web.gdsc.jmlibrary.CarFactory;

public class ProjectDriver {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        System.out.println(carFactory.getCar("ford"));
    }
}
