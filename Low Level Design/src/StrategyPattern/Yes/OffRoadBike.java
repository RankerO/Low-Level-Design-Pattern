package StrategyPattern.Yes;

import StrategyPattern.Yes.Strategy.Sports;

public class OffRoadBike extends Vehicle{
OffRoadBike(){
    super(new Sports());
}
}
