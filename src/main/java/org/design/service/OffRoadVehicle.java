package org.design.service;

import org.design.strategy.NormalDrive;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle(){
        super(new NormalDrive());
    }
}
