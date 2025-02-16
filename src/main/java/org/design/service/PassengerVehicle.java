package org.design.service;

import org.design.strategy.NormalDrive;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
