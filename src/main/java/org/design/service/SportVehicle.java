package org.design.service;

import org.design.strategy.SpecialDrive;

public class SportVehicle extends Vehicle {
    public SportVehicle() {
        super(new SpecialDrive());
    }
}
