package StrategyPattern.Yes;

import StrategyPattern.Yes.Strategy.Sports;

public class MountainBike extends Vehicle {
    MountainBike(){
        super(new Sports());
    }
}
