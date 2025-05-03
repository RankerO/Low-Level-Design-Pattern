package StrategyPattern.Yes.Strategy;

public class Normal implements DriveStrategy {
    @Override
    public void drive(){
        System.out.println("Normal driving");
    }
}
