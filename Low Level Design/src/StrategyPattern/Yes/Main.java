package StrategyPattern.Yes;

public class Main {
    public static void main(String[]args){
        Vehicle mountainBike=new MountainBike();
        mountainBike.drive();
        SportsBike sportsBike=new SportsBike();
        sportsBike.drive();
        Vehicle bus=new Bus();
        bus.drive();
    }
}
