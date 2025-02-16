package org.design;

import org.design.service.OffRoadVehicle;
import org.design.service.PassengerVehicle;
import org.design.service.SportVehicle;

public class Main {
    public static void main(String[] args) {

        System.out.println("Strategic Design Pattern");
        SportVehicle sportVehicle= new SportVehicle();
        sportVehicle.drive();
        PassengerVehicle passengerVehicle= new PassengerVehicle();
        passengerVehicle.drive();
        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();

    }
}