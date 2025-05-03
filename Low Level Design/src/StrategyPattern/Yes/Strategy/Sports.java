package StrategyPattern.Yes.Strategy;

public class Sports implements DriveStrategy {
    @Override
    public void drive(){
        System.out.println("Special driving skill require");
    }
}
