package com.company;

import collection.CarList;
import core.Car;

public class TestCarList {

    public static void main(String[] args) {
        Car car = new Car("Ford", 2017, 200);
        Car car1 = new Car("Dacia", 2000, 100);
        Car car2 = new Car("BMW", 2020, 340);
        Car car3 = new Car("Opel", 2017, 120);

        CarList list = new CarList(4);

        list.addCar(car);
        list.addCar(car1);
        list.addCar(car2);
        list.addCar(car3);

        var iter = list.getIterator();

        while(iter.hasMoreElements()){
            System.out.println(iter.nextElement().toString());
        }
    }
}
