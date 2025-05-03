package DecoratorDesignPattern;

import DecoratorDesignPattern.Topping.ExtraCheese;
import DecoratorDesignPattern.Topping.Mushroom;
import DecoratorDesignPattern.Topping.Paneer;

public class Main {
    public static void main(String[]args){
        Mushroom mushroom=new Mushroom(new ExtraCheese(new Paneer(new VegDelight())));
        System.out.println(mushroom.cost());
    }
}
