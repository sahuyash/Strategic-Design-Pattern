package org.design.service;

import org.design.strategy.DriveStrategy;

public class Vehicle {

    private final DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
