package StrategyPattern.Yes;

import StrategyPattern.Yes.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveSt;
    public Vehicle(DriveStrategy x){
        this.driveSt=x;
    }
    public void drive(){
        driveSt.drive();
    }
}
