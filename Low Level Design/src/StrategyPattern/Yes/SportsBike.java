package StrategyPattern.Yes;
import StrategyPattern.Yes.Strategy.DriveStrategy;
import StrategyPattern.Yes.Strategy.Sports;

public class SportsBike extends Vehicle {
    public SportsBike(){
        super(new Sports());
    }
}
