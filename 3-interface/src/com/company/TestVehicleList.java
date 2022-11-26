package com.company;

import collection.VehicleIterator;
import collection.VehicleList;
import core.Airplane;
import core.Car;
import core.Vehicle;

public class TestVehicleList {

    public static void main(String[] args){
        Vehicle c1 = new Car("Ford", 2);
        Vehicle c2 = new Car("BMW", 3);
        Vehicle c3 = new Car("Renault", 3);
        Vehicle a1 = new Airplane("Boeing", 2, 70.0f);
        Vehicle a2 = new Airplane("Boeing 446", 1, 77.0f);
        Vehicle a3 = new Airplane("Boeing 886", 3, 69.0f);

        VehicleList list = new VehicleList(6);

        list.addVehicle(c1);
        list.addVehicle(c2);
        list.addVehicle(c3);
        list.addVehicle(a1);
        list.addVehicle(a2);
        list.addVehicle(a3);

        var forwardIterator = list.getForwardIterator();

        while(forwardIterator.hasMoreElements()){
            Vehicle vehicle = forwardIterator.nextElement();
            System.out.println(vehicle.toString());
            vehicle.numberOfWheels();
        }

        var backwardIterator = list.getBackwardIterator();

        while(backwardIterator.hasMoreElements()){
            Vehicle vehicle = backwardIterator.nextElement();
            System.out.println(vehicle.toString());
            vehicle.numberOfWheels();
        }
    }

}
