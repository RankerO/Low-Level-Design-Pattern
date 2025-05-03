package DecoratorDesignPattern.Topping;

import DecoratorDesignPattern.BasePizza;

public class Paneer extends ToppingDecorator {
    BasePizza basePizza;
    public Paneer(BasePizza pizza){
        this.basePizza=pizza;
    }
    @Override
    public int cost(){
        return basePizza.cost()+30;
    }
}
