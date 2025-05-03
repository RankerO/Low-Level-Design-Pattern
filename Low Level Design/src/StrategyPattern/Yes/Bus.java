package StrategyPattern.Yes;

import StrategyPattern.Yes.Strategy.Normal;

public class Bus extends Vehicle{
    Bus(){
        super(new Normal());
    }
}
